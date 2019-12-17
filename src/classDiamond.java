public class classDiamond {
    /*
    This program will print a diamond
    Talia Dauer
    12/5/2019
    Ver 1
    */
    public static void main(String[] args) {
        Diamond();
        X();
    }

    public static void bot() { //this part will print the bottom of the diamond
        System.out.println(" \\    /");
        System.out.println("  \\  /");
        System.out.println("   \\/");
    }

    public static void Diamond() { //this is just defining both parts (top and bottom)
        top();
        bot();
    }

    public static void X() { //this is defining the parts for the X
        bot();
        top();
    }

    public static void top() { //this is forming the top of the diamond
        System.out.println("   /\\ ");
        System.out.println("  /  \\");
        System.out.println(" /    \\ ");
        {
        }


    }
}
