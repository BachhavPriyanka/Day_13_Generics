package day13_Generics;


public class Generics {

	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
	    T max = x; 

	    if (y.compareTo(max) > 0)
	      max = y; 

	    if (z.compareTo(max) > 0)
	      max = z; 

	    return max; 
	  } 

	  public static void main(String args[]) {
	    System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7, maximum(6.6,
	        8.8, 7.7));
	   
	  }
	}