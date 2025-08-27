import vector.Vector;
import vector.operations;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vector v1= new Vector(3,4);
        Vector v2= new Vector(1,2);

        System.out.println("v1="+" "+v1);
        System.out.println("v2="+" "+v2);

        operations Opt=new operations();
        System.out.println("Addition "+ operations.add(v1,v2));
        System.out.println("Subtraction "+ operations.subtract(v1,v2));
        System.out.println("DotProduct "+ operations.DotProduct(v1,v2));
        System.out.println("CrossProduct "+ operations.CrossProduct(v1,v2));

    }
}