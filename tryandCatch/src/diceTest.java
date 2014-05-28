import java.util.Scanner;
public class diceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);			

		Dice myRandomNumber = new Dice();

		 
		int number;
		boolean continueLoop = true;
		 
	
		 
		 do
		 {
			 try
			 {
				 System.out.printf("Please enter a number that you want to bounce between 1 -3 \n");		 
				 number = input.nextInt();  

				 
				 int jorge=myRandomNumber.Throw( number); 	
				 
			 
				 continueLoop = false;				 
				 
			 }
			 catch( Exception exception)
			 {
				
				 System.out.printf("You entered an invalid number \n");			 
				 
				 
			 } 		
		 
		 }while (continueLoop);
		 
		 	

		 System.out.println( "E");
 
   }	 
}	
