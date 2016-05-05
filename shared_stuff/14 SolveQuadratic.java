
public class SolveQuadratic {

	public static void main(String[] args) {


/*

x1 = (-b + (b^2 - 4ac)^.5) / 2a
x2 = (-b - (b^2 - 4ac)^.5) / 2a

*/
		
		double a = 1;
		double b = 3.5;
		double c = 1;
		
		
		double minusBee = -b;
		double beeSquared = Math.pow(b,2);
		double fourEhSea = 4*a*c;
		double twoEh = 2*a;
		
		double toBeRooted = beeSquared - fourEhSea;
		
		double rootedPart = Math.sqrt(toBeRooted);
		
		double solutionOne = (minusBee + rootedPart) / twoEh;
		double solutionTwo = (minusBee - rootedPart) / twoEh;
		
		System.out.println(solutionOne + " :: " + solutionTwo);
		
	}

}
