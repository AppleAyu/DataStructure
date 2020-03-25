package com.ayu.sort;


public class BubbleSort<T> {
    /**
     * 冒泡排序
     * @param array 要排序的数组
     * @param compareSum 升降序的接口
     * @return 返回冒泡排序经历的趟数
     */
    public int sort(T[] array, CompareSum<T> compareSum) {
        //chance是返回值,返回交换的趟数
        int chance = 0;
        for (int i = 0; i < array.length - 1; i++) {
            //flag是标识位,没有发生变化则代表没有进行交换
            int flag = 0;
            for (int j = 0; j < array.length - i - 1; j++) {
                //交换的条件由自定义的比较接口来实现
                if (compareSum.compareTo(array[j], array[j + 1]) > 0) {
                    T t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                    flag++;
                }
            }
            chance++;//趟数加一
            if (flag == 0) {//如果标识位没变就跳出循环
                break;
            }
        }
        return chance;//返回趟数
    }
}
