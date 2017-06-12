
public class Utilities {
	
	public static boolean radianEq(double a, double b){
		
		double prox = .4;
		if(Math.abs(a - b) <= prox || Math.abs(a - (b+2*Math.PI)) <= prox){
			return true;
		}
		return false;
	}
	
	public static double coterminal(double a){
		if(a >= 2*Math.PI ){
			return a % (2*Math.PI);
		}
		if(a < 0){
			return a % (2*Math.PI);
		}
		return a;
	}
}
