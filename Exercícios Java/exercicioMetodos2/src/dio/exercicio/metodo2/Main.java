package dio.exercicio.metodo2;

public class Main {
    public static void main(String[] args) {
        System.out.println( "\nExércicio quadrilátero\n"); //com sobrecargas

        Quadrilátero.area(2);
        Quadrilátero.area(5, 2, 2);
        Quadrilátero.area(5d,3d);
        Quadrilátero.area(5f,3f);
    }
}
