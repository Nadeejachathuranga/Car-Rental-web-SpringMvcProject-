//const BASE_URL = "http://localhost:8080/BackEnd_war";

$("#accB").click(function () {
    console.log(gjhkpg);
    alert("ll");
   // getAllRentReq();


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
                let statuss = rent.statuss;
                let row = `<tr><td>${id}</td><td>${name}</td><td>${carId}</td><td>${days}</td><td>${pickday}</td><td>${statuss}</td></tr>`;
                $("#tblCustomer").append(row);
            }
        },

    });

};