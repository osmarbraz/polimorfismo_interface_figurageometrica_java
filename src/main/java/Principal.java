
public class Principal {

    public static void main(String[] args) {

        FiguraGeometrica figuras[] = new FiguraGeometrica[4];
        figuras[0] = new Retangulo("Branco", 2, 5);
        figuras[1] = new Circulo("Amarelo", 2);
        figuras[2] = new Retangulo("Azul", 4, 4);
        figuras[3] = new Circulo("Verde", 3);
        double total = 0;
        for (int i = 0; i <= 3; i++) {
            total = total + figuras[i].getArea();
        }
        System.out.println("Area total e: " + total);
    }
}
