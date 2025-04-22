package Aula05;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipoConta;
    private String donoConta;
    private float saldoConta;
    private boolean statusConta;

    //Construtor
    public ContaBanco() {
        this.saldoConta = 0;
        this.statusConta = false;
    }

    //Métodos

    public void EstadoAtual() {
        System.out.println("---------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo de conta: " + this.getTipoConta());
        System.out.println("Dono: " + this.getDonoConta());
        System.out.println("Saldo: " + this.getSaldoConta());
        System.out.println("Status: " + this.getStatusConta());
    }

    public void abrirConta(String t) {
        this.setStatusConta(true);
        this.setTipoConta(t);

        if (t == "CC") {
            this.setSaldoConta(50);
        }
        else if (t == "CP") {
            this.setSaldoConta(150);
        }

        System.out.println("Conta aberta com sucesso!");

    }

    public void fecharConta() {

        if (this.getSaldoConta() > 0) {
            System.out.println("Você precisa sacar todo o seu dinheiro para" 
            + " fechar a conta");
        }
        else if (this.getSaldoConta() < 0) {
            System.out.println("Você não consegue fechar sua conta, pois está"
            + "com pendências");
        }
        else {
            this.setStatusConta(false);
            System.out.println("Conta fechda com sucesso!");
        }

    }

    public void depositar(float v) {
        if (this.getStatusConta()) {
            this.setSaldoConta(this.getSaldoConta() + v );
            System.out.println("Depósito realizado com sucesso!");
        }
        else {
            System.out.println("Não é possível realizar o depósito!");
        }
    }

    public void sacar(float v) {
        if(this.getStatusConta()) {
            if (this.getSaldoConta() >= v){
                this.setSaldoConta(this.getSaldoConta() - v);
                System.out.println("Saque realizado com sucesso!");
            }
            else {
                System.out.println("Saldo insuficiente para saque!");
            }
        }
        else {
            System.out.println("Não é possível realizar o saque em uma conta fechada!");
        }

    }

    public void pagarMensal() {
        int v = 0;

        if (this.getTipoConta() == "CC") {
            v = 12;
        }
        else if (this.getTipoConta() == "CP") {
            v = 20;
        }

        if (this.getStatusConta()) {
            this.setSaldoConta(this.getSaldoConta() - v);
            System.out.println("Mensalidade paga com sucesso!");
        }
        else {
            System.out.println("Impossível pagar uma conta fechada!");
        }
    }

    //GET e SET
    public int getNumConta () {
        return this.numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipoConta() {
        return this.tipoConta;
    }

    public void setTipoConta(String t) {
        this.tipoConta = t;
    }

    public String getDonoConta() {
        return this.donoConta;
    }

    public void setDonoConta(String d) {
        this.donoConta = d;
    }

    public float getSaldoConta() {
        return this.saldoConta;
    }

    public void setSaldoConta(float sa) {
        this.saldoConta = sa;
    }

    public boolean getStatusConta() {
        return this.statusConta;
    }

    public void setStatusConta(boolean st) {
        this.statusConta = st;
    }
}
