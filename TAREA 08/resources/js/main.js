
//TAREA 06 -JAVASCRIPT-
// function NaturalNumberFunc(){
//     console.log(document.getElementById('nat').value);
//     var n = document.getElementById('nat').value;
//     var result =(n * (+n+1)) / 2;

//     var e = document.getElementById('result');
//     e.innerHTML = result;
// }

//TAREA 08 -JQuery-
$(document).ready(function()                                    //Cuando el la pagina esté completamente cargada...
{ 
    $('#btn').click(function()                                    //Se ejecuta la función cuando ocurre el método 'click'
    { 
        console.log('Numeros consecutivos: ' + $('#nat').val());    //Debuggear que el valor esté correcto.
        var n = $('#nat').val();                                        //Pasar valor del input con id = 'nat' a variable 'n'.
        var result = (n * (+n+1)) / 2;                                      //Operación matemática.
        console.log('resultado: ' + result);                                    //Debuggear que el valor esté correcto en consola.
        $('#result').html(result);                                                  //Pasar a etiqueta con id = 'result', mediante equivalente a innerHTML, 
    });                                                                             //el valor de la variable 'result'.
});
                                                                                    
