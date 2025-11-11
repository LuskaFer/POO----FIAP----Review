
class Pessoa {

    String nome;
    int idade;
    String CPF;
    String genero;

    public Pessoa(String nome, int idade, String CPF, String genero) {
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
        this.genero = genero;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.CPF = "NULL";
        this.genero = "NULL";
    }

    public Pessoa(String nome) {
        this.nome = nome;
        this.idade = 0;
        this.CPF = "NULL";
        this.genero = "NULL";
    }

    public Pessoa() {
        this.nome = "NULL";
        this.idade = 0;
        this.CPF = "NULL";
        this.genero = "NULL";
    }

    //Getters e Setters 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método para exibirt informações da pessoa 
    public void exibirInfo() {
        System.out.println(" _______________ -----PESSOA------__________________");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + CPF);
        System.out.println("Genero: " + genero);
        System.out.println(" _______________ -----PESSOA------__________________");
    }

}

//HIERARQUIA
class Aluno extends Pessoa {

    //Atributos
    private String curso;

    //Methosos
    public void setCurso(String curso) {
        curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public Aluno(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
    }

    // Método para exibirt informações do Aluno 
    public void exibirInfo() {
        System.out.println(" _______________ -----ALUNO------__________________");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + CPF);
        System.out.println("Genero: " + genero);
        System.out.println("Curso: " + curso);
        System.out.println(" _______________ -----ALUNO------__________________");
    }

}

//POLIMORFISMO
class Professor extends Pessoa {

    //Atributos
    private String disciplina;

    //Getters e Setters 
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return this.disciplina;
    }

    public Professor(String nome, String disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public void ensinar() {
        System.out.println("O Professor: " + this.nome + " ensina a disciplina: " + this.disciplina);
    }

    // Método para exibirt informações do Aluno 
    public void exibirInfo() {
        System.out.println(" _______________ -----PROFESSOR------__________________");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + CPF);
        System.out.println("Genero: " + genero);
        System.out.println("Curso: " + disciplina);
        System.out.println(" _______________ -----PROFESSOR------__________________");
    }

}

//COMPOSIÇÃO
class Universidade {

    private Aluno aluno;
    private Professor professor;

    public Universidade(Aluno aluno, Professor professor) {
        this.aluno = aluno;
        this.professor = professor;
    }

    public void realizarAula() {
        System.out.println("O Professor: " + this.professor.getNome() + " ministra a disciplina: " + this.professor.getDisciplina() + " para o aluno: " + this.aluno.getNome() + " no curso de: " + this.aluno.getCurso());
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Ola mundo!!!");

        // Pessoa p01 = new Pessoa("Lucas", 28);
        // p01.exibirInfo();
        // Pessoa p02 = new Pessoa("Luskas", 28);
        // p02.exibirInfo();
        // Pessoa p04 = new Professor("Joel", "POO--JAVA");
        // p04.exibirInfo();
        Aluno p03 = new Aluno("Luskafer", "POO--JAVA");
        p03.exibirInfo();

        Professor p05 = new Professor("Joel", "POO--JAVA");
        p05.exibirInfo();

        Universidade universidade = new Universidade(p03, p05);
        universidade.realizarAula();
    }

}
