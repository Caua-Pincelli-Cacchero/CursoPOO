package Aula05;

public class Aula05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111111);
        p1.setDonoConta("Cauã");
        p1.abrirConta("CC");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222222);
        p2.setDonoConta("Danielle");
        p2.abrirConta("CP");
        
        p1.depositar(300);
        p2.depositar(500);
        p2.sacar(1000);
        p1.sacar(350);
        p1.fecharConta();

        p1.EstadoAtual();
        p2.EstadoAtual();
    }
}
