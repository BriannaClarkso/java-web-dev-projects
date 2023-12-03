package org.launchcode;

import java.util.Scanner;
public class Alice {
    public static void main(String[] args) {

       Alice myFirstAlice = new Alice();
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a word to search for");
       String searchTerm = input.nextLine();
       Boolean myReturnedResult = myFirstAlice.searchAliceQuote(searchTerm);
       System.out.println("The result is: " + myReturnedResult.toString());



    }

    public boolean searchAliceQuote(String searchTerms){
        String theQuote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?";
        String theQuoteLowerCase = theQuote.toLowerCase();
        String searchTermsLowerCase = searchTerms.toLowerCase();

        Boolean result = theQuoteLowerCase.contains(searchTermsLowerCase);
        return result;
    };
}
