
public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;

    public Rectangulo(Coordenada esquina1, Coordenada esquina2){
        this.esquina1=esquina1;
        this.esquina2=esquina2;
    }

    public Coordenada getEsquina1(){
        return esquina1;
    }

    public Coordenada getEsquina2(){
        return esquina2;
    }

    public double calculoArea(){
        double base =Math.abs(esquina2.getX() - esquina1.getX());
        double altura=Math.abs(esquina2.getY() - esquina2.getY());
        return base*altura;
    }

    @Override
    public String toString(){
        return "Rectangulo = ( " + esquina1 + "," + esquina2 + ")";
    }

}
