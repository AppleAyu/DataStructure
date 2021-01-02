package com.ayu.test;

import com.ayu.sort.*;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class JavaTest {
    static Integer[] array = new Integer[100000];
    static {
        for(int i=0;i<100000;i++){
            array[i]=(int)(Math.random()*100000);
        }
    }
    Integer[] array2 = {231,1234,213,436,23,1235,346,342,346,235,354,234,436,648,57,568,31,4234,534,547,2,637};
    @Test
    public void testBubble() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-DD hh:mm:ss");
        System.out.println(simpleDateFormat.format(new Date()));
        BubbleSort<Integer> bubbleSort = new BubbleSort();
        System.out.println(bubbleSort.sort(array, (t1, t2) -> t2 - t1));
        System.out.println(simpleDateFormat.format(new Date()));
    }
    @Test
    public void testInsert(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-DD hh:mm:ss");
        System.out.println(simpleDateFormat.format(new Date()));
        InsertSort<Integer> insertSort=new InsertSort();
        insertSort.sort(array, (t1, t2) ->t1 - t2);
        System.out.println(simpleDateFormat.format(new Date()));
    }
    @Test
    public void testSelect(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-DD hh:mm:ss");
        System.out.println(simpleDateFormat.format(new Date()));
        SelectSort<Integer> selectSort=new SelectSort();
        selectSort.sort(array2,(t1, t2) ->t1 - t2);
        System.out.println(simpleDateFormat.format(new Date()));
    }
    @Test
    public void testShell(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-DD hh:mm:ss");
        System.out.println(simpleDateFormat.format(new Date()));
        ShellSort<Integer> shellSort=new ShellSort<>();
        shellSort.sort(array2,(t1, t2) ->t1 - t2);
        System.out.println(Arrays.toString(array2));
        System.out.println(simpleDateFormat.format(new Date()));
    }
    @Test
    public void testQuick(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-DD hh:mm:ss");
        System.out.println(simpleDateFormat.format(new Date()));
        Arrays.sort(array);
        System.out.println(simpleDateFormat.format(new Date()));
    }
}
