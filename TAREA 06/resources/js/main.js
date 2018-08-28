

function NaturalNumberFunc(){
    console.log(document.getElementById('nat').value);
    var n = document.getElementById('nat').value;
    var result =(n * (+n+1)) / 2;

    var e = document.getElementById('result');
    e.innerHTML = result;
}
