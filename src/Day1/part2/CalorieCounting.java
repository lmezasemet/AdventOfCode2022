package Day1.part2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class CalorieCounting {

    public static void main(String[] args) throws IOException {

        File inputFile = new File("src/Day1/input.txt");
        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        String inputString;
        ArrayList<Integer> calories = new ArrayList<>();
        int tempSum = 0;

        while ((inputString = br.readLine()) != null){
            if(inputString.equals("")){
                calories.add(tempSum);
                tempSum = 0;
            }
            else{
                tempSum+= Integer.parseInt(inputString);
            }
        }
        Collections.sort(calories);
        System.out.println(calories.get(calories.size()-3) + calories.get(calories.size()-2) + calories.get(calories.size()-1));
    }
}
