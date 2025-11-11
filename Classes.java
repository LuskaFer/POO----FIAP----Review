/* Aula de Classes....

ABSTRATAS->
Classes abstratas são como esqueletos e não são por si só definições, 
não podendo instanciar, sendo usada para outras serem criadas apartir delas...
Utiliza métodos abstratos | Exemplo: n tem como instanciar um animal... apenas um cachorro ou rato por exemplo... 

Exemplo:

public abstract class Animal {
    public abstract void emitirSom();
}

public class Cachorro extends Animal {
    public void emitirSom() {
    System.out.println("Au, Au!");
    }
}


INTERFACES->
Definição de interfaces + Implementação de interfaces por classes. 
+ Utilizado que as abstratas normalmente no mercado

Exemplo:

public interface Veiculo {
    void acelerar();
    void frear();
}

public class Carro implements Veiculo {
    public void acelerar(){
        System.out.println("Carro acelerando...");
    }
    public void frear(){
        System.out.println("Carro freando....");
    }

}


*/
