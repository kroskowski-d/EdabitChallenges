package com.edabit.word_buckets;

import java.util.Arrays;

public class MainBucket {
    public static void main(String[] args){

        String[] file = MakeBuckets.bucketize("the mouse jumped over the cheese", 7);
        System.out.println(Arrays.toString(file));
    }
}
