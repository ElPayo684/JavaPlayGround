## Sentencia de control

- Sentencia `if`: Ejecuta un bloque de código si alguna condición es verdadera.
> if(expresion){
    // Ejecuta el bloque de código si cumple la condición.
}

- Sentencia `if/else`: Si la expresión es falsa, se ejecuta otra condición distinta a si la expresión es verdadera.
> if(expresion){
    // Ejecuta el bloque de código si cumple la condición.
}else{
    // Sentencia a ejecutar si no se cumple la condición
}

-Sentencia `Switch case`: Tambien conocida como interruptor, se emplea para realizar sentencias condicionalmente basadas en alguna expresión, de acuerdo al valor de la expresión, se ejecuta la sentencia `case` apropiada.
> switch(variable){
    case valor1: 
        // Ejecuta sentencia 1
        break;
        case valor2: 
        // Ejecuta sentencia 2
        break;
        case valor3: 
        // Ejecuta sentencia 3
        break;
        default:
        // Si no existe coincidencia, se ejecuta esta sentencia default
}

- Sentencia `While`: Ejecuta un bloque de código mientras se cumpla una condición, primero se evalúa la expresión antes de ejecutar cualquier sentencia.

> while(expresion){
    // Ejecuta el bloque de código mientras se cumpla la condición.
}

- Sentencia `Do While`: La expresión se evalúa al final del bucle, se ejecuta al menos una vez.

> do{
    // Ejecuta el bloque al menos una vez
}while(expresion);

- Sentencia `for`: Se emplea cuando se conocen los límites del bucle.

> for(inicializador; condicion; incremento){
    // El bloque de iteracion se ejecuta si cumple la condicion
}