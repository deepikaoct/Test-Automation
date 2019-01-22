package co.edureka.selenium.webdriver.basic;


public class MultiDimensional {
	
	
	public static void displayMet(int x[][]) {
		
		for(int row=0; row<x.length; row++) {
			
			for(int col=0; col<x[row].length; col++) {
				
				System.out.print(x[row][col] + "\t" );
				
			}
				
			System.out.println();
			}
	}


public  static void main(String[] args) {
	
	int farray [] [] = {{112,33,33,3333},{222,33,35,56}};
	
int sarray [] [] = {{33,54,55},{33},{44,5667,443,3323,66}};

	

		System.out.println("First array");
		displayMet(farray);
		System.out.println("second array");
		displayMet(sarray);

	
	
	}
}
	


	

