const BASE_URL = "http://localhost:8080/BackEnd_war";

var carid;

function findGeneralCars(){
    $("#tblCustomer").empty();
    $.ajax({
        url:BASE_URL+"/car",
        method:'GET',
        success:function (resp) {
            let cars = resp.data;
            for (let i in cars) {
                let car = cars[i];
                if (car.type=="GENERAL") {
                      carid=car.id;
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
        error:function (error) {
            alert("error");
        }
    })

    function selectRow() {
        let name;
        $('#tblCustomer>tr').click(function () {
            carId = $(this).children().eq(0).text();
            name = $(this).children().eq(1).text();
            document.getElementById("carId").innerHTML = carId;
            document.getElementById("carName").innerHTML = name;
        })
    }
}