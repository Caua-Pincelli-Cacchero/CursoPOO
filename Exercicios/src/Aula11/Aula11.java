package Aula11;

public class Aula11 {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();

        a1.setNome("Cauã");
        a1.setIdade(18);
        a1.setMatricula(11111);
        a1.setCurso("ADS");
        a1.setSexo("M");

        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();

        b1.setMatricula(11112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        
        b1.pagarMensalidade();

        Professor p1 = new Professor();

        p1.setNome("Cláudio");
        p1.setEspecialidade("Java");
        p1.setIdade(45);
        p1.setSalario(3000);
        p1.setSexo("M");

        p1.receberAumento();    
        System.out.println(p1.toString());

        Tecnico t1 = new Tecnico();

        t1.setNome("João");
        t1.setIdade(19);
        t1.setCurso("ADS");
        t1.praticar();
    }
}
