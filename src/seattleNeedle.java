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
        for (int lines = 1; lines <= Size; lines++) {
            for (int spaces = 1; spaces <= Size * 3; spaces++) {
                System.out.print(" ");
            }
            System.out.println("||");
        }
    }

    public static void top() {
        for (int line = 1; line <= Size; line++) {
            for (int spaces = 1; spaces <= (3 * Size) - (3 * line) +1; spaces++) {
                System.out.print(" ");
            }
            System.out.print("_/");
            for (int colons = 1; colons <= 3 * line - 3; colons++) {
                System.out.print(":");
            }
            System.out.print("||");
            for (int colons = 1; colons <= 3 * line - 3; colons++) {
                System.out.print(":");
            }

            System.out.println("\\_");
        }
        System.out.print("|");
        for (int quotations = 1; quotations <= 6 * Size; quotations++) {
            System.out.print("\"");
        }
        System.out.println("|");
    }


                public static void bot() {
                for (int line = 1; line <= Size; line++) {
                    for (int spaces = 1; spaces <= 2 * line - 2; spaces++) {
                        System.out.print(" ");
                    }
                    System.out.print("\\_/");
                    for (int slashes = 1; slashes <= 3 * Size - 2 * line; slashes++) {
                        System.out.print("\\/");
                    }
                    System.out.println("\\_/");

                }


            }
                public static void middle(){
                for (int line = 1; line <= 4 * Size; line++) {
                    for (int spaces = 1; spaces <= 3 * Size - 3; spaces++){
                        System.out.print(" ");
                }
                System.out.println("|%%||%%|");
            }
            }

}

