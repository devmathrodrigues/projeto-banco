public class Principal {
    public static void main(String[] args) {
        Banco banco1 = new Banco(4581, 834592, 430.00, TipoConta.POUPANCA);
        Banco banco2 = new Banco(2441, 634093, 2000.00, TipoConta.CORRENTE);

        banco1.calcularRendimento();

        System.out.println("Agência: " + banco1.getAgencia() +
                "\nConta: " + banco1.getConta() +
                "\nSaldo: " + banco1.getSaldo() +
                " (Tipo: " + banco1.getTipoConta().getDescricao() + ")");

        System.out.println("---------------");

        System.out.println("Agência: " + banco2.getAgencia() +
                "\nConta: " + banco2.getConta() +
                "\nSaldo: " + banco2.getSaldo() +
                " (Tipo: " + banco2.getTipoConta().getDescricao() + ")");
    }
}

