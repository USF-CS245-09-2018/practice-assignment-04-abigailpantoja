public class BubbleSort implements SortingAlgorithm {

	void swap( int i, int j,int[]arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	@Override
	public void sort(int[] a) {
		for(int j = 0; j< a.length - 1; j++){
			for(int i = 0; i < a.length -1; i++){
				if(a[i]> a[i+1])
					swap(i,i+1, a);

			}
		}
		


	}
}
