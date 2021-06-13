/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.singleton.BT4;

/**
 *
 * @author Administrator
 */
public class User {
   String name;
    private boolean voted;

    public User(String name) {
        this.name = name;
        voted = false;
    }
       
    public void vote(Candidate c){
        if (voted == false){
            Election e = Election.createInstance();
            e.vote(c);
            voted =!voted;
            e.showResult();
        }
       
    }    
}
