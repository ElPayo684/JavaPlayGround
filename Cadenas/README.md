# Strings

#### ¿Qué son?

- Los strings son objetos de java, del tipo de referencia:
    - `String name = new String("Eddard");`
    - `String topic = new String("Manejo de \"String\"");`
- El tipo `String` tiene una característica especial, permite crear objetos también en la literal entre comillas dobles:
    - `String name = "Eddard";`
    - `String topic = "Manejo de \"String\""`
- Los caracteres de un `String` se codifican empleando Unicode.
- Son inmutables.

#### Concatenar

Sobre las cadenas, se define la operación de concatenar con el operador de suma:

> String name = "Eddard";
String lastName = "Stark";
>
> String fullName = name + " " + lastName;

#### Comparar

- Con el operador relacional de igualdad `==` compara por referencia.
- Con el método `equals()` compara por valor.

> String str1 = "Hello World!";
String str2 = new String("Hello World!");
>
> // Checa si son el mismo objeto:
System.out.println("Son el mismo objeto? " + (str1 == str2))
>
> // Checa si son el mismo valor:
System.out.println("Tienen el mismo valor? " + str1.equals(str2));