package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Reese Spector
 */

public class App 
{
    public static void main( String[] args )
    {

        // ask for quote
        Scanner input = new Scanner(System.in);                            //scanner
        System.out.print("What is the quote? ");                           //quote prompt
        String myQuote = input.nextLine();                                 //get input

        // ask for author
        System.out.print("Who said it? ");                                 //author prompt
        String myAuthor = input.nextLine();                                //get inout

        // print
        System.out.print(myAuthor + " says, " + "\"" + myQuote + ".\"");

    }
}
