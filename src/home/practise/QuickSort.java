package home.practise;

public class QuickSort {
	public static void sort(int[] numbers, int start, int end) {
		if (end - start < 1) return; 
		int pivot = start + ((end - start) / 2);
		int i = start;
		int j = end;
		int temp;
		while (j > pivot) {
			if (numbers[j] < numbers[pivot]) {
				temp = numbers[j];
				numbers[j] = numbers[pivot];
				numbers[pivot] = temp;
			}
			j--;
		}
		while (i < pivot) {
			if (numbers[i] > numbers[pivot]) {
				temp = numbers[i];
				numbers[i] = numbers[pivot];
				numbers[pivot] = temp;
			}
			i++;
		}
		sort(numbers, start, pivot - 1);
		sort(numbers, pivot + 1, end);
	}
	public static void main(String[] args) {
		int[] numbers = {1,3,9,2,7,5};
		sort(numbers, 0, numbers.length-1);
		Utility.printArray(numbers);
	}
}
