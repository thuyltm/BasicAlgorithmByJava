package home.practise;

public class MergeSort {
	public static int[] mergeSort(int[] data) {
		if (data.length == 1) {
			return data;
		} else {
			int halfLength = data.length/2;
			int[] data1 = new int[halfLength];
			int[] data2 = new int[data.length - halfLength];
			for (int i = 0; i < halfLength; i++) {
				data1[i] = data[i];
			}
			for (int i = 0; i < data2.length; i++) {
				data2[i] = data[halfLength+i];
			}
			int[] sortedArr1 = MergeSort.mergeSort(data1);
			int[] sortedArr2 = MergeSort.mergeSort(data2);
			return MergeSort.mergeSort(sortedArr1, sortedArr2);
		}
	}
	public static int[] mergeSort(int[] sortedArr1, int[] sortedArr2) {
		int[] result = new int[sortedArr1.length + sortedArr2.length];
		int index1 = 0;
		int index2 = 0;
		int i = 0;
		while (index1 < sortedArr1.length && index2 < sortedArr2.length) {
			if (index1 < sortedArr1.length && sortedArr1[index1] < sortedArr2[index2]) {
				result[i] = sortedArr1[index1];
				index1++;
			} else if (index2 < sortedArr2.length && (sortedArr1[index1] > sortedArr2[index2])) {
				result[i] = sortedArr2[index2];
				index2++;	
			}
			i++;
		}
		if (index2 < sortedArr2.length) {
			for (int j = index2; j < sortedArr2.length; j++) {
				result[i] = sortedArr2[j];
				i++;
			}
		}
		if (index1 < sortedArr1.length) {
			for (int j = index1; j < sortedArr1.length; j++) {
				result[i] = sortedArr1[j];
				i++;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] data = {1,5,6,2,4};
		int[] result = MergeSort.mergeSort(data);
		Utility.printArray(result);
	}
}
