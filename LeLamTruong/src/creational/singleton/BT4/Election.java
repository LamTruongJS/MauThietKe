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
public class Election {
    int trump=0;
    int biden=0;
    
    private static Election instance;
    private Election(){}
    
    public static Election createInstance(){
        if (instance == null)
            instance = new Election();
        return instance;
    }

    public void vote(Candidate c){
        if(c==Candidate.DonalTrump)
            trump++;
        if(c==Candidate.JoeBiden)
            biden++;
              
    }
    
    public void showResult(){

        System.out.println("Donal Trump: "+trump+"\nJoe Biden: "+biden);
    }
}
