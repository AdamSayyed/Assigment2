import java.util.Scanner;

public class RandomNumberGuesser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
		random();
		
		
		
		
		
		
		
		
	}
	
	
	
	static void random() {
		
		
		
		
		RNG object = new RNG();
		
		int random = object.rand();
		System.out.println("This application generates a random integer between 1 and 100 and asks the user to guess repeatedly until they giess correctly.");
		
	System.out.println("Enter your first guess: ");	
		
		
		int response;
		
		
		Scanner scan = new Scanner(System.in);
		
		
		response = scan.nextInt();
		object.incrementCount();
		
		int max = 100;
			int min =1;
		
		
		while(response != random && object.getCount()<= object.getMaxGuessCount()) {
			
			
			if(response< random) {
				
				
				
				
				System.out.println("Your guess is too low");
				
				System.out.println("Number of guesses is: " + object.getCount());
				
				min = Math.max(response, min);
				
				
			}
			
			
			
			
if(response> random) {
				
				
				
				
				System.out.println("Your guess is too high");
				
				System.out.println("Number of guesses is: " + object.getCount());
				
				max = Math.min(response, max);
				
				
			}
			
			System.out.println("Enter your next guess between "+ min+" and "+ max); 
			
			
			
			
			
			response = scan.nextInt();
			object.incrementCount();
			
			
			
			while(object.inputValidation(response, min, max) ==false ) {
				
				
				
				
 				response = scan.nextInt();
				object.incrementCount();
			}
			
			
			
		}
		
		
		
		if(response == random) {
			
			System.out.println("Congralutions, you guessed correctly");
			System.out.println("Try again? (yes or no)");
			
			String  resp = scan.nextLine();
			
			
			   resp = scan.nextLine();
			
			
			
			if(resp.equals("yes")) {object.resetCount();random();}
		}else {
			
			System.out.println("You have exceeded the maximum number of guesses, 7. Try again");
			
			
			object.resetCount();	
			random();

			
		}
		
		
		
	}
	
	
	

}
