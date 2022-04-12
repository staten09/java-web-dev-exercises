package exercises;

import java.util.Scanner;

public class AliceInWonderland {

    public static void main(String[] args){
        String quote = "Alice was beginning to get very tired of sitting by her sister on the bank and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";
        String term;
        String newQuote;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("What 'term' would you like to search for?  ");
        term = input.nextLine().toUpperCase();
        input.close();

        quote = quote.toUpperCase();
        if(quote.contains(term)){
            System.out.println(quote.indexOf(term));
            System.out.println(term.length());
            newQuote = quote.replace(term,"");
            System.out.println(newQuote);
        }

    }

}
