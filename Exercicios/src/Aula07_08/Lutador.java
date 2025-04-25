package Aula07_08;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no, String na, int id, double al, double pe, int vi, int de, int em) {
        nome = no;
        nacionalidade = na;
        idade = id;
        altura = al;
        setPeso(pe);
        vitorias = vi;
        derrotas = de;
        empates = em;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(int a) {
        this.altura = a;
    }

    String getCategoria() {
        return this.categoria;

    }

    private void setCategoria() {
        if (this.peso < 52.2f) {
            this.categoria = "Inválido";
        }
        else if (this.peso <= 70.3f) {
            this.categoria = "Leve";
        }
        else if (this.peso <= 83.9f) {
            this.categoria = "Médio";
        }
        else if (this.peso <=120.2f) {
            this.categoria = "Pesado";
        }
        else{
            this.categoria = "Inválido";
        }
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double p) {
        this.peso = p;
        setCategoria();
    }


    public int getVitorias() {
        return this.vitorias;
    }

    public void setVitorias(int v) {
        this.vitorias = v;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setDerrotas(int d) {
        this.derrotas = d;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setEmpates(int e) {
        this.empates = e;
    }

    public void apresentar() {
        System.out.println("------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome() +
        " DIRETAMENTE DO(A) " + this.getNacionalidade() + " com " + this.getIdade() +
        " anos e " + this.getAltura() + " metros " + " pesando " + this.getPeso() + 
        " Kg " + this.getVitorias() + " vitórias " + this.getDerrotas() + " derrotas " +
        " empates " + this.getEmpates());
    }

    public void status() {
        System.out.println("-------------------------------------------");
        System.out.println(this.getNome() + " é um peso " + this.getCategoria() +
        "\n" + "Ganhou: " + this.getVitorias() + "\n" + "Perdeu " + this.getDerrotas() +
        "\n" + "Empatou " + this.getEmpates());
    }

    public void ganharLuta() {
        this.setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(getDerrotas() + 1);
    }
    
    public void empatarLuta() {
        this.setEmpates(getEmpates() + 1);
    }
    
}
