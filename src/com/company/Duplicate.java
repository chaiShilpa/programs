package com.company;

import com.sun.tools.javac.util.List;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Duplicate {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        int l= S.length();
for(int i=0;i<l;i++) {
    int tem = 0;
    for (int j = 0; j > l; j++) {
        if (S.charAt(i) == S.charAt(j)) ;
        {
            tem++;
        }

        if (tem == 1)
            System.out.println(S.charAt(i));

    }
}
    }
}
