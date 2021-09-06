/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Fisher
 */

/*
pseudocode:
implement necessities for input
prompt user for input
store input as quote
prompt user for input
store input as author
return quote & author in a string
 */

import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the quote? ");
        String quote= sc.nextLine();
        System.out.print("Who said it? ");
        String author= sc.nextLine();
        System.out.printf("%s says, \"%s\"", author, quote);
    }
}