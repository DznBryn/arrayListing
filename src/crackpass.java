
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
public class crackpass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        boolean isTrue = true;
        String in;
        
            System.out.print("Enter a 4 character password: ");
            in = scan.nextLine();
           
                String[] characters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
                String[] slot = new String[4];
                for (int i = 0; i < characters.length;i++){
                   for (int j = 0; j < characters.length; j++){
                       for (int k = 0; k < characters.length; k++){
                            for (int l = 0; l < characters.length; l++){
                                String findpass = characters[i]+characters[j]+characters[k]+characters[l];
                                
                                if(in.equals(findpass)){
                                    System.out.print("found password: " + findpass);
                                    System.exit(0);
                                }
//                                    System.out.println("Found password: " + findpass);
                                
                                
                            }
                       }
                   }
                }  
            
            
        };
        
        
     
}
    
