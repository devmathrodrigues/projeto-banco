public enum TipoConta {
    POUPANCA(1, "Poupança") {
        @Override
        public double calcularRendimento(double saldo) {
            return saldo * 0.06;
        }
    },
    CORRENTE(2, "Corrente") {
        @Override
        public double calcularRendimento(double saldo) {
            return 0;
        }
    };

    private int idConta;
    private String descricaoConta;

    TipoConta(int idConta, String descricaoConta) {
        this.idConta = idConta;
        this.descricaoConta = descricaoConta;
    }

    public abstract double calcularRendimento(double saldo);

    public String getDescricao() {
        return descricaoConta;
    }
}

