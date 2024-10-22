public class Banco {
    private int conta;
    private int agencia;
    private double saldo;
    private TipoConta tipoConta;

    public Banco(int conta, int agencia, double saldo, TipoConta tipoConta) {
        this.conta = conta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public void calcularRendimento() {
        double rendimento = tipoConta.calcularRendimento(saldo);
        System.out.println(this.saldo);
        this.saldo += rendimento;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public int getConta() {
        return conta;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }
}





