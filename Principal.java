public class Principal {
    
    public static void main(String[] args){

        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(2230);
        conta.setTitular("Leonardo Valle");
        conta.setSaldo(100);

        System.out.println("Saldo atual: "+conta.getSaldo());

        conta.depositaValor(500);

        System.out.println("Saldo atual: "+conta.getSaldo());

        conta.sacaValor(700);
        System.out.println("Saldo atual: "+conta.getSaldo());
    }


}
