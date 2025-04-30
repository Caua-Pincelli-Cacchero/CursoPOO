package Aula12;

public interface Aula12 {
    public static void main(String[] args) {
        Mamifero m1 = new Mamifero();
        Reptil r1 = new Reptil();
        Peixe p1 = new Peixe();
        Ave a1 = new Ave();
        
        m1.setPeso(35.6f);
        m1.setCorPelo("Marrom");
        m1.alimentar();
        m1.locomover();
        m1.emitirSom();

        a1.locomover();
        p1.locomover();
        r1.locomover();
    }
}
