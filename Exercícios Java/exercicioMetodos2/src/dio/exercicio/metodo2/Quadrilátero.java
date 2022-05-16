package dio.exercicio.metodo2;

public class Quadrilátero {

    public static void area(double lado) {

        System.out.println("A área do quadrado é: " + lado*lado);
    }

    public static void area(double ladoi, double ladoii) {

        System.out.println("A área do retângulo é: " + ladoi*ladoii);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("A área do triângulo é:" + ((baseMaior+baseMenor)*altura)/2);
    }

    public static void area(float diagonali, float diagonalii) {
        System.out.println("A área do losango é: "+ (diagonali+diagonalii)/2);
    }
}
