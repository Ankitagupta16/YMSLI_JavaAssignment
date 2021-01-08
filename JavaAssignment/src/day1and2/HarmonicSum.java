package day1and2;

import java.util.Scanner;

public class HarmonicSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter maximum denominator : ");
		int maxD = sc.nextInt();
        double suml2r=0, sumr2l=0;
        for(int i=1; i<=maxD; i++){
            suml2r += (double)(1)/i;
            sumr2l += (double)(1)/(maxD-i+1);
        }

        System.out.println("left to right = " + suml2r);
        System.out.println("right to left = " + sumr2l);
	}
}
