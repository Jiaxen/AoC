package y2021.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day2 {
public static void main(String[]args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("y2021/inputs/day_2"));
    int depth = 0;
    int horizontal = 0;

    String line = br.readLine();
    while (line != null){
        String[] lineData = line.split(" ", 2);
        if (lineData[0] .equals("forward")){
            horizontal += Integer.parseInt(lineData[1]);
        }
        if (lineData[0] .equals("up")){
            depth -= Integer.parseInt(lineData[1]);;
        }
        if (lineData[0] .equals("down")){
            depth += Integer.parseInt(lineData[1]);;
        }
        line = br.readLine();
    }
    System.out.println(depth*horizontal);
    }
}

