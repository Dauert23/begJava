public class exclamationPoint{
        /*
           This program will print exclamation points inside of a diamond
           Talia Dauer
           12/6/2019
           Ver 1
            */
        public static int SIZE = 8;

        public static void main(String[] args) {
            System.out.println();
            bot();
        }

        public static void bot(){
            for (int line = 1; line <= SIZE; line++) {

                for (int space = 1; space <=line-1 ; space++)
                {
                    System.out.print("\\");
                }
                for(int spacetween=-1; spacetween<= -2*line+2*SIZE; spacetween++) {
                    System.out.print("!");
                }
                for (int space = 1; space <=line-1 ; space++)
                {
                    System.out.print("/");
                }
                System.out.println(); }
        }

}
