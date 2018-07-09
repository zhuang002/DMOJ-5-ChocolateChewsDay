/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocolatechewsday;

import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class ChocolateChewsDay {

    static Scanner sc=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i=0;i<2;i++) {
            processOneCompetition();
        }
    }

    private static void processOneCompetition() {
        int n = sc.nextInt();
        sc.nextLine();
        ChocolateScore[] chocolateScores=new ChocolateScore[n];
        
        String name = sc.nextLine();
        for (int i=0;i<n;i++) {
            if (name.equals("*")) break;
            chocolateScores[i]=new ChocolateScore();
            chocolateScores[i].name=name;
            
            while (true) {
                String line=sc.nextLine();
                
                if (!line.equals("*") && line.substring(0,2).equals("J ")) {
                    String[] scores=line.split(" ");
                    chocolateScores[i].p+=Long.parseLong(scores[1]);
                    chocolateScores[i].f+=Long.parseLong(scores[2]);
                    chocolateScores[i].g+=Long.parseLong(scores[3]);
                } else {
                    name=line;
                    break;
                }
            }
        }
        long winerScore=0;
        for (int i=0;i<n;i++) {
            long score=chocolateScores[i].getScore();
            if (winerScore<score) {
                winerScore=score;
            }
        }
        boolean first=true;
        for (int i=0;i<n;i++) {
            if (chocolateScores[i].getScore()==winerScore) {
                if (first) first=false;
                else {
                    System.out.print(",");
                }
                System.out.print(chocolateScores[i].name);
            }
        }
        System.out.println();
    }
    
}
