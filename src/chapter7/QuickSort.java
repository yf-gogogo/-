package chapter7;

public class QuickSort {
    public void quickSort(int[] data,int begin,int end){
        int tbegin = begin, tend = end;
        // 将第一个值作为快排序的分界值  
        int pivot = data[begin];
        while (tbegin < tend) {
            // 如果两个游标没有交集，或者后面一直大于或等于分界值就一直向前移动  
            while (tbegin < tend && data[tend] >= pivot) {
                --tend;
            }
            data[tbegin] = data[tend];
            // 如果两个游标没有交集，或者前面是小于或等于分界值，就一直向后头移动  
            while (tbegin < tend && data[tbegin] <= pivot) {
                ++tbegin;
            }
            data[tend] = data[tbegin];

        }
        // 将临界值赋值给游标的交集的地方  
        data[tbegin] = pivot;
        if (begin < tend) {
            // 递归排序游标的左边  
            quickSort(data, begin, tend - 1);
        }
        if (tbegin < end) {
            // 递归排序游标的右边  
            quickSort(data, tbegin + 1, end);
        }
    }
}
