public class printNumbers{
/*
This program is going to print numbers in brackets
Talia Dauer
12/4/2019
ver 1
 */
public static void main(String[] args) {
    printNum(15);
    printNum(20);
    printNum(50);

     // count++ means count = count +1
}
public static void printNum(int num){
        for(int count = 1 ; count <= num; count++){
            System.out.print("[" + count+"]");
    }
        System.out.println();
}}



