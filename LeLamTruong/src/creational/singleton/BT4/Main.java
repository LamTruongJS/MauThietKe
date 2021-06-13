/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.singleton.BT4;

import java.util.Random;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User user1 = new User("Truong");
        user1.vote(Candidate.JoeBiden);
        user1.vote(Candidate.DonalTrump);//X
        
        User user2 = new User("Hope");
        user2.vote(Candidate.DonalTrump);
        user2.vote(Candidate.DonalTrump);
   
    }
    
}
