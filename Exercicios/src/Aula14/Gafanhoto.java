package Aula14;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;

    public Gafanhoto(int idade, String nome, String sexo, String login) {
        super(idade, nome, sexo);
        this.login = login;
        this.totAssistido = 0; 
    }

    public void viuMaisUm() {
        this.totAssistido += 1;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Gafanhoto{");
        sb.append("login=").append(login);
        sb.append(", totAssistido=").append(totAssistido);
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }

    
}
