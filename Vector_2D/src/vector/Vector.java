package vector;

public class Vector {
   public float x;
    public float y;

    public Vector(float x,float y){
        this.x=x;
        this.y=y;
    }
    //getter
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }

    @Override
    public String toString(){
        return("<"+x+","+y+">");
    }
}
