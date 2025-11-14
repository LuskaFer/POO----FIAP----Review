/* Aula de Classes....

ABSTRATAS->
Classes abstratas são como esqueletos e não são por si só definições, 
não podendo instanciar, sendo usada para outras serem criadas apartir delas... podendo definir futuras implementações em outras classes extendidas
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
+ Utilizado que as abstratas normalmente no mercado -> definir implementações de classes extendidas no futuro 

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


Subsclasses podem sobrepor methodos de seus pais 
Uso da annotation @Override para indicar a sobreposição



Classes Genéricas 

-> tipo de variaveis que são genericas 

public class Lista<T> {
    private T[] elementos;

    public void adicionar(T elemento) {
        // Adicionar elemento a lista
    }


    public T obter(int indice) {
        // Obter elemento da lista
    }

}

    Usar Coleções em Java como: List, Set, Map e Quee;

    Adicionar, remover e acessar elemntos de uma coleção 

    List<String> nomes = new ArrayList<>();

    nomes.add("Alice");
    nomes.add("bob");
    nomes.add("Carlos");

    String primeironome = nomes.get(0);


 -> List 
 -> ArrayList (acesso frequente)
 -> LinkedList (nós encadeados)
 -> Vector (similar ao arraylist porem thread-safe)

 -> Set 
 -> HashSet ( tabelas hash com indices pre definidos)
 -> TreeSet ( implementação baseada em arvore, mantem ordenação e permite comparator personalizado ( bom pra lista enormes ))

 -> Map
 -> HashMap ( baseado em tabela hash, não mantem odem de inserção e acessa rapido baseado em chaves )
 -> TreeMap ( baseada em arvore, ordenação de acordo com comparador, e mantem ordenaco de acordo com a ordem das chaves )
 -> LinkedHashMap

 -> Quee ( são pilhas )
 -> LinkedList (consegue inserir e remover (eficientemente) da cabeça e calda, implementa usando uma lista duplamente encadeada )
 -> PriorityQueue
 -> ArrayDeque

adicionando uma linha para aparecer q commitei hj 
 */

public class Classes {

}
