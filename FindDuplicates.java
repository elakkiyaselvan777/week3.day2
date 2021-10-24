package week3.day2;

public class FindDuplicates {

	public static void main(String[] args) {
		
		int[] arr = {10,22,23,56,11,24,12,10,66};
		
		for (int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("if the given number have a Duplicates");
					System.out.println(arr[i]);					
				}				
			}			
		}
	}
}
