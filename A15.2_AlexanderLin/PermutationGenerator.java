import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
/**
 * Creates a ArrayList of integers between 1-10 and gives all possible permutations of those integers. 
 *
 * @author Alexander Lin
 * @version 20190122
 */

public class PermutationGenerator {
	private ArrayList<Integer> numList;
	private int numPermutations;

	public PermutationGenerator() {
		numPermutations = 0;
		numList = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			numList.add(i);
		}
	}

	public void renewNumList() {
		for (int i = 1; i <= 10; i++) {
			numList.add(i);
		}
	}

	public void nextPermutation() {
		numPermutations++;
		ArrayList<Integer> permutation = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			int randIndex = (int) (Math.random()*numList.size());
			int randNum = numList.get(randIndex);
			permutation.add(randNum);
			numList.remove(randIndex);
		}
		renewNumList();

		System.out.print("List " + numPermutations + ": ");
		for (Integer num : permutation) {
			System.out.print(num + " ");
		}
	}

	public static void main(String[] args) {
	           System.out.println("Random Permutation List Generator");
		PermutationGenerator test = new PermutationGenerator();
		for (int i = 0; i < 10; i++) {
			test.nextPermutation();
		}
	}
}