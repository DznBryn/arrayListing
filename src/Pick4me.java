
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bryan
 */
public class Pick4me {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
//        System.out.println("Having a tough time picking a spot to eat?\nTell us what your in the mood for:");
//        String userPicks = in.nextLine();

        // Problem: Needs to take an array of user inputs
        String[] lunchSpot = {"a","b","c","d","e","f","g","h","i","j","k","l","m",
                              "n","o","p","q","r","s","t","u","v","w","x","y","z"};
        System.out.println(picklunchspot(lunchSpot));
    }
    
    
    // Function: array of lunch spots input by the user that will randomly pick a spot 
    public static String picklunchspot(String... spots){
        Random random = new Random();
        if(spots.length == 0){
            System.out.printf("There are %d spots chosen.", spots.length);
        }
        return spots[random.nextInt(spots.length)];
    };
}
