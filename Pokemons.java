
interface Pokemon {

    int getNivel();

    String ataque();

    String getTipo();

}

class Pikachu implements Pokemon {

    public int nivel;

    public Pikachu() {
        this.nivel = 1;
    }

    public Pikachu(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return this.nivel;
    }

    public String ataque() {
        return "Choque do trovão ! Nivel: " + this.nivel;
    }

    public String getTipo() {
        return "Pedra";
    }
}

class Raichu extends Pikachu {

    public String ataque() {
        return "Choque do raio ! Nivel: " + this.nivel;
    }
}

abstract class Digimon {

    public abstract int getNivel();

    public abstract String ataque();

    public abstract String getTipo();
}

class Agumon extends Digimon {

    private int nivel;

    public Agumon() {
        this.nivel = 1;
    }

    public Agumon(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return this.nivel;
    }

    public String ataque() {
        return "Chama nenem ! Nivel: " + this.nivel;
    }

    public String getTipo() {
        return "Pedra";
    }
}

public class Pokemons {

    public static void main(String[] args) {

        Pikachu pikachu = new Pikachu(5);

        System.out.println(pikachu.ataque());

        Agumon agumon = new Agumon(20);
        System.out.println(agumon.ataque());

    }

}
