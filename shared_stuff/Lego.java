public class Lego {
	
	/*
	 * Uncomment one statement in the main method at a time, and get that method call to work.
	 * When one statement works, comment it out again and then uncomment the next statement.
	 * 
	 */
	public static void main(String args[]){
		System.out.println("*****  beginning of the main method  ****");
		//Lego.playWithNames();
		//Lego.playWithStrings();
		//Lego.playWithChars();
		//Lego.playWithLoops();
		System.out.println("*****  end of the main method  ****");
	}
	
	/**
	 * Fix the errors in the following code.
	 * Where are proper naming conventions not followed?
	 */
	public static void playWithNames() {
		
//		int x = "10";
//		int y = "20";
//		System.out.print(x+y);
//		
//		boolean black_flag = true;
//		boolean white flag = false;
//		System.out.println(black_flag=white flag);
//		
//		double trouble = 10.1;
//		short circuit = 10;
//		sum = trouble + circuit;
//		
//		int x = 100;
//		long johns = x;
//		System.out.println(johns + x);
//		
//		long shot = 1;
//		short bet = (short)shot;
//		System.out.println(shot + bet);
//		
//		int arrest = 100;
//		byte code = arrest;
//		long catch = (long)arrest;
//		System.out.println(arrest + code);
		
	}
	
	/*
	 * Create a rule that explains how Java
	 * is generating output in this example.
	 */
	public static void playWithStrings() {
		int x = 1;
		int y = 2;
		int z = 3;
		
		String output = x + y + z + " : " + x + y + z;
		System.out.println(output);
		
		/*
		What would be the output of the following code:
		int x = 10;
		int y = 5;
		System.out.println( x + y  + " = x + y =  "+ x + y);
		a) 15 = 15  = 15  
		b) 15 = x + y  = 15
		c) 15 = x + y  = 105
		d) 105 = x + y  = 15
		*/

	}
	
	/**
	 * What is the output of the following code?
	 * Can you explain the difference in behavior
	 * when the code looks quite similar?
	 */
	public static void playWithChars () {
		char lie = 'a';
		for (int i = 0; i<26; i++){
			System.out.println(lie);
			lie++;
		}
		
		String eh = "a";
		for (int i = 0; i<26; i++){
			System.out.println(eh);
			eh = eh + 1;
		}
	}
	
	/*
	 * Run the code and using the output, try to explain the difference between 
	 * continue and break
	 */
	public static void playWithLoops(){
		
		long x = 0;
		while (true) {
			x = x+1;
			if (x%3==0){
				continue;
			}
			if (x==20) {
				break;
			}
			System.out.println(x);
		}
	}
	
	/*
	 * Use wrapper classes to convert from one type to another.
	 * Fix any programming errors while you're at it.
	 */
	public static void playWithWrappers() {
//		String ten = "10";
//		Integer i = new Integer(ten);
//		int i = i.intValue();
//		
//		long l = ten;
//		double up = ten;
//		System.out.println("i + l + up");
	}
}
