# lab1

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
```
mvn compile
```

### Run
```
mvn exec:java -Dexec.mainClass="FizzBuzz"
```
