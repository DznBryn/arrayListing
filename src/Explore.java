/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bryan
 */
public class Explore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String[] friends = {"Brian","Nate","Lisa"};
       
       // Example of an enchanced for loop .... for each "friend" in "friends" 
       // This process is called iterating, which this is iterating over the "friends" array
       // Arrays are iterable
       for (String friend : friends) {
           // This will loop through all values in the "friends" array repeating the print statment below
           System.out.printf("Hey %s! %n", friend);
       }
       // Old fashion for loop best use to keep count
       for (int index = 0; index <= friends.length - 1; index++) {
           String friend = friends[index];
           System.out.printf("Hey %s! %n", friend);
       }
       
       int[] bensScoreCard = {1, 2, 1, 5, 2, 4, 4, 4, 3, 6, 1, 2, 5, 4, 3, 2, 6, 3};
       
       for (int index = 0; index < bensScoreCard.length; index++) {
        System.out.printf("Hole in #%d: %d! %n", index + 1, bensScoreCard[index]);
       }
       
       // Example of Multidimensional Arrays
       int[][] scoreCards = {
            {1, 2, 4, 2, 6, 5, 4, 3, 3, 2, 5, 7, 2, 7, 8, 4, 3, 2},
            {2, 3, 5, 1, 1, 2, 3, 1, 1, 2, 4, 1, 3, 3, 2, 6, 3, 2},
            {4, 4, 2, 1, 2, 2, 1, 4, 2, 2, 2, 3, 2, 5, 8, 1, 2, 2}
       };
       // for each friend
       for (int i = 0; i < friends.length; i++) {
           // print their name
           System.out.printf("%s %n", friends[i]);
      // for each hole
       for(int j = 0; j < scoreCards[i].length; j++) {
           // print their score
           System.out.printf("%d %d %n",j+1,scoreCards[i][j]);
        }
       }
    }
    
}
