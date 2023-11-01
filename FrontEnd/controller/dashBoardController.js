const BASE_URL = "http://localhost:8080/BackEnd_war";

$("#canB").click(function (){
    alert("clicked");
    getAllRentReq();

});

function getAllRentReq(){
    $("#tblCustomer").empty();
    $.ajax({
        url: BASE_URL + '/rent',
        method: 'GET',
        dataType: "json",
        success: function (response) {
            let rent = response.data;
            for (let i in rent) {
                let rent = rent[i];
                let id = rent.rentId;
                let name = rent.cusId;
                let carId = rent.carId;
                let days = rent.days;
                let pickday = rent.pickDay;
                let status = rent.status;
                let row = `<tr><td>${id}</td><td>${name}</td><td>${carId}</td><td>${days}</td><td>${pickday}</td><td>${status}</td></tr>`;
                $("#tblCustomer").append(row);
            }
        },
        error: function (error) {
            alert(error.responseJSON.message);
        }
    });

};