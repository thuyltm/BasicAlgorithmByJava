package home.practise;

public class MergeSort {
	public static int[] mergeSort(int[] sortedArr1, int[] sortedArr2) {
		int[] result = new int[sortedArr1.length + sortedArr2.length];
		int index1 = 0;
		int index2 = 0;
		int i = 0;
		while (i < result.length) {
			if (sortedArr1[index1] < sortedArr2[index2]) {
				result[i] = sortedArr1[index1];
				index1++;
			} else {
				result[i] = sortedArr2[index2];
				index2++;
			}
			i++;
		}
		return result;
	}
	public static void main(String[] args) {
		
	}
}
