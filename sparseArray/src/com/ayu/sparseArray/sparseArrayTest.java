package com.ayu.sparseArray;

import java.util.concurrent.ForkJoinPool;

public class sparseArrayTest {
    public static void main(String[] args) {
        int [][]arr= new int [11][11];
        arr[0][0]=1;
        arr[1][1]=12;
        arr[2][4]=88;
        for(int row[]:arr){
            for(int temp:row){
                System.out.printf("%d\t",temp);
            }
            System.out.println();
        }
        int length=0;
        for(int row[]:arr){
            for(int temp:row){
                if(temp!=0){
                    length++;
            }
        }
    }
        int [][]zip= new int[length+1][3];
        zip[0][0]=arr.length;
        zip[0][1]=arr[0].length;
        zip[0][2]=length;
        int num=1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                if(arr[i][j]!=0){
                    zip[num][0]=i;
                    zip[num][1]=j;
                    zip[num][2]=arr[i][j];
                    num++;
                }
            }
        }
        for(int row[]:zip){
            for(int elem:row){
                System.out.printf("%d\t",elem);
            }
            System.out.println("ll");
        }
    }
}
