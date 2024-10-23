import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String verificacao;
        boolean status = false;

        System.out.println("Qual modelo de carro deseja? (A ou B):");
        String nomeCliente = scanner.nextLine().toUpperCase();
        while (!nomeCliente.equals("A") && !nomeCliente.equals("B")) {
            System.out.println("Entrada inválida. Qual modelo de carro deseja? (A ou B):");
            nomeCliente = scanner.nextLine().toUpperCase();
        }

        System.out.println("Tem cnpj? (SIM ou NAO):");
        verificacao = scanner.nextLine().toUpperCase();
        while (!verificacao.equals("SIM") && !verificacao.equals("NAO")) {
            System.out.println("Entrada inválida. Tem cnpj? (SIM ou NAO):");
            verificacao = scanner.nextLine().toUpperCase();
        }

        if (verificacao.equals("SIM")) {
            status = true;
        }

        Customer cliente = new Customer(nomeCliente, status);
        Factory factory = getFactory(cliente);
        Car car = factory.create(cliente.getGradeRequest());
        car.startEngine();

        scanner.close();
    }

    private static Factory getFactory(Customer cliente) {
        if (cliente.hasCnpjPerson()) {
            return new CnpjFactory();
        } else {
            return new CpfFactory();
        }
    }
}
