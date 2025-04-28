package Aula09;

public class Exercicio {    
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[2];

        p[0] = new Pessoa("Cauã", 18, "M");
        p[1] = new Pessoa("Danielle", 19, "F");

        l[1] = new Livro("Entendendo algorítimos", "Não sei", 380, p[0]);
        l[2] = new Livro("Introdução ao direito", "Não sei", 500, p[1]);

        p[0].fazerAniver(24, 07, 2006);
        System.out.println(l[0].detalhes());
    }
    
}
