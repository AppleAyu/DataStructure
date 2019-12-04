package com.ayu.sparseArray;

import java.util.concurrent.ForkJoinPool;

/**
 * 当一个二维数组中大部分都是0的时候，称为“稀疏数组”，由于有很多重复的0，很浪费空间，故此使用压缩技术来压缩稀疏数组
 */
public class sparseArrayTest {
    public static void main(String[] args) {
        //首先有一个11*11的数组，它占有的空间是121*4=484个字节
        int [][]arr= new int [11][11];
        arr[0][0]=1;
        arr[1][1]=12;
        arr[2][4]=88;
        //length用来记录不为0的个数
        int length=0;
        //对数组进行遍历，打印所有元素，可以看到有多少不是0的数字,当找到一个不为0的数字时，length的长度+1
        for(int []row:arr){
            for(int temp:row){
                System.out.printf("%d\t",temp);
                if(temp!=0){
                    length++;
                }
            }
            System.out.println();
        }
        /*
                  对数组进行压缩，将稀疏数组转换成一个n*3的二维数组
                  数组的第一行分别储存原数组的行数、列数、还有不为0的个数
                  从第二行开始，第一列的元素代表不为0的数的原数组的行，第二列代表原数组的列，第三列代表不为0的具体指
                  由于有length个不为0的数，第一行用来存原数组的行列信息，所以n=length+1
         */
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
        //打印压缩后的数组，占有3*3*4=36个字节的空间，压缩率为36/484
        for(int []row:zip){
            for(int elem:row){
                System.out.printf("%d\t",elem);
            }
            System.out.println("ll");
        }
    }
}
