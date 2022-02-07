package com.edabit.word_buckets;

import java.util.ArrayList;

public class MakeBuckets {
    public static String[] bucketize(String phrase, int n) {

        String newWord;
        ArrayList<String> list = new ArrayList<>();
        String[] bucket = phrase.split(" ");

        for (int i = 0; i < bucket.length; i++) {
            String nextWord = bucket[i];
            if (i != bucket.length - 1) {
                while ((nextWord + " " + bucket[i + 1]).length() <= n) {
                    newWord = nextWord + " " + bucket[i + 1];
                    nextWord = newWord.trim();
                    i++;
                    if (i == bucket.length - 1) {
                        break;
                    }
                }
            }

            if (nextWord.length() <= n && !nextWord.isEmpty()) {
                list.add(nextWord);
            }
        }

        StringBuilder wrd = new StringBuilder();
        for (String s : list) {
            wrd.append(" ").append(s);
        }

        if (wrd.toString().trim().equals(phrase)) {
            String[] newBucket = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                newBucket[i] = list.get(i);
            }
            return newBucket;
        }
        return new String[0];
    }
}
