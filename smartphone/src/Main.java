import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone("Meu-Dispositivo", "35 98817-9182", "12345");
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("----------------------------------");
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Ligar o smartphone");
            System.out.println("2. Desligar o smartphone");
            System.out.println("3. Conectar à internet");
            System.out.println("4. Desconectar da internet");
            System.out.println("5. Aumentar volume");
            System.out.println("6. Diminuir volume");
            System.out.println("7. Avançar estação de rádio");
            System.out.println("8. Fazer uma ligação");
            System.out.println("9. Atender uma ligação");
            System.out.println("10. Pesquisar na internet");
            System.out.println("11. Exibir estado do smartphone");
            System.out.println("12. Sair");
            System.out.println("----------------------------------");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    meuIphone.meuSmartphone.liga();
                    System.out.println("Smartphone ligado.");
                    break;
                case 2:
                    meuIphone.meuSmartphone.desliga();
                    System.out.println("Smartphone desligado.");
                    break;
                case 3:
                    meuIphone.meuSmartphone.conecta();
                    System.out.println("Conectado à internet.");
                    break;
                case 4:
                    meuIphone.meuSmartphone.desconecta();
                    System.out.println("Desconectado da internet.");
                    break;
                case 5:
                    meuIphone.meuSmartphone.aumentaVolume();
                    System.out.println("Volume aumentado.");
                    break;
                case 6:
                    meuIphone.meuSmartphone.diminuiVolume();
                    System.out.println("Volume diminuído.");
                    break;
                case 7:
                    meuIphone.meuSmartphone.avancaEstacaoRadio();
                    System.out.println("Estação de rádio avançada.");
                    break;
                case 8:
                    System.out.print("Digite o número para ligar: ");
                    String numeroParaLigar = scanner.nextLine();
                    meuIphone.meuSmartphone.fazerLigacao(numeroParaLigar);
                    break;
                case 9:
                    System.out.print("Digite o número da ligação recebida: ");
                    String numeroParaAtender = scanner.nextLine();
                    meuIphone.meuSmartphone.atenderLigacao(numeroParaAtender);
                    break;
                case 10:
                    System.out.print("Digite o termo para pesquisar na internet: ");
                    String pesquisa = scanner.nextLine();
                    meuIphone.meuSmartphone.pesquisaInternet(pesquisa);
                    break;
                case 11:
                    System.out.println("Estado do smartphone:");
                    meuIphone.exibirEstadoIphone();
                    break;
                case 12:
                    continuar = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
