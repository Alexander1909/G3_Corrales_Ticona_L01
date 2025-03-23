

public class Verificador {
    public static String VerificarRelacion(Rectangulo r1, Rectangulo r2){
        Coordenada a1=r1.getEsquina1();
        Coordenada a2=r1.getEsquina2();
        Coordenada b1=r2.getEsquina1();
        Coordenada b2=r2.getEsquina2();

        double minimo_ax= Math.min(a1.getX(), a2.getX());
        double maximo_ax= Math.max(a1.getX(), a2.getX());
        double minimo_ay= Math.min(a1.getY(), a2.getY());
        double maximo_ay= Math.max(a1.getY(), a2.getY());

        double minimo_bx=Math.min(b1.getX(), b2.getX());
        double maximo_bx=Math.max(b1.getX(), b2.getX());
        double minimo_by=Math.min(b1.getY(), b2.getY());
        double maximo_by=Math.max(b1.getY(), b2.getY());

        if


    }

}
