package home.practise;

public class TestSort {
     public static void accept(SortTrategy sortAlgorithm, int[] data) {
    	 int[] sortedData = sortAlgorithm.sort(data);
    	 Utility.printArray(sortedData);
     }
     public static void main(String[] args) {
    	int[] data = {5,3,1,9,4,7};
		TestSort.accept(new InsertionSort(), data);
	}
}
