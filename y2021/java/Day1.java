package y2021.java;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public final class Day1 {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("y2021/inputs/day_1"));
        String line = br.readLine();
        int prev = Integer.parseInt(line);
        int curr;
        int result = 0;

        line = br.readLine();
        while (line != null)
        {
            curr = Integer.parseInt(line);
            if (curr > prev) {
                result += 1;
            }
            prev = curr;
            line = br.readLine();
        }
        System.out.println(result);
    }
}

