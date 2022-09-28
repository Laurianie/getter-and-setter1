import java.awt.event.*;

public class RunMyProgram {

    public static void main(String[] args) {
        truck obj = new truck ();

        obj.getWheels();
        System.out.println("This truck has 4 wheels");
        obj.setWheels(7);
        System.out.println("this truck has 7 wheels");
    }

}


