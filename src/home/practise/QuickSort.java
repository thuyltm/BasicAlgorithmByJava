package home.practise;

public class QuickSort implements SortTrategy {
	private int[] sort(int[] numbers, int start, int end) {
		if (end - start < 1) return numbers; 
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
		return numbers;
	}
	@Override
	public int[] sort(int[] data) {
		return sort(data, 0, data.length-1);
	}
}
