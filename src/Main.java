/**
 * 
 */

/**
 * @author om
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj;
		// Call GFibonacci object
		obj = new GFibonacci();
		((GFibonacci) obj).fibo();
		
		// Call MyResume object
		obj = new MyResume();
		((MyResume) obj).name();
	}

}
