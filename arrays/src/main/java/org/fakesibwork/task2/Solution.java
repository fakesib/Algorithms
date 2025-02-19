package org.fakesibwork.task2;

public class Solution {
    public int maximumWealth(int[][] accounts) {
        int result = 0;
        for (int i = 0; i < accounts.length; i++) {
            int maxSum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                maxSum = maxSum + accounts[i][j];
            }

            if (result < maxSum) {
                result = maxSum;
            }
        }

        return result;
    }
}
