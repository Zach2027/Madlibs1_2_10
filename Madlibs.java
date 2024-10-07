import java.util.Scanner;
public class Madlibs{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String madlib = "I went to the animal <noun>, the <plural_noun> and the <number> beats were there.";
        madlib = "Once upon a time in a <adjective> land, a <noun> <adverb> grew.";
        madlib = "The <adjective> <noun> was as <adjective> as the car";
        

        String firstMadlib = indexOf(madlib);
        boolean firstMadlib1  = compareTo(firstMadlib, int 54);
        System.out.print(firstMadlib1); 


        String noun = "noun";
        String pluralNoun = "plural noun";
        String number = "number";
        String adjective = "adjective";
        String adverb = "adverb";




        //System.out.println("enter a " + );
        //noun = scanner.nextLine();
        //
        //System.out.println(madlib);

    }
}