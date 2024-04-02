import com.example.contasystem.*;

public class Main {

    public static void main(String[] args) {
        Conta conta1 = new Conta("0001", 1000);
        ContaEspecial contaesp1 = new ContaEspecial("0002", 2000, 200);
        ContaInvestimento contaInv1 = new ContaInvestimento("0003", 3000, 0, 03);

        System.out.println("Número da Conta: " + conta1.getNumero());
        System.out.println("Saldo da Conta: " + conta1.getSaldo());
        System.out.println("\nNúmero Conta Especial: " + contaesp1.getNumero());
        System.out.println("Saldo da Conta Especial: " + contaesp1.getSaldo());
        System.out.println("\nNúmero da Conta Investimento: " + contaInv1.getNumero());
        System.out.println("Saldo da Conta Investimento: " + contaInv1.getSaldo());
        System.out.println("---------------------------------");

        conta1.depositar(1000);
//        conta1.sacar(50);
//        contaesp1.depositar(2000);
        contaesp1.sacar(1000);
        contaInv1.depositar(3000);
        contaInv1.sacar(2500);

        System.out.println("Número da Conta: " + conta1.getNumero());
        System.out.println("Depositar: " );
        System.out.println("Saldo atual: " + conta1.getSaldo());

        System.out.println("\nNúmero da Conta: " + contaesp1.getNumero());
        System.out.println("Sacar: " );
        System.out.println("Saldo atual: " + contaesp1.getSaldo());

        System.out.println("\nNúmero da Conta: " + contaInv1.getNumero());
        System.out.println("Sacar: " );
        System.out.println("Saldo atual: " + contaInv1.getSaldo());







    }

}