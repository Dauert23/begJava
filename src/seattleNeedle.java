public class seattleNeedle {
    /*
    This program will print the Seattle Needle
    Talia Dauer
    12/16/2019{
     */
    public static final int Size = 4;

    public static void main(String[] args) {
        lines();
        top();
       bot();
        lines();
       middle();
        top();
    }

    public static void lines() {
        for (int lines = 1; lines <= Size; lines++) {//printing the lines
            for (int spaces = 1; spaces <= Size * 3; spaces++) {//printing the spaces
                System.out.print(" ");
            }
            System.out.println("||");
        }
    }

    public static void top() {
        for (int line = 1; line <= Size; line++) {//lines at the top
            for (int spaces = 1; spaces <= (3 * Size) - (3 * line) +1; spaces++) {//spaces before
                System.out.print(" ");
            }
            System.out.print("_/");
            for (int colons = 1; colons <= 3 * line - 3; colons++) {//equation for the colons
                System.out.print(":");
            }
            System.out.print("||");//lines at the top
            for (int colons = 1; colons <= 3 * line - 3; colons++) {//colons on the right
                System.out.print(":");
            }

            System.out.println("\\_");
        }
        System.out.print("|");//lines in the middle
        for (int quotations = 1; quotations <= 6 * Size; quotations++) {//quotes are 4*Size bc there are 24
            System.out.print("\"");
        }
        System.out.println("|");
    }


                public static void bot() {
                for (int line = 1; line <= Size; line++) {//printing lines
                    for (int spaces = 1; spaces <= 2 * line - 2; spaces++) {//printing the spaces
                        System.out.print(" ");
                    }
                    System.out.print("\\_/");//the v's
                    for (int slashes = 1; slashes <= 3 * Size - 2 * line; slashes++) {//printing the slashes in the v's
                        System.out.print("\\/");
                    }
                    System.out.println("\\_/");

                }


            }
                public static void middle(){
                for (int line = 1; line <= 4 * Size; line++) {//printing the lines in middle
                    for (int spaces = 1; spaces <= 3 * Size - 3; spaces++){//printing the spaces before
                        System.out.print(" ");
                }
                System.out.println("|%%||%%|");//printing the middle %
            }
            }

}

