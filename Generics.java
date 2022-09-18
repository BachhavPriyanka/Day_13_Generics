package day13_Generics;

import java.util.Scanner;

public class Generics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LargestNum obj = new LargestNum();
		System.out.println("Enter 1st number :");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number :");
		int b = sc.nextInt();
		System.out.println("Enter 3rd number :");
		int c = sc.nextInt();
		
		obj.large(a, b, c);	
	}
}

class LargestNum{
	
	public <T extends Comparable> void large(T t1, T t2, T t3) {
	
		if(t1.compareTo(t2) > 0) {
			if(t1.compareTo(t3) > 0) {
				System.out.println(t1 + " is greatest number");
			}else {
				System.err.println(t3 + " is greatest number");
			}		
		}else {
			if(t2.compareTo(t3) > 0) {
				System.out.println(t2 + " is greatest number");
			}else {
				System.out.println(t3 + " is greatest number");
			}
		}
	}
}