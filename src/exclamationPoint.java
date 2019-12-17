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
            for (int line = 1; line <= SIZE; line++) { //this for loop is printing the lines, they go by the Size.

                for (int space = 1; space <=line-1 ; space++) //this for loop changes the spaces before the lines
                {
                    System.out.print("\\");
                }
                for(int spacetween=-1; spacetween<= -2*line+2*SIZE; spacetween++) { //this for loop will change the spaces between
                    System.out.print("!");
                }
                for (int space = 1; space <=line-1 ; space++)
                {
                    System.out.print("/");
                }
                System.out.println(); }
        }

}
