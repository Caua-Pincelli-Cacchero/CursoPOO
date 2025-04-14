package Aula02;

public class AulaFaculdade {
    String local = "Jabaquara";
    int horário = 19;
    String período = "Noite";
    String materia = "Programação";

    void status () {
        System.out.println("O local da aula é: " + this.local);
        System.out.println("O horário da aula é: " + this.horário);
        System.out.println("O período é: " + this.período);
        System.out.println("A matéria é: " + this.materia);
    } 
    void dia_da_aula() {
        if ((this.local == local) && 
        (this.horário == horário) &&
        (this.período == período) &&
        (this.materia == materia)) {
            System.out.println("Aula marcada com sucesso");
        }
        else {
            System.out.println("Alguma das informações estão incorretas!");
        }
    }
}
