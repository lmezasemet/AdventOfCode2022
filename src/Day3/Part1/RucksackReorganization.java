package Day3.Part1;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RucksackReorganization {

    public static void main(String[] args) throws IOException {

        File inputFile = new File("src/Day3/inputDay3.txt");
        BufferedReader br = new BufferedReader(new FileReader(inputFile));

        String inputString;

        String alphabet = "0abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int score = 0;

        while ((inputString = br.readLine()) != null){
            int[] chars = new int[inputString.length()];
            int i =0;
            for (String c: inputString.split("")){
                chars[i] = alphabet.indexOf(c);
                i++;
            }

            int[] first = Arrays.copyOfRange(chars, 0, chars.length/2);
            int[] second= Arrays.copyOfRange(chars, chars.length/2, chars.length);

            Set<Integer> scores = new HashSet<>();
            for (int value : first) {
                for (int j : second) {
                    if (value == j) {
                        scores.add(value);
                    }
                }
            }
            score += scores.stream().reduce(Integer::sum).get();
        }
        System.out.println(score);


    }
}
