package chapter7;

public class BinarySearch {
    public int binarySearch(int[] data,int key){
        int low = 0;
        int high = data.length - 1;
        int middle = 0;         //定义middle  

        if(key < data[low] || key > data[high] || low > high){
            return -1;
        }

        while(low <= high){
            middle = (low + high) / 2;
            if(data[middle] > key){
                //比关键字大则关键字在左区域  
                high = middle - 1;
            }else if(data[middle] < key){
                //比关键字小则关键字在右区域  
                low = middle + 1;
            }else{
                return middle;
            }
        }

        return -1;      //最后仍然没有找到，则返回-1  
    }
}
