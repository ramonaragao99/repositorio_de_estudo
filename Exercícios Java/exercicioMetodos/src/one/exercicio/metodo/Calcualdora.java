package one.exercicio.metodo;

public class Calcualdora {
    public static void soma(double numero1, double numero2){

        double resultado = numero1 + numero2;

        System.out.println("A soma do "+ numero1 + " mais "+ numero2 + " é igual a " + resultado);

    }

    public static void subtracao(double numero1, double numero2) {

        double resultado = numero1 - numero2;

        System.out.println("A subtração do "+ numero1 + " menos " + numero2 + " é igual a " + resultado);

    }

    public static void multiplicacao(double numero1, double numero2) {

        double resultado = numero1 * numero2;

        System.out.println("A multiplicacão do "+ numero1 + " vezes " + numero2 + " é igual a " + resultado);

    }

    public static void divisao(double numero1, double numero2) {

        double resultado = numero1 / numero2;

        System.out.println("A divisão do "+ numero1 + " pelo " + numero2 + " é igual a " + resultado);

    }
}
