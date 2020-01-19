import java.util.Scanner;
/**
 * CarRental takes the Make and Model of your car, along with your license plate, and creates a new ID for your rental car
 *
 * @author Alexander Lin
 * @version 20190116
 */
public class CarRental
{
    private static final char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P',
        'Q','R','S','T','U','V','W','X','Y','Z'};
    private static String CarID(String licenseString, int licenseNum){
        String new_s = new String();
        int idNum = 0;
        char idChar;
        for(int i = 0;i<=licenseString.length()-1;i++){
            char c = licenseString.charAt(i);
            idNum += (int)c;
            
        }
        idNum += licenseNum;
        idChar = alphabet[idNum%26];
        new_s = idChar + "" +idNum;
        return new_s;
    
    
    }

    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String carMake;
        String carModel;
        int licenseNum;
        String licenseString;
        System.out.println("Please enter Car Make");
        carMake = sc.nextLine();
        System.out.println("Please enter Car Model");
        carModel = sc.nextLine();
        System.out.println("Please enter the Letters of the license plate");
        licenseString = sc.nextLine();
        System.out.println("Please enter the numbers of the license plate");
        licenseNum = sc.nextInt();
        System.out.println("Make: " + carMake);
        System.out.println("Model: " + carModel);
        
        System.out.println(CarID(licenseString,licenseNum));
    
    
    }
}
