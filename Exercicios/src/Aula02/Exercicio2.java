package Aula02;

public class Exercicio2 {
    public static void main(String[] args) {
        Teclado t1 = new Teclado();
        t1.qtd_teclas = 75;
        t1.switchs = "Blue";
        t1.tamanho = "75%";
        t1.tipo = "Mecânico";

        t1.status();
        t1.digitar();

        AulaFaculdade a1 = new AulaFaculdade();
        a1.horário = 19;
        a1.local = "Jabaquara";
        a1.materia = "Programação";
        a1.período = "Noite";

        a1.status();
        a1.dia_da_aula();


    }
}
