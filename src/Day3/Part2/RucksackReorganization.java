package Day3.Part2;

import java.io.*;
import java.util.*;

public class RucksackReorganization {

    public static void main(String[] args) throws IOException {

        File inputFile = new File("src/Day3/inputDay3.txt");
        BufferedReader br = new BufferedReader(new FileReader(inputFile));

        String inputString;

        String alphabet = "0abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int score = 0;

        List<Set<Integer>> lists = new ArrayList<>();
        lists.add(new HashSet<>());
        lists.add(new HashSet<>());
        lists.add(new HashSet<>());
        int listIndex = 0;

        while ((inputString = br.readLine()) != null){
            for (String c: inputString.split("")){
                lists.get(listIndex).add(alphabet.indexOf(c));
            }
            listIndex++;
            if(listIndex < 3){
                continue;
            }

            lists.get(0).retainAll(lists.get(1));
            lists.get(0).retainAll(lists.get(2));

            score += lists.get(0).stream().reduce(Integer::sum).get();

            lists = new ArrayList<>();
            lists.add(new HashSet<>());
            lists.add(new HashSet<>());
            lists.add(new HashSet<>());
            listIndex = 0;

        }
        System.out.println(score);


    }
}
