package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			
			String opposites ="";
			char backwardss = 'q';
			for(int i = s.length()-1;i>-1;i--) {
			backwardss =s.charAt(i);
			opposites = opposites+backwardss;
			
		}
		System.out.println(opposites);
		
		
		}, "repeat");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
				
				String final_s ="";
		char c_s = 'q';
		for(int i =0 ;i<s.length();i--) {
			c_s =(char) (s.charAt(i)+26);
			if(i%2==0) {
				
				final_s =final_s+c_s;
				
			}
		
		
		
	}
	System.out.println(final_s);
	
	
	}, "repeat");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
	
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
