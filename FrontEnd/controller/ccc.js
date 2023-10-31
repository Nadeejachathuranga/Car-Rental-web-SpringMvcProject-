
    const BASE_URL = "http://localhost:8080/BackEnd_war/";

function regClient(){
     document.getElementById("#regForm").serialize();
    console.log("dfd");
    document.ajax({
        url: BASE_URL + "customer",
        method: "post",
        headers:{
            Auth:"user=admin,pass=admin"
        },
        data: formData,
        success: function (res) {
            alert(res.message);
        },
        error: function (error) {

        }
    });
}
document.getElementById("#sub").click(function () {

      regClient()

});

