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

    public String verSeEParOuImpar() {
        if (this.numero % 2 == 0) {
            return "Par";
        }
        else {
            return "Ímpar";
        }
    }

    public String VerSeONumeroEPositivoNegativoOuNulo() {
        if (this.numero <= 0) {
            return "Positivo";
        }
        else {
            return "Negativo";
        }
    }

    public double calcularRaizQuadradaDoNumero() {
        return Math.sqrt(this.numero);
    }

    public double calcularDobroDoNumero() {
        return this.numero * 2;
    }

    // Não entendi o pq do retorno de int, pra mim tabuada seria a string inteira (ver como fica no retorno)
    public String calcularTabuadaDoNumero() {
        String tabuadaCompleta = "";

        for (int i = 1; i < 10; i++) {
            tabuadaCompleta += "\n" + this.numero + "x" + i + "= " + (this.numero * i);
        }

        return tabuadaCompleta;
    }

    // toString
    @Override
    public String toString() {
        return "Número informado: " + numero;
    }
}
