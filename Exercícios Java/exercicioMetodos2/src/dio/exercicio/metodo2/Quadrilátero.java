package dio.exercicio.metodo2;

public class Quadrilátero {
    public static void area(double lado) {
        System.out.println("A área do quadrado é: " + lado*lado);
    }

    public static void area(double lado1, double lado2) {
        System.out.println("A área do retângulo é: " + lado1*lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("A área do triângulo é:" + ((baseMaior+baseMenor)*altura)/2);
    }

    public static void area(float diagonal1, float diagonal2) {
        System.out.println("A área do losango é: "+ (diagonal1+diagonal2)/2);
    }
}
