/**
 * 
 */
package Excepciones;

/**
 * @author 47767573
 *
 */
public class Ejercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			int[] num = {1,2};
			
			for (int i = 0 ; i <= num.length ; i++){
				int numero = num[i];
			}
			
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
	}

}
