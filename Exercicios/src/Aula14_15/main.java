package Aula14_15;

public class main {
    public static void main(String[] args) {
        Video v[] = new Video[3];

        v[0] = new Video("Curso POO 1");
        v[1] = new Video("Curso POO 2");
        v[2] = new Video("Curso POO 3");

        Gafanhoto g[] = new Gafanhoto[2];

        g[0] = new Gafanhoto(18, "Cauã", "M", "K_One");
        g[1] = new Gafanhoto(19, "Danielle", "F", "Danizinha");

        Visualizacao vis[] = new Visualizacao[5]; 
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[0], v[0]);
        vis[1].avaliar(87.0f);
        System.out.println(v[1].toString());

        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
    }
}
