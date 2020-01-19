import java.util.Scanner;
/**
 * BinarySearch uses a menu-based interface to let the user choose between 3 different functions to search through a list.
 *
 * @author Alexander Lin
 * @version 20190311
 */
public class BinarySearch
{
    public static int recursBin(int[] arr, int start, int end, int key){
        if(start == end && arr[start] == key){
            if(arr[start] == key){
                return start;
            }
            else{
                return -1;
            }

        }

        else{
            int mid = (start + end)/2;
            if(key > arr[mid]){
                return recursBin(arr, mid + 1, end, key);

            }
            else if(key < arr[mid]){
                return recursBin(arr, start, mid-1, key);
            }
            else{
                return mid;
            }

        }
    }

    public static int interBin(int[] arr, int start, int end, int key){
        while(start != end){
            int mid = (start + end)/2;
            if(key == arr[mid]){
                return mid;

            }
            else if(key < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }

        }
        if(arr[start] == key){
            return start;
        }
        else{
            return -1;
        }
    }

    public static int findFirstOccurrence(int[] A, int x)
    {
        // search space is A[left..right]
        int left = 0;
        int right = A.length - 1;

        // initialize the result by -1
        int result = -1;

        // iterate till search space contains at-least one element
        while (left <= right)
        {
            // find the mid value in the search space and
            // compares it with key value
            int mid = (left + right) / 2;

            // if key is found, update the result and
            // go on searching towards left (lefter indices)
            if (x == A[mid]) {
                result = mid;
                right = mid - 1;
            }

            // if key is less than the mid element, discard right half
            else if (x < A[mid]) {
                right = mid - 1;
            }

            // if key is more than the mid element, discard left half
            else {
                left = mid + 1;
            }
        }

        // return the leftmost index or -1 if the element is not found
        return result;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input;
        int key;
        int [ ] nums = { 1, 1, 1, 2, 3, 3, 4, 4, 4, 5, 5, 6, 7, 7, 9, 9 };
        input = "";
        
        
        while(!input.equals( "q")){
            System.out.println("Welcome to BinarySearch! Press a for recursive Binary, b for iterative binary, and c for finding the first occurrence. Press q to quit");
            input = sc.nextLine();
            if(input.equals("a")){
                System.out.println("Put in the number you want to find");
                key = sc.nextInt();
                System.out.println("The index of the number is " + recursBin(nums,0,nums.length-1,key));
            }
            else if(input.equals("b")){
                System.out.println("Put in the number you want to find");
                key = sc.nextInt();
                System.out.println("The index of the number is " + interBin(nums,0,nums.length-1,key));
            
            }
            else if(input.equals("c")){
                System.out.println("Put in the number you want to find");
                key = sc.nextInt();
                System.out.println("The index of the first number is " + findFirstOccurrence(nums,key));
            
            }
            else if(input.equals("q")){
                
            }
            
            else{
                System.out.println("This is not a valid input. Try again");
            }
            
            
            
        
        }
        System.out.println("Thank you for using BinarySearch!");
    }

}
