package co.edureka.selenium.webdriver.basic;

public class MatrixHandling {

	public static void main(String[] args)
	{
		
		int [] [] abc = {{1,22,3},{22,33,12},{23,34,35}};
		
		int max=abc[0][0];
		int i;
		int j = 0 ;
		
	
		for( i=0;i<=2;i++)
		{
			for( j=0;j<=2;j++) {
				
				if(abc[i][j]>max)
				{
					max=abc[i][j];
				}
			}
		}
		
		System.out.println(max);	

		int maxColumn=j-1;
		
		System.out.println(maxColumn);
		
		
		int  minnumbcolum=abc[0][maxColumn];
		
		for (int k=0;k<=2;k++) {
					
					  
			  if(abc[k][maxColumn]<abc[0][maxColumn])
					  {
				 minnumbcolum = abc[k][maxColumn];
				 
					  }
		  }
		  
		  System.out.println(minnumbcolum);
		
	}	
		

}
