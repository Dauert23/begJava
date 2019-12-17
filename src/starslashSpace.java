public class starslashSpace{
    public static final int Size= 6;
/*
This program will produce stars, slashes, and spaces.
Talia Dauer
12/10/2019
 */
public static void main(String[] args) {
    for(int line=1; line<=Size; line++){//defining the size and calling all the other for loops
    stars(line);
    spaces(line);
    fslashes(line);
    bslashes(line);
    spaces(line);
    stars(line);
    System.out.println();
}}
public static void stars (int line) {
    for (int stars = 1; stars <= -line + Size + 1; stars++) {//for loops for beginning stars
        System.out.print("*");
    }}
    public static void spaces (int line) {
        for (int space = 1; space <= line; space++) {//for loops for the spaces inbetween
            System.out.print(" ");

        }
    }
        public static void fslashes( int line){
            for (int slash = 1; slash <= -2 * line + 2 * Size; slash++) {//for loops for the forward slashes
                System.out.print("/");

            }

            }
            public static void bslashes (int line){//for loops for the backslashes
    for (int blash=1; blash<=2*line-2; blash++){
        System.out.print ("\\");

    }

            }
        }


