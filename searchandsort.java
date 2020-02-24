package searchandsort;

public class searchandsort {
	
	//for loop searching method 
	//take an array and number to search for 
	static int find(int[] array, int number) {
		for (int i = 0; i < array.length; i++) {
			if(array[i] == number) {
				System.out.println(array[i]);
			}
		}
		//if number is not found in array
		//return -1
		return -1;
	};

	public static void main(String[] args){
		
		int[] numbers = { 1, 2, 3, 4, 5, 5, 10, 13, 15, 20 };
		
		int x = 5;
		
		find(numbers, x);
	};

}

