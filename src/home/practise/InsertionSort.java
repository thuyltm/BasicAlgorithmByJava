package home.practise;

public class InsertionSort implements SortTrategy{
	@Override
	public int[] sort(int[] data) {
		for (int i = 0; i <= data.length - 2; i++) {
			for (int j = i + 1; j <= data.length - 1; j++) {
				int k = 0;
				while (k < j) {
					if (data[j] < data[k]) {
						int insertedData = data[j];
						for (int m = j; m > k; m--) {
							data[m] = data[m-1];
						}
						data[k] = insertedData;  
						break;
					}
					k++;
				}		
			}
		}
		return data;
	}
	
}
