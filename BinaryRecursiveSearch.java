public class BinaryRecursiveSearch implements Practice03Search {
	int search(int arr[], int l, int r, int x)
	{
		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == x) 
				return mid; 
			if (arr[mid] > x)
				return search(arr, l, mid - 1, x);
			return search(arr, mid + 1, r, x);
			}
		return -1;
		}

	@Override
	public int search(int[] arr, int target) {
		return 0;
	}
}
