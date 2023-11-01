const BASE_URL = "http://localhost:8080/BackEnd_war";

$("#CanB").click(function (){
    getAllRentReq();
});

function getAllRentReq(){
    $("#tblCustomer").empty();
    $.ajax({
        url: BASE_URL + '/rent',
        method: 'GET',
        dataType: "json",
        success: function (response) {
            let customers = response.data;
            for (let i in customers) {
                let cus = customers[i];
                let id = cus.id;
                let name = cus.name;
                let address = cus.address;
                let salary = cus.salary;
                let row = `<tr><td>${id}</td><td>${name}</td><td>${address}</td><td>${salary}</td></tr>`;
                $("#tblCustomer").append(row);
            }
        },
        error: function (error) {
            alert(error.responseJSON.message);
        }
    });

};