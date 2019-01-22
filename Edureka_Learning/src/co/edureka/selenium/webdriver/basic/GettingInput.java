package co.edureka.selenium.webdriver.basic;

import java.util.Scanner;

public class GettingInput {
	
	public static void main(String[] args) {
		int[] arraysy = {100,45,455,67,7887,677};
		
		String strn = "hello";
		int strnlength = strn.length();
		System.out.println("The String length is " + strnlength);
		String strncase = strn.toUpperCase();
		System.out.println("my uppercase is " + strncase);
		System.out.println( "i am gonna replace a letter "  + strn.replace('e', 'f'));
		System.out.println("in my string the letter e is present in index  " + strn.indexOf('e'));
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter some string");
		String user_Input = scan.nextLine();
		System.out.println("The entered Text " + user_Input);
		
		for (int element : arraysy)
		{
			System.out.println(element);
			
		}
		
		for (int index=0; index<5; index++)
		{
			System.out.println(arraysy[index]);
		}
		
		
	}

}
