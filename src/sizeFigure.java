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
        for (int line = 1; line <= SIZE; line++) {
            for (int space = 1; space <= -line + (SIZE + 1); space++)
            {
        System.out.print(" ");
            }
        System.out.print("/");
            for(int spacetween=1; spacetween<= 2*line-2; spacetween++) {
                System.out.print("!");
            }
            System.out.println("\\");
    }}

    public static void bot(){
        for (int line = 1; line <= SIZE; line++) {

            for (int space = 1; space <=line ; space++)
            {
                System.out.print("!");
            }
            System.out.print("\\");
            for(int spacetween=1; spacetween<= -2*line+2*SIZE; spacetween++) {
                System.out.print("!");
            }
            System.out.println("/");
        }}

    }
