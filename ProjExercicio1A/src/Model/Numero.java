package Model;

public class Numero {
    // Atributos
    private int numero;

    // Acessores
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Construtor
    public Numero(int numero) {
        this.numero = numero;
    }

    // METODOS
    public int calcularSomatorio() {
        int cont = 1;
        int acum = 0;

        // Loop
        do {
            acum += cont;
            cont++;
        }
        while (cont <= this.numero);

        // Retorno
        return acum;
    }

    public int calcularFatorial() {
        int cont = this.numero;
        int acum = 1;

        do {
            acum = acum * cont;
            cont--;
        }
        while (cont >= 1);

        return acum;
    }

    public int contarPares() {
        int cont = 1;
        int acum = 0;

        while (cont <= this.numero) {
            if (cont % 2 == 0) {
                acum++;
            }
            cont++;
        }
        return acum;
    }

    public int contarImpares() {
        int cont = 1;
        int acum = 0;

        while (cont <= this.numero) {
            if (cont % 2 != 0) {
                acum++;
            }
            cont++;
        }
        return acum;
    }

    // toString
    @Override
    public String toString() {
        return "Número informado: " + numero;
    }
}
