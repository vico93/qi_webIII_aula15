package View;

import Model.Numero;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int numero;
        do {
            System.out.print("Digite o número desejado: ");
            numero = stdin.nextInt();
            if (numero <= 0) System.out.println("[ERRO] Valor INVÁLIDO! Tente novamente!");
        }
        while (numero <= 0);

        Numero n1 = new Numero(numero);

        byte menu;
        do {
            System.out.println("\n\n\n\n\n\n\n");
            System.out.println("Escolha\n" +
                    "1 - Alterar número\n" +
                    "2 - Ver número digitado\n" +
                    "3 - Ver Somatório do nº\n" +
                    "4 - Ver Se é Par Ou Ímpar\n" +
                    "5 - Ver Se é Pos - Neg ou Nulo\n" +
                    "6 - Extrair Raiz Quadrada\n" +
                    "7 - Calcular Dobro do Nº\n" +
                    "8 - Calcular Tabuada do Nº\n" +
                    "0 - Sair");

            menu = stdin.nextByte();

            System.out.println("\n");

            switch (menu) {
                case 1:
                    do {
                        System.out.println("--EDITANDO--");
                        System.out.print("Digite o número desejado: ");
                        numero = stdin.nextInt();
                        if (numero <= 0) System.out.println("[ERRO] Valor INVÁLIDO! Tente novamente!");
                    }
                    while (numero <= 0);
                    n1.setNumero(numero);
                    System.out.println("Editado com SUCESSO!");
                    break;
                case 2:
                    System.out.println("--VISUALIZANDO--");
                    System.out.println(n1);
                    break;
                case 3:
                    System.out.println("--SOMATÓRIO--");
                    System.out.println(n1.calcularSomatorio());
                    break;
                case 4:
                    System.out.println("--PAR OU IMPAR?--");
                    System.out.println(n1.verSeEParOuImpar());
                    break;
                case 5:
                    System.out.println("--POSITVO/NEGATIVO--");
                    System.out.println(n1.VerSeONumeroEPositivoNegativoOuNulo());
                    break;
                case 6:
                    System.out.println("--RAIZ QUADRADA--");
                    System.out.println(n1.calcularRaizQuadradaDoNumero());
                    break;
                case 7:
                    System.out.println("--CALCULAR DOBRO--");
                    System.out.println(n1.calcularDobroDoNumero());
                    break;
                case 8:
                    System.out.println("--TABUADA--");
                    System.out.println(n1.calcularTabuadaDoNumero());
                    break;
                default:
                    if (menu != 0) System.out.println("OPÇÃO INVÁLIDA!");
            }
            System.out.print("Pressione ENTER para continuar/sair...");
            try {
                System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        while (menu != 0);
    }
}
