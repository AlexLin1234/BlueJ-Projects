
/**
 * Reverses a number. For example, if the number was 123, 
 * the output would be 321
 * @author Alexander Lin
 * @version 20180817
 */
public class ReverseNumber
{
   	public static int ReverseNumber(int num){
		int num2 = num;
		int digits = 0;
		
		while(num > 0) {
			digits++;
			num /= 10;
			
		}
		int [] sum = new int [digits];
		
		int i = -1;
		int output = 0;
		while(num2 > 0) {
			i++;
			sum[i] += num2%10;
			num2 = num2/10;
			
		}
		for(int j=0;j<sum.length;j++) {
			output = (output*10) + sum[j];
			
		}
		return output;
		
	}
	public static void main(String[] args) {
		System.out.println(ReverseNumber(32143424));

	}
}
