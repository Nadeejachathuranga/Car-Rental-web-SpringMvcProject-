const BASE_URL = "http://localhost:8080/BackEnd_war";
function getAllRequest() {
    alert("hii");
   const userId=$("#userIDInProfilPage").val();
   const requestDivisionDiv=document.getElementById("requestDivision");
    $.ajax({
        url: BASE_URL + '/rent',
        method: 'GET',
        dataType: "json",
        success:function (response) {
                let res=response.data;
                    alert("res");
            for (let i in res) {
                    let resp=res[i];
                if (resp.cusId==userId){
                    let rentId=resp.rentId;
                    let carId=resp.carId;
                    let days=resp.days;
                    let pickDay=resp.pickDay;
                    let statuss=resp.statuss;

                    const requestBox=document.createElement("div");
                    const rentIdDiv=document.createElement("h6");
                    rentIdDiv.innerHTML=rentId;
                    requestBox.appendChild(rentIdDiv);
                    const carIdDiv=document.createElement("h6");
                    carIdDiv.innerHTML=carId;
                    requestBox.appendChild(carIdDiv);
                    const daysDiv=document.createElement("h6");
                    daysDiv.innerHTML=days;
                    requestBox.appendChild(daysDiv);
                    const pickDayDiv=document.createElement("h6");
                    pickDayDiv.innerHTML=pickDay;
                    requestBox.appendChild(pickDayDiv);
                    const statussDiv=document.createElement("h6");
                    statussDiv.innerHTML=statuss;
                    requestBox.appendChild(statussDiv);
                    requestDivisionDiv.appendChild(requestBox);
                }
            }
        },
        error:function (error) {
            alert("Something went wrong");
        }
    })
}