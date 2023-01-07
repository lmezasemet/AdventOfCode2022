package Day2.Part2;

import java.io.*;

public class RockPaperScissors {

    public static void main(String[] args) throws IOException {

        File inputFile = new File("src/Day2/inputsDay2.txt");
        BufferedReader br = new BufferedReader(new FileReader(inputFile));

        String inputString;
        int score = 0;

        /*
            A = rock
            B = paper
            C = scissors

            (X) = lose
            (Y) = draw
            (Z) = win

            Rock     = 1
            Paper    = 2
            Scissors = 3

            Win  = 6
            Draw = 3
            loss = 0
         */

        while ((inputString = br.readLine()) != null){
            String[] match = inputString.trim().split(" ");

            if(match[0].equals("A") && match[1].equals("X")){ // lose + scissors
                score += 3;
            } else if (match[0].equals("A") && match[1].equals("Y")) { //draw + rock
                score+= 4;
            } else if (match[0].equals("A") && match[1].equals("Z")) { // win + paper
                score+= 8;
            }
            if (match[0].equals("B") && match[1].equals("X")) { //lose + rock
                score+= 1;
            } else if (match[0].equals("B") && match[1].equals("Y")) { // draw + paper
                score+= 5;
            } else if (match[0].equals("B") && match[1].equals("Z")) { // win + scissors
                score+= 9;
            }
            if (match[0].equals("C") && match[1].equals("X")) { // lose + paper
                score+= 2;
            }else if (match[0].equals("C") && match[1].equals("Y")) { // draw + scissors
                score+= 6;
            }else if (match[0].equals("C") && match[1].equals("Z")) { // win + rock
                score+= 7;
            }
        }

        System.out.println(score);

    }
}
