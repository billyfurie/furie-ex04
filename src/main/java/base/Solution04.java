/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 William Furie
 */

package base;

import java.util.Scanner;

public class Solution04 {
    /*
        print "Enter a noun:"
        `noun` = read string from user
        print "Enter a verb:"
        `verb` = read string from user
        print "Enter an adjective:"
        `adjective` = read string from user
        print "Enter an adverb:"
        `adverb` = read string from user
        print "Do you %s your %s %s %s? That's hilarious!", `verb`, `adjective`, `noun`, `adverb`
     */

    public static void main(String[] args) {
        System.out.print("Enter a noun: ");
        Scanner input = new Scanner(System.in);

        String noun = input.nextLine();

        System.out.print("Enter a verb: ");
        String verb = input.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = input.nextLine();

        System.out.print("Enter an adverb: ");
        String adverb = input.nextLine();

        System.out.printf("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb);
    }
}
