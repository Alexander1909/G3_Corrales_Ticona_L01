import java.util.Scanner;
public class Main {
    public static Rectangulo rectanguloSobre(Rectangulo r1, Rectangulo r2) {
        double minX = Math.max(Math.min(r1.getEsquina1().getX(), r1.getEsquina2().getX()),
            Math.min(r2.getEsquina1().getX(), r2.getEsquina2().getX()));
        double maxX = Math.min(Math.max(r1.getEsquina1().getX(), r1.getEsquina2().getX()),
            Math.max(r2.getEsquina1().getX(), r2.getEsquina2().getX()));

        double minY = Math.max(Math.min(r1.getEsquina1().getY(), r1.getEsquina2().getY()),
            Math.min(r2.getEsquina1().getY(), r2.getEsquina2().getY()));
        double maxY = Math.min(Math.max(r1.getEsquina1().getY(), r1.getEsquina2().getY()),
            Math.max(r2.getEsquina1().getY(), r2.getEsquina2().getY()));

        return (minX < maxX && minY < maxY) ? new Rectangulo(new Coordenada(minX, minY), new Coordenada(maxX, maxY)) : null;

    }

    public static void mostrarRectangulo(Rectangulo r){
        System.out.println(r);
    }

    private static Coordenada leerCoordenada(Scanner sc, String mensaje){
        Scanner sc = new Scanner(System.in);

        Coordenada e1= leerCoordenada(sc,"Ingrese una esquina del 1er rectangulo:");
        Coordenada e2= leerCoordenada(sc, "Ingrese la esquina opuesta del 1er rectángulo:");
        Coordenada e3= leerCoordenada(sc,"Ingrese una esquina del 2do rectángulo:");
        Coordenada e4= leerCoordenada(sc, "Ingrese la esquina opuesta del 2do rectángulo:");

        Rectangulo r1 = new Rectangulo(e1,e2);
        Rectangulo r2 = new Rectangulo(e3, e4);

        mostrarRectangulo(r1);
        mostrarRectangulo(r2);

        String resultado = Verificador.VerificarRelacion(r1, r2);
        System.err.println(resultado);
        

}

