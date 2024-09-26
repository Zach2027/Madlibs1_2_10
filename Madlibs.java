import java.util.Scanner;
public class Madlibs{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String madlib = "I wnet to the animal <noun>, the <plural_noun> and the <number> beats were there.";
        //madlib = "Once upon a time in a <adjective> land, a <noun> <adverb> grew.";
        //madlib = "The <adjective> <noun> was as <adjective> as the car";



        
        System.out.println("enter a Noun");
        String noun = scanner.nextLine();
        
        System.out.println(madlib);

    }
}