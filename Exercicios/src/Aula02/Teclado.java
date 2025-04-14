package Aula02;

public class Teclado {
    int qtd_teclas;
    String tamanho;
    String tipo;
    String switchs;

    void status() {
        System.out.println("Quantidade de teclas: " + this.qtd_teclas);
        System.out.println("Tamanho do teclado: " + this.tamanho);
        System.out.println("Tipo do teclado: " + this.tipo);
        System.out.println("Cor dos switchs: " + this.switchs);
    }

    void digitar() {
        System.out.println("Estou pronto para digitar!");
    }
}