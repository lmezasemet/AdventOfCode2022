package Day1.part1;

import java.io.*;

public class CalorieCounting {

    public static void main(String[] args) throws IOException {

        File inputFile = new File("src/Day1/input.txt");
        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        String inputString;
        int max = 0;
        int tempSum = 0;

        while ((inputString = br.readLine()) != null){
            if(inputString.equals("")){
                max = Math.max(tempSum, max);
                tempSum = 0;
            }
            else{
                tempSum+= Integer.parseInt(inputString);
            }
        }
        System.out.println(max);
    }
}
