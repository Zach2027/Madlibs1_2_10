import java.util.Scanner;
public class Madlibs{

    public static void main(String[] args) {
   
        String madlib = "I wnet to the animal <noun>, the <plural noun> and the <number> beats were there.";
        




        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a string");
        String input = scanner.nextLine();
        System.out.println("you said " + input);

    }
}