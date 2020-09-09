# CS2901 - Lab1

## Objetivos
Al finalizar este laboratorio, estarás en la capacidad de:
- Familiarizarse con el lenguaje de programación ```JAVA```
- Gestionar dependencias utilizando maven (nivel 2).
- Comprender la importancia de la calidad de software (nivel 1)


## Instrucciones
Implementa la función  	`public  static List<String> calculate(int n)` 

Dado un número n, para cada número **i** entero entre 1 y n (inclusivo), agrega a un lista de acuerdo a lo siguiente:

- Si **i** es múltiplo de 3 y 5, agrega **FizzBuzz**.
- Si **i** es múltiplo de 3 pero no de 5, agrega **Fizz**.
- Si **i** es múltiplo de 5 pero no de 3, agrega **Buzz**.
- Si **i** no es múltiplo de 3 y tampoco de 5, agrega **i**.

```
public class FizzBuzz {

    public  static List<String> calculate(int n){
        List<String> list = new ArrayList<String>();
        //TODO add your code here
        return list;
    }
}
```
  
## Ten en cuenta lo siguiente
### Build
Este comando te permite construir la aplicación compilando el codigo fuente del proyecto

```
mvn compile
```

### Run
Usando este comando podrás ejecutar la aplicación construída en el punto anterior.
```
mvn exec:java -Dexec.mainClass="FizzBuzz"
```
