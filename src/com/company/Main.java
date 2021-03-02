package com.company;

import java.util.Scanner;

public class Main {
void Volume(float l,float b,float h){
    float v;
    v=l*b*h;
    System.out.println("volume is"+v);
}
void Area(float l, float b, float h){
    float a;
    a=2*((l*b)+(b*h));
    System.out.println("area is"+a);
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float l=in.nextFloat();
        float b= in.nextFloat() ;
        float h=in.nextFloat() ;
        System.out.println("l is"+l);
        System.out.println(+b);
        System.out.println(+h);
        Main s=new Main();
      s.Volume(l,b,h);
  s.Area(l,b,h);
    }
}
