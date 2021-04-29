package com.tts;

public class QuadraticAlgorithm {

    public void insertation_sort(int numberArray[]) {
        int n = numberArray.length;
        for (int i = 1; i < n; ++i) {
            int position = numberArray[i];
            int j = i - 1;

            while (j >= 0 && numberArray[j] > position) {
                numberArray[j + 1] = numberArray[j];
                j = j - 1;
            }
            numberArray[j + 1] = position;
        }
    }

}
