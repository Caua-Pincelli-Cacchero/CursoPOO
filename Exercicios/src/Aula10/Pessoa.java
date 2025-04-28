package Aula10;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public void fazerAniver(int dia, int mes, int ano) {
        this.idade += 1;

        System.out.println(this.nome + " faz " + this.idade + " anos." + "\n" + 
        "No dia " + dia + " no mês " + mes + " no ano " + ano);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome = " + ", idade = " + idade + ", sexo = " + sexo + "}";
    }
}
