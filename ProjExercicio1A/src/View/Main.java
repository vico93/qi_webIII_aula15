package View;

import Model.Numero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int numero = 1;
        do {
            if (numero <= 0) System.out.println("[ERRO] Valor INVÁLIDO! Tente novamente!");
            System.out.print("Digite o número desejado: ");
            numero = stdin.nextInt();
        }
        while (numero <= 0);

        Numero n1 = new Numero(numero);

        System.out.println(n1);
        System.out.println("Somatório: " + n1.calcularSomatorio());
        System.out.println("Fatorial: " + n1.calcularFatorial());
        System.out.println(n1.contarPares() + " pares");
        System.out.println(n1.contarImpares() + " ímpares");
    }
}
