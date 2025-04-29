package Aula11;

public class Professor extends Pessoa {
    private String especialidade;
    private int salario;

    public void receberAumento() {
        this.salario += 500;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dados{");
        sb.append("especialidade=").append(especialidade);
        sb.append(", salario=").append(salario);
        sb.append('}');
        return sb.toString();
    }
}
