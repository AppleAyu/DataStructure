package com.ayu.sort;
@FunctionalInterface
public interface CompareSum<T> {
    //返回值大于0是交换的条件，可以自定义
    int compareTo(T t1,T t2);
}
