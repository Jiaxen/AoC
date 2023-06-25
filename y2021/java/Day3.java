package y2021.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Day3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("y2021/inputs/day_3"));
        String line = br.readLine();
        int cols = line.length();
        int rows = 0;
        int[] sums = new int[cols];

        while (line != null) {
            rows++;
            for (int i = 0; i < cols; i++) {
                sums[i] += line.charAt(i) - '0';
            }
            line = br.readLine();
        }

        int threshold = rows / 2;
        for (int i = 0; i < cols; i++) {
            if (sums[i] > threshold) {
                sums[i] = 1;
            } else {
                sums[i] = 0;
            }
        }

        int gamma = convertBinaryArrayToDecimal(sums);

        for (int i = 0; i < cols; i++) {
        sums[i] = Math.abs(1-sums[i]);
        }
        int eps = convertBinaryArrayToDecimal(sums);

        System.out.println(gamma * eps);

    }

    static int convertBinaryArrayToDecimal(int[] nums){
        int dec = 0;
        int p = 0;
        for (int i = nums.length-1 ; i >= 0 ; i--){
            dec += Math.pow(2,p) * nums[i];
            p++;
        }
        return dec;
    }

}
