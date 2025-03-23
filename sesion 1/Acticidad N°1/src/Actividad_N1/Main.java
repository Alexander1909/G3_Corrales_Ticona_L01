import java.util.Scanner;
public class Main {
    public class Principal {
    public static Rectangulo rectanguloSobre(Rectangulo r1, Rectangulo r2) {
        double minX = Math.max(Math.min(r1.getEsquina1().getX(), r1.getEsquina2().getX()),
        Math.min(r2.getEsquina1().getX(), r2.getEsquina2().getX()));
        double maxX = Math.min(Math.max(r1.getEsquina1().getX(), r1.getEsquina2().getX()),
        Math.max(r2.getEsquina1().getX(), r2.getEsquina2().getX()));

        double minY = Math.max(Math.min(r1.getEsquina1().getY(), r1.getEsquina2().getY()),
        Math.min(r2.getEsquina1().getY(), r2.getEsquina2().getY()));
        double maxY = Math.min(Math.max(r1.getEsquina1().getY(), r1.getEsquina2().getY()),
        Math.max(r2.getEsquina1().getY(), r2.getEsquina2().getY()));

