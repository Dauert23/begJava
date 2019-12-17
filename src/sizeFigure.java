public class sizeFigure {
    /*
    This program will change the size 0f a figure
    Talia Dauer
    12/6/2019
    Ver 1
     */
    public static int SIZE = 3;

    public static void main(String[] args) {
        top();
        bot();
        System.out.println();
        bot();
        top();
    }


    public static void top() {
        for (int line = 1; line <= SIZE; line++) {//defining the size
            for (int space = 1; space <= -line + (SIZE + 1); space++)//spaces before
            {
        System.out.print(" ");
            }
        System.out.print("/");
            for(int spacetween=1; spacetween<= 2*line-2; spacetween++) {//spaces inbetween
                System.out.print("!");
            }
            System.out.println("\\");
    }}

    public static void bot(){
        for (int line = 1; line <= SIZE; line++) {//loop for bottom

            for (int space = 1; space <=line ; space++)//spaces before
            {
                System.out.print("!");
            }
            System.out.print("\\");
            for(int spacetween=1; spacetween<= -2*line+2*SIZE; spacetween++) {//spaces inbetween
                System.out.print("!");
            }
            System.out.println("/");
        }}

    }
