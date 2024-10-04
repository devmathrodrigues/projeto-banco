public class Principal {
    public static void main(String[] args) {
        Banco banco1 = new Banco();
        banco1.setAgencia(4581);
        banco1.setConta(834592);
        banco1.setSaldo(430.00);

        Banco banco2 = new Banco();
        banco2.setAgencia(2441);
        banco2.setConta(634093);
        banco2.setSaldo(2000.00);

        System.out.println("Agência: "+banco1.getAgencia() +"\nConta: "+
                banco1.getConta() +"\nSaldo: "+banco1.getSaldo());

        System.out.println("---------------");

        System.out.println("Agência: "+banco2.getAgencia() +"\nConta: "+
                banco2.getConta() +"\nSaldo: "+banco2.getSaldo());
    }
}
