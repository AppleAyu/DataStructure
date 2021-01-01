package com.ayu.sort;

public class SelectSort<T> {
    public void sort(T[] array, CompareSum<T> compareSum){
        int t;
        for(int i=0;i<array.length;i++){
            t=i;
            for(int j=i;j<array.length;j++){
                if(compareSum.compareTo(array[t],array[j])>0){
                    t=j;
                }
            }
            T data =array[i];
            array[i]=array[t];
            array[t]=data;
        }
    }
}
