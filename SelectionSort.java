public class SelectionSort implements SortingAlgorithm {
int smallest(int[]a, int start) {
	int smallest = start;
	for(int i = start+1; i<a.length;i++) {
		if(a[i]<a[smallest])
			smallest =i;
	}
	return smallest;
}

void swap(int[]arr, int i, int j) {
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}
@Override
public void sort(int[] a) {
	for(int i = 0; i < a.length-1; i++) {
		int smallest = smallest(a,i);
		swap(a,smallest,i);
	}
}
}