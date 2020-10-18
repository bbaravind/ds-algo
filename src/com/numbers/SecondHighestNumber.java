package com.numbers;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class SecondHighestNumber {
    public static int usingPriorityQueue(int[] input){
        PriorityQueue<Integer> queue = new PriorityQueue<>(16, Collections.reverseOrder());
        for( int x : input){
            queue.add(x);
        }
        queue.poll();
        return queue.poll();
    }

    public static int findSecondLarget(int [] input){
        int result = 0;
        int largest=Integer.MIN_VALUE,s_largest = Integer.MIN_VALUE;
        for(int i=0;i<input.length;i++){
            if(input[i]>largest){
                s_largest = largest;
                largest = input[i];
            }else if(input[i] > s_largest && input[i] < largest){
                s_largest = input[i];
            }
        }
        return s_largest;
    }

    public static void main(String[] args) {
        int[] a = {2,100,1,10};
        System.out.println(usingPriorityQueue(a));
        System.out.println(findSecondLarget(a));
    }
}
