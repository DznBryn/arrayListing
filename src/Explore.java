
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

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
       
       // Example of Data Structures List, Set, & SortedSet 
       List<String> fel = Arrays.asList("HTML","CSS","JavaScript");
       List<String> bel = Arrays.asList("PHP","Ruby","Objective-C","Swift","JavaScript");
       
       List<String> allLanguages = new ArrayList<String>(fel);
       allLanguages.addAll(bel);
       System.out.println("Example of List(ArrayList) - unsorted list and adds duplicates: "+allLanguages);
       
       
       Set<String> uniqueLanguage = new HashSet<String>(allLanguages);
       System.out.println("Example of Set(HashSet) - unsorted list that takes no duplicates: "+uniqueLanguage);
       
       uniqueLanguage = new TreeSet<String>(allLanguages);
       System.out.println("Example of Set(TreeSet) - sorted list and take no duplicates: "+uniqueLanguage);
       
       uniqueLanguage.add("C#");
       System.out.println("Example of Adding new item \"C#\" to the TreeSet Sorted list: "+uniqueLanguage);
       
       SortedSet<String> uL2 = new TreeSet<String>(uniqueLanguage);
       System.out.println("Example of SortedSet(TreeSet) using .headSet only taking items before the letter \"J\": "+uL2.headSet("J"));
       
       System.out.println("Example of SortedSet(TreeSet) using .tailSet only taking items after the Letter \"J\": "+uL2.tailSet("J"));
       
       System.out.println("Example of SortedSet(TreeSet) using .sub only taking items that begins with the Letter \"J\": "+uL2.subSet("J", "J" + Character.MAX_VALUE));

       // Examples of using Map - each key can hold up to one value
       Map<String, String> tweet = new HashMap<String, String>();
       tweet.put("@brian ", " Hey World!");
       tweet.put("@World ", " Hey Brian");
       
       System.out.println(tweet);
       
       for(Map.Entry entry: tweet.entrySet()){
           System.out.printf("%s - \" %s \" %n",entry.getKey(),entry.getValue());
       }
    }
    
}
