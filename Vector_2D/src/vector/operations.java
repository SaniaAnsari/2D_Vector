package vector;

public class operations {
    public static Vector add(Vector v1,Vector v2){
        return new Vector(v1.getX()+v2.getX(),v1.getY()+v2.getY());
    }
    public static Vector subtract(Vector v1,Vector v2){
        return new Vector(v1.getX()+v2.getX(),v1.getY()+v2.getY());
    }
    public static float DotProduct(Vector v1,Vector v2 ){
        return (v1.getX()*v2.getX()+v1.getY()*v2.getY());
    }
    public static float CrossProduct(Vector v1,Vector v2){
        return ((v1.getX()*v2.getX())-(v1.getY()*v2.getY()));
    }
}
