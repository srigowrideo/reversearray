package fibonacciseries;
 import java . util. Arrays;
public class reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		{
			String[] names = {"John", "Jammy", "Luke"}; 
		System.out.println("original array: " + Arrays.toString(names) ); 
		// reversing array with three elements reverse(names); 
		System.out.println("reversed array: " + Arrays.toString(names) ); 
		String[] test = {"John"}; System.out.println("original array: " + Arrays.toString(test) ); 
		// testing reverse array function with array of just one element reverse(test);
		System.out.println("reversed array: " + Arrays.toString(test) );
		}
	}
		/** * Java Method to reverse String array in place * * @param array */
		public static void re(String[] Array) { 
			if (Array == null || Array.length < 2) { 
			return;
		} for (int i = 0; i < Array.length / 2; i++) { 
			String temp = Array[i]; Array[i] = Array[Array.length - 1 - i]; Array[Array.length - 1 - i] = temp; 
			}  
	
		

		
	}

}
