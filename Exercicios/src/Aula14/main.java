package Aula14;

public class main {
    public static void main(String[] args) {
        Video v[] = new Video[3];

        v[0] = new Video("Curso POO 1");
        v[1] = new Video("Curso POO 2");
        v[2] = new Video("Curso POO 3");

        Gafanhoto g[] = new Gafanhoto[2];

        g[0] = new Gafanhoto(18, "Cauã", "M", "K_One");
        g[1] = new Gafanhoto(19, "Danielle", "F", "Danizinha");

        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
    }
}
