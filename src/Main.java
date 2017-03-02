import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Scanner scanner = new Scanner(System.in);
        int nb = (new Random()).nextInt(100);

        int var;
        do {
            System.out.println("Please enter a number");
            var = scanner.nextInt();
           if(var >nb){
               System.out.println("Trop haut");
           }
           else if(var < nb){
               System.out.println("Trop bas");
            }
            else {
               System.out.println("Victory !");
           }
        }
        while( var != nb);
    }
}
