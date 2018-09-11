function checkLength(){
    var textbox = document.getElementById("inputUsername");
    if(textbox.value.length <= 10 && textbox.value.length >= 5){
        alert("success");
    }
    else{
        alert("make sure the input is between 5-10 characters long")
    }
}