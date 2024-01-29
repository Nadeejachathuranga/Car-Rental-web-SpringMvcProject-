
    const BASE_URL = "http://localhost:8080/BackEnd_war";

    var UserId;
    var UserName;

    var adId;
    var AdName;

    $("#adLoginConformButton").click(function () {
        adId=$("#lgidInputTxt").val()
        adId=$("#lgnameInputTxt").val()
        /*if (id=="005" && name=="nad" ){
            window.location.href="assets/pages/ProfilePage.html";
        }else {
            alert(" failed");
        }*/
        const validity=passwordValidation(adId ,adId);
        if (validity==true){
            window.location.href="assets/pages/dashBoard.html";
        }else {

        };
    });


    $("#sub").click(function () {
   let id=$("#idInputTxt").val();
   let name=$("#nameInputTxt").val();
    let address=$("#addressInputTxt").val();
    let lid=$("#lidInputTxt").val();
    let contact=$("#ContactInputText").val();
    let email=$("#EmailInputText").val();

       addCus(id,name,address,lid,contact,email);
        //deleting(id);
    //alert("fdgfdg")
    });


    $("#LoginConformButton").click(function () {
       UserId=$("#lgidInputTxt").val()
       UserName=$("#lgnameInputTxt").val()
        /*if (id=="005" && name=="nad" ){
            window.location.href="assets/pages/ProfilePage.html";
        }else {
            alert(" failed");
        }*/
       const validity=passwordValidation(UserId ,UserName);
       if (validity==true){
           window.location.href="assets/pages/ProfilePage.html";
       }else {
          const loginModel=document.getElementById("loginErr");
           const loginErrorMsg= document.createElement("h6");
           loginErrorMsg.innerHTML="sorry miss match user name & password";
           loginErrorMsg.style.color="red";
           loginModel.appendChild(loginErrorMsg);
       };
    });


    $("#accBb").click(function () {
        alert("fdgfdghuihiuh")
    });

    $("#vgv").click(function () {
        alert("fdgfdghuihiuh hi hi")
    });

    function addCus(id,name,address,lid,contact,email){
        $.ajax({
            url: BASE_URL + "/customer?id="+id+"&name="+name+"&address="+address+"&lid="+lid+"&contact="+contact+"&email="+email,
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

