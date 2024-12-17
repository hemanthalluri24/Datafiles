package first10;

public class SmallestLargest {
	public static void main(String[] args) {
		int[] numbers = { 23, 634, 635, 34, 66, -35, 4623, 7, 78, 22, 6 };
		int largest = numbers[0];
		int smallest = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			} else if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}
		System.out.println("Largest Number is : " + largest);
		System.out.println("Smalles Number is : " + smallest);
	}

}
