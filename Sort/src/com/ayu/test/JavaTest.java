package com.ayu.test;

import com.ayu.sort.BubbleSort;
import com.ayu.sort.CompareSum;
import com.ayu.sort.InsertSort;
import org.junit.Test;

import java.util.Arrays;

public class JavaTest {
    Integer[] array = {12, 532, 24, 123, -7, 70, 69, 22, -9, -6, 3};
    Integer[] array2 = {5,4,3,2,1};
    @Test
    public void testBubble() {
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(bubbleSort.sort(array2, (t1, t2) -> (Integer) t1 - (Integer) t2));
        System.out.println(Arrays.toString(array2));
    }
    @Test
    public void testInsert(){
        InsertSort<Integer> insertSort=new InsertSort();
        insertSort.sort(array, (t1, t2) ->t1 - t2);
        System.out.println(Arrays.toString(array));
    }
    public void test(){

    }

}
