public class starslashSpace{
    public static final int Size= 6;
/*
This program will produce stars, slashes, and spaces.
Talia Dauer
12/10/2019
 */
public static void main(String[] args) {
    for(int line=1; line<=Size; line++){
    stars(line);
    spaces(line);
    fslashes(line);
    bslashes(line);
    spaces(line);
    stars(line);
    System.out.println();
}}
public static void stars (int line) {
    for (int stars = 1; stars <= -line + Size + 1; stars++) {
        System.out.print("*");
    }}
    public static void spaces (int line) {
        for (int space = 1; space <= line; space++) {
            System.out.print(" ");

        }
    }
        public static void fslashes( int line){
            for (int slash = 1; slash <= -2 * line + 2 * Size; slash++) {
                System.out.print("/");

            }

            }
            public static void bslashes (int line){
    for (int blash=1; blash<=2*line-2; blash++){
        System.out.print ("\\");

    }

            }
        }


