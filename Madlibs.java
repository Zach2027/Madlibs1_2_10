import java.util.Scanner;
public class Madlibs{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String madlib = "I went to the animal <noun>, the <plural_noun> and the <number> beats were there.";
        madlib = "Once upon a time in a <adjective> land, a <noun> <adverb> grew.";
        madlib = "The <adjective> <noun> was as <adjective> as the car";
        
        int firstMadlibOpen = madlib.indexOf("<");
        int firstMadlibClose = madlib.indexOf(">");
        String word = madlib.substring(firstMadlibOpen + 1, firstMadlibClose);

        System.out.print("Enter a " + word);
        String input = scanner.nextLine();
        //replace first missing word
        String first = madlib.substring(0, firstMadlibOpen);
        String last = madlib.substring(firstMadlibClose + 1);

        madlib = first + input + last;

        //finds the next missing word
        firstMadlibOpen = madlib.indexOf("<");
        firstMadlibClose = madlib.indexOf(">");

        word = madlib.substring(firstMadlibOpen + 1, firstMadlibClose);
        System.out.print("enter a " + word);
        //Takes input
        input = scanner.nextLine();
        //replaces the word 
        first = madlib.substring(0, firstMadlibOpen);
        last = madlib.substring(firstMadlibClose + 1);
        //combines the madlib
        madlib = first + input + last;

        //Copy and past 2
        firstMadlibOpen = madlib.indexOf("<");
        firstMadlibClose = madlib.indexOf(">");
        word = madlib.substring(firstMadlibOpen + 1, firstMadlibClose);
        System.out.print("enter a " + word);
        input = scanner.nextLine();
        first = madlib.substring(0, firstMadlibOpen);
        last = madlib.substring(firstMadlibClose + 1);

        madlib = first + input + last;





        System.out.println(madlib);





       
    }
}