package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double a=10;
        double b=5;
        double c=4;
        int g=2; // Степень равная двум
        int k=-2; //Степень равная минус два
        int h=3; //Степень равная три
        double z=(b+Math.sqrt(Math.pow(b,g)+4*a*c))/2*a-Math.pow(a,h)*c+Math.pow(b,k);
        System.out.println(z);
    }
}
