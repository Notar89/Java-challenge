import java.util.Scanner;

public class Challenge2 {

	public static void main(String[] args) {
		System.out.println("What is your name?");
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		System.out.println("Hello " + s);
		
		System.out.println(s + ", What is your favorite time of year?");
		
		Scanner in1 = new Scanner(System.in);
		String w = in1.nextLine();
				
		System.out.println(w + " Good choice.");	
		
		System.out.println(s + w );
	

	}

}
