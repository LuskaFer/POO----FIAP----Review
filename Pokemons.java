
import java.lang.Math;

interface Pokemon {

    int getNivel();

    String ataque();

    String getTipo();

}

class Pikachu implements Pokemon {

    protected int nivel;

    //niveis de acesso
    private int nivelPrivate;
    protected int nivelProtected;
    public int nivelPublic;

    public Pikachu() {
        this.nivel = 1;
        this.nivelPublic = 1;
        this.nivelProtected = 1;
        this.nivelPrivate = 1;
    }

    public Pikachu(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return this.nivel;
    }

    public int getNivelPrivate() {
        return this.nivelPrivate;
    }

    public int setNivel(int nivel) {
        this.nivel = nivel;
        return this.nivel;
    }

    public int aumentarNivel(int nivel) {
        if (this.nivel < nivel) {
            this.nivel = nivel;
        }
        return this.nivel;
    }

    public String ataque() {
        return "Choque do trovão ! Nivel: "
                + this.nivel + " n.normal "
                + this.nivelPublic + " n.publico "
                + this.nivelProtected + " n.protected "
                + this.nivelPrivate + " n.private ";
    }

    public String getTipo() {
        return "Pedra";
    }
}

//Override
class Raichu extends Pikachu {

    @Override // explicitamente sobrescrevendo outro ataque(). 
    public String ataque() {
        return "Choque do raio ! Nivel: " + this.nivel + " n.normal "
                + this.nivelPublic + " n.publico "
                + this.nivelProtected + " n.protected "
                + this.getNivelPrivate() + " n.private ";
    }

    public void subirDeNivel() {
        this.setNivel(this.getNivel() + 1);
    }

    public void subirDeNivel(int novoNivel) {
        this.aumentarNivel(novoNivel);
    }

    public void subirDeNivel(double novoNivel) {
        int nivel = (int) Math.ceil(novoNivel);
        this.aumentarNivel(nivel);
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

        Pikachu pikachuForte = new Pikachu(30);
        System.out.println(pikachuForte.ataque());

        pikachuForte.nivelPublic = -99;
        pikachuForte.nivelProtected = -99;
        // pikachuForte.nivelPrivate = -99;

        System.out.println(pikachuForte.ataque());
        System.out.println(pikachu.ataque());

        Raichu raichu = new Raichu();
        System.out.println(raichu.ataque());

        // raichu.subirDeNivel();
        // System.out.println(raichu.ataque());
        // raichu.subirDeNivel(30);
        // System.out.println(raichu.ataque());
        // raichu.subirDeNivel(30.001);
        // System.out.println(raichu.ataque());
        // Agumon agumon = new Agumon(20);
        // System.out.println(agumon.ataque());
    }

}
