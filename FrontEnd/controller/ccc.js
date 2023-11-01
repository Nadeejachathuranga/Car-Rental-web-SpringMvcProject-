
    const BASE_URL = "http://localhost:8080/BackEnd_war";

    $("#sub").click(function () {
  /*  let id=$("#idInputTxt").val();
   let name=$("#nameInputTxt").val();
    let address=$("#addressInputTxt").val();
    let lid=$("#lidInputTxt").val();
    let contact=$("#ContactInputText").val();
    let email=$("#EmailInputText").val();*/

      //  addCus(id,name,address,lid,contact,email);
       // deleting(id);
    alert("fdgfdg")
    });

    function addCus(id,name,address,lid,contact,email){
        $.ajax({
            url: BASE_URL + "/customer?id=&name=&address=&lid=&contact=&email="+id,name,address,lid,contact,email,
            method: 'POST',
            success: function (resp) {
                alert(resp.message);
                return true;
            },
            error: function (error) {
                alert("error");
                return false;
            }
        });
    };



   function deleting(id){
        $.ajax({
            url: BASE_URL + "/customer?id="+id,
            method: 'DELETE',
            success: function (resp) {
                if (resp.message=="delete successfully")
                alert("delete successfully");

            },
            error: function (error) {
                alert("error");
                return false;
            }
        });
   };

/*function regClient(){
     $("#regForm").serialize();
    alert("clicked regform");
    console.log("dfd");
    $.ajax({

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
    alert("final");
}*/


