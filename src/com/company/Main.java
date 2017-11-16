package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{
        Scanner fileSearch =new Scanner(new File("scores.txt"));

        School [] lineData = new School[1000];
        int indx = -1;
        fileSearch.nextLine();          //Skips header line
        while (fileSearch.hasNext()){
            indx++;
            lineData[indx] = new School(fileSearch.nextLine());
        }
            //System.out.println(lineData[0].compositeScore);           Used for testing
        int totalScore = 0;
        int schoolsWithComposite = 0;
        for (int i = 0; i <= 434;i++){
            System.out.println(lineData[i].schoolName+":\t"+lineData[i].compositeScore);            //Lists schools and composite scores

            totalScore += lineData[i].compositeScore;
            if (lineData[i].hasSat){
                schoolsWithComposite++;
            }
        }

        int newYorkAvg = totalScore/schoolsWithComposite;
        System.out.println("\n\nThe average SAT score for New York is:\t"+newYorkAvg);
    }
}
