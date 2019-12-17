public class rocketShip {
    /*
    This is going to print a figure that looks like a rocket ship
     */
    public static final int Size = 3;

    public static void main(String[] args) {
        jet();
        equalstar();
        top();
        bot();
/*        equalstar();
        top();
        bot();
        equalstar();
        bot();
        top();


 */
    }

    public static void jet() {
        for (int line = 1; line <= (2 * Size) - 1; line++) {
            for (int space = 1; space <= -line + 2 * Size - 1; space++) {
                System.out.print(" ");
            }
            for (int fslash = 1; fslash <= line; fslash++) {
                System.out.print("/");
            }
            System.out.print("**");
            for (int bslash = 1; bslash <= line; bslash++) {
                System.out.print("\\");
            }
            System.out.println();
        }

    }

    public static void equalstar() {
        System.out.print("+");
        for (int eqstar = 1; eqstar <= 2 * Size; eqstar++) {
            System.out.print("=*");
        }
        System.out.println("+");

    }

    public static void top() {
        for (int line = 1; line <= Size; line++) {
            System.out.print("|");
            for (int dot = 1; dot <= Size - line; dot++) {
                System.out.print(".");

            }
            for (int fb = 1; fb <= line; fb++) {
                System.out.print("/\\");
            }
            for (int ddot = 1; ddot <= 2 * Size - 2 * line; ddot++) {
                System.out.print(".");
            }
            for (int fb = 1; fb <= line; fb++) {
                System.out.print("/\\");
            }
            for (int dot = 1; dot <= Size - line; dot++) {
                System.out.print(".");

            }
            System.out.println("|");
        }

    }
    public static void bot(){
        for (int line = 1; line <= Size; line++) {
            System.out.print("|");
            for (int dot = 1; dot <= line-1; dot++) {
                System.out.print(".");

            }
            for (int fb = 1; fb <= Size-line+1; fb++) {
                System.out.print("\\/");
            }
            for (int ddot = 1; ddot <= 2*line-2; ddot++) {
                System.out.print(".");
            }
            for (int fb = 1; fb <= Size-line+1; fb++) {
                System.out.print("\\/");
            }
            for (int dot = 1; dot <= line-1; dot++) {
                System.out.print(".");

            }
            System.out.println("|");
        }

    }

}

