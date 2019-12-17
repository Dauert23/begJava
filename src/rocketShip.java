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
        for (int line = 1; line <= (2 * Size) - 1; line++) { //lines at the top
            for (int space = 1; space <= -line + 2 * Size - 1; space++) { //spaces before the lines
                System.out.print(" "); //printing the spaces
            }
            for (int fslash = 1; fslash <= line; fslash++) { //printing all the forward slashes
                System.out.print("/");
            }
            System.out.print("**");
            for (int bslash = 1; bslash <= line; bslash++) { //printing all the backslashes
                System.out.print("\\");
            }
            System.out.println();
        }

    }

    public static void equalstar() {
        System.out.print("+");
        for (int eqstar = 1; eqstar <= 2 * Size; eqstar++) { //this is printing the equal signs and the stars
            System.out.print("=*");
        }
        System.out.println("+");

    }

    public static void top() { //this is for the top of the diamond
        for (int line = 1; line <= Size; line++) { //connecting it to the size so it will change size as you change the size at the top
            System.out.print("|");
            for (int dot = 1; dot <= Size - line; dot++) { //printing the dots on the left
                System.out.print(".");

            }
            for (int fb = 1; fb <= line; fb++) { //this is printing the forward and backslashes
                System.out.print("/\\");
            }
            for (int ddot = 1; ddot <= 2 * Size - 2 * line; ddot++) { //this is printing the dots in the middle
                System.out.print(".");
            }
            for (int fb = 1; fb <= line; fb++) { //this is printing the second set of forward and backslashes (for the other diamond)
                System.out.print("/\\");
            }
            for (int dot = 1; dot <= Size - line; dot++) {//this is printing the dots at the end
                System.out.print(".");

            }
            System.out.println("|");
        }

    }
    public static void bot(){ //this is basically all the same as the top, but a bit reversed
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

