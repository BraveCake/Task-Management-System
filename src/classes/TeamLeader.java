/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Ali Otaku
 */
public class TeamLeader extends Person {
    Employee s;
    private double progress;
    
    
    
    public void setID(int ID) {
        this.setId(ID);
    }
   
    
   public void setProgress(double progress) {
       this.progress = progress;
   }

    public double getProgress() {
        return progress;
    }

    public int getID() {
        return this.getId();
    }
    



   
}
