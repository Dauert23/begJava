public class starDiamonds{
    /*
    This program will print a diamond and star
    Talia Dauer
     */
        public static final int Size=4;
    public static void main(String[] args) {
        {
            line();
            top();
            bot();
            line();
            bot();
            top();
            line();
        }
}
public static void line() {
    System.out.print("+");//printing + on the ends
    for (int dash = 1; dash <= 2 * Size -1; dash++) {//printing the dashes in the line at the top
        System.out.print("-");
    }
    System.out.println("+");
}
public static void top() {
    for (int line = 1; line <= Size; line++) {//lines on the side
        System.out.print("|");
        spaces(line);
        for (int slash = 1; slash <= line - 1; slash++) {//slashes in the diamond
            System.out.print("/");
        }
        System.out.print("*");//stars in the middle
        for (int slash=1; slash<=line-1; slash++){//slashes on the other side of the diamond
            System.out.print("\\");
        }
        spaces(line);
        System.out.println("|");
        }
    }
public static void spaces(int line) {
    for (int space = 1; space <= -line + Size; space++) {//spaces being printed
        System.out.print(" ");
    }
}
    public static void spaces2(int line) {
        for (int space = 1; space <= line - 1; space++) {//spaces being printed
            System.out.print(" ");
        }
    }
public static void bot(){
 for (int line = 1; line <= Size; line++) {//lines on size
        System.out.print("|");
        spaces2(line);
        for (int slash = 1; slash <= -line+Size; slash++) {//slashes on the bottom
            System.out.print("\\");
        }
        System.out.print("*");
        for (int slash=1; slash<=-line+Size; slash++){//printing slashes on the top and stars inbetween
            System.out.print("/");
        }
        spaces2(line);
        System.out.println("|");
    }
}}
