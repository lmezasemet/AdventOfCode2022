package Day2.Part1;

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

            Rock (X)     = 1
            Paper (Y)    = 2
            Scissors (Z) = 3

            Win  = 6
            Draw = 3
            loss = 0
         */

        while ((inputString = br.readLine()) != null){
            String[] match = inputString.trim().split(" ");

            if(match[0].equals("A") && match[1].equals("X")){ // rock + draw
                score += 4;
            } else if (match[0].equals("A") && match[1].equals("Y")) { //paper + win
                score+= 8;
            } else if (match[0].equals("A") && match[1].equals("Z")) { // scissors + loss
                score+= 3;
            }
            if (match[0].equals("B") && match[1].equals("X")) { //rock + loss
                score+= 1;
            } else if (match[0].equals("B") && match[1].equals("Y")) { // paper + draw
                score+= 5;
            } else if (match[0].equals("B") && match[1].equals("Z")) { // scissors + win
                score+= 9;
            }
            if (match[0].equals("C") && match[1].equals("X")) { // rock + win
                score+= 7;
            }else if (match[0].equals("C") && match[1].equals("Y")) { // paper + loss
                score+= 2;
            }else if (match[0].equals("C") && match[1].equals("Z")) { // scissors + draw
                score+= 6;
            }
        }

        System.out.println(score);

    }
}
