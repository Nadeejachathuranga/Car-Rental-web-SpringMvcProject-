const BASE_URL = "http://localhost:8080/BackEnd_war";

var carid;

// pick up days calculate value
var year="";
var month="";
var day="";
var pickupDay;

// total rent days calculate value
var rTDays;



///////////////////////////////////////////////////
// set pick up year functions
$("#yearSelect").click(function (){
    year= $("#yearSelect").val()
    pickupDay=year+"/"+month+"/"+day;
    document.getElementById("pickupday").innerHTML=pickupDay;
})

// set pick up month functions
$("#monthSelect").click(function (){
    month= $("#monthSelect").val()
    pickupDay=year+"/"+month+"/"+day;
    document.getElementById("pickupday").innerHTML=pickupDay;
})

// set pick up day functions
$("#daySelect").click(function (){
    day= $("#daySelect").val()
    pickupDay=year+"/"+month+"/"+day;
    document.getElementById("pickupday").innerHTML=pickupDay;
  //  pickDateValidation(pickupDay,carid);
})


///////////////////////////////////////////////////
// set total rent days functions
$("#daysSelect").click(function (){
    rTDays=$("#daysSelect").val()
    document.getElementById("rentdays").innerHTML=rTDays+" days";
})


function findGeneralCars() {
    $("#tblCustomer").empty();
    $.ajax({
        url: BASE_URL + "/car",
        method: 'GET',
        success: function (resp) {
            let cars = resp.data;
            for (let i in cars) {
                let car = cars[i];
                if (car.type == "GENERAL") {
                    carid = car.id;
                    let name = car.name;
                    let brand = car.brand;
                    let colour = car.color;
                    let fuel = car.fuel;
                    let passe = car.noOfPassengers;
                    let pek = car.priceExtraKm;
                    let pd = car.rate;
                    let reg = car.regNo;
                    let row = `<tr><td>${carid}</td><td>${name}</td><td>${brand}</td><td>${colour}</td><td>${fuel}</td><td>${passe}</td><td>${pek}</td><td>${pd}</td><td>${reg}</td></tr>`;
                    $("#tblCustomer").append(row);
                }
            }
            selectRow();
        },
        error: function (error) {
            alert("error");
        }
    })
}
    function selectRow() {
        let name;
        $('#tblCustomer>tr').click(function () {
            carId = $(this).children().eq(0).text();
            name = $(this).children().eq(1).text();
            document.getElementById("carId").innerHTML = carId;
            document.getElementById("carName").innerHTML = name;
        })
    }

 $("#conform").click(function () {
     var userId=$("#idInputTxt").val()
     rentRequest(userId);
 })

function rentRequest(userId){
    let id="rent115";
    let status="pending";
    $.ajax({
        url: BASE_URL + "/rent?rentId="+id+"&cusId="+userId+"&carId="+carId+"&days="+rTDays+"&pickDay="+pickupDay+"&statuss="+status,
        method: 'POST',
        success: function (response) {
            let res=response.state
            if (res=="Ok"){
                alert("Request send successfully");
            }
        },
        error: function (error) {
            alert("Something went wrong");
        }
    });
};

function pickDateValidation(pickupDay){
    $.ajax({
        url: BASE_URL + "/rent",
        method: 'GET',
        success: function (resp) {
            let res=resp.data;
            for (let i in res) {
                let rent = res[i];
                if (rent.statuss=="Accept"){
                    if (rent.pickDay==pickupDay){
                        document.getElementById("errorMsg").innerHTML="Sorry this date already book";
                        document.getElementById("conform").disabled = true;
                    }else {
                        document.getElementById("errorMsg").innerHTML="";
                        document.getElementById("conform").disabled = false;
                    }
                }
             /*   if(rent.carId == "car002") {
                   alert(carid)
                   if (rent.statuss == "Accept") {
                       document.getElementById("errorMsg").innerHTML = "found";
                   }else {
                       document.getElementById("errorMsg").innerHTML = "cant find";
                   }
                }*/
            }
        },
        error:function (error) {
            alert("Something went wrong");
        },
    });
}