import java.util.*;

public class Coordenada {
    private double x;
    private double Y;

    public Coordenada(){
        this.x=0;
        this.y=0;

    }

    public Coordenada( double x, double y){
        this.x=x;
        this.y=y;
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    public void setX(double x){
        this.x=x;
    }

    public void setY(double y){
        this.y=y;
    }

    @Override

    public String toString(){
        return "[" + x + "," + y + "]";

    }

    
}
