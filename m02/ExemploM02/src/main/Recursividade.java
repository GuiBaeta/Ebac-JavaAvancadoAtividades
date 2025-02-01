package main;

public class Recursividade {

	public static void main(String[] args) {

		
	System.out.println(findElement(46));

	}
	
	public static int findElement(int elementNumber) {
		if (elementNumber <= 1) {
			return elementNumber;
		}
		
		return findElement(elementNumber - 1) + findElement(elementNumber - 2);		
	}


}
