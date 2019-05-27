package com.myproject190414.util;

/**
 * *****************************************************************************************
 *
 * @ClassName BinarySearch
 * @Author: cjc
 * @Descripeion 二分法查找下标
 * @Date： 2019/5/27 10:22:59
 * @Version 1.0
 * <p>
 * <p>
 * Version    Date                ModifiedBy                 Content
 * --------   ---------           ----------                -----------------------
 * 1.0.0       10:22:592019/5/27     cjc                       初版
 * ******************************************************************************************
 */
public class BinarySearch {
    public static int binarySearch(int[] array,int target){
        //查找范围起点
        int start = 0;
        //查找范围终点
        int end = array.length - 1;
        //查找范围的中位数
        int mid;
        //迭代进行二分法查找
        while(start<=end){
            mid = (start + end) / 2;
            if(array[mid] == target){
                return mid;
            }else if(array[mid] < target){
                start = mid + 1;
            }else{
                end = mid -1;
            }
            System.out.println("mid:"+mid+"  start:"+start+"  end:"+end);
        }
        return -1;
    }
    public static void main(String[] args){
        int[] array = new int[999];
        for(int i =0;i<999;i++){
            array[i] = i;
        }
        System.out.println(binarySearch(array,501));
    }
}
