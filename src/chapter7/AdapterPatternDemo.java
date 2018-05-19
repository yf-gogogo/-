package chapter7;

import java.util.Arrays;

public class AdapterPatternDemo {
    public static void main(String[] args){
        DataOperate dataOperate = new DataOperate();

        System.out.println("********排序********");
        int[] a = new int[] { 2, 1, 6, 7, 8, 5, 3, 5 };
        System.out.println("排序前："+Arrays.toString(a));
        dataOperate.sort(a);
        System.out.println("排序后："+Arrays.toString(a));

        System.out.println("********查找********");
        int[] arr = {1,3,5,7,9,11};
        System.out.println("序列为"+Arrays.toString(arr));
        int key = 4;
        int position = dataOperate.search(arr,key);
        if(position == -1){
            System.out.println("查找的是"+key+",序列中没有该数！");
        }else{
            System.out.println("查找的是"+key+",找到位置为："+position);
        }
    }
}
