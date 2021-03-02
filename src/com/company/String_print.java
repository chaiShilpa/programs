package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class String_print {
    public static void main(String[] args) {

        String input = "";
        Scanner in = new Scanner(System.in);
        String longer = null;
        String shorter = null;
        int count = 0;

        System.out.println("enter a string");
        input = in.nextLine();
        int length1 = input.length();
        do {
            if (!input.toLowerCase().equals("x")) {
                count++;
                if (shorter == null || length1 < shorter.length()) {
                    shorter = input;
                }
                if (longer == null || length1 < longer.length()) {
                    longer = input;

                }
            }
        }
        while (!input.toLowerCase().equals("x"));
        in.close();

        System.out.println("short string is" + shorter);
        System.out.println("short string is" + longer);


        if (shorter != null && longer != null) {
            int avglength = (shorter.length() + longer.length()) / 2;
            System.out.println("avreage length" + avglength);
        }

    }
    }
