public class Principal {
    public static void main(String[] args) {
        Banco banco1 = new Banco();
        banco1.agencia = 3268;
        banco1.conta = 108677;
        banco1.saldo = 5988.75;

        Banco banco2 = new Banco();
        banco2.agencia = 2837;
        banco2.conta = 586221;
        banco2.saldo = 10500.25;

        System.out.println("Agência: "+banco1.agencia +"\nConta: "+banco1.conta +"\nSaldo: "+banco1.saldo);
        System.out.println("---------------");
        System.out.println("Agência: "+banco2.agencia +"\nConta: "+banco2.conta +"\nSaldo: "+banco2.saldo);
    }
}
