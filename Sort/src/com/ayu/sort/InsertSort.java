package com.ayu.sort;

public class InsertSort<T> {
    public void sort(T []array,CompareSum<T> compareSum){
        for(int i=1;i<array.length;i++){
            T tem=array[i];;
            int j=i;
            for(;j>0&&compareSum.compareTo(array[j-1],tem)>0;j--){
                array[j]=array[j-1];
            }
            array[j]=tem;
        }
    }
}
