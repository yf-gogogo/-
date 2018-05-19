package chapter7;

public class Adapter implements DataOperation{
    private QuickSort quickSort = new QuickSort();
    private BinarySearch binarySearch =new BinarySearch();

    @Override
    public void sort(int[] data) {
        quickSort.quickSort(data,0,data.length-1);
    }

    @Override
    public int search(int[] data,int key) {
        return binarySearch.binarySearch(data,key);

    }
}
