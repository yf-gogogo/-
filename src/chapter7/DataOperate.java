package chapter7;

public class DataOperate implements DataOperation {
    private Adapter adapter = new Adapter();
    @Override
    public void sort(int[] data) {
        adapter.sort(data);
    }

    @Override
    public int search(int[] data, int key) {
        return adapter.search(data,key);
    }
}
