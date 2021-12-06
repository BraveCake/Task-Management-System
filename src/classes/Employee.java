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
public class Employee extends Person {
     private String entryTime;
     private String exitTime;
     private double salary;
     private int T_ID; // team leader id
    public void setID(int ID) {
        this.setId(ID);
    }    
    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public void setExitTime(String exitTime) {
        this.exitTime = exitTime;
    }

   
    
    
    public String getEntryTime() {
        return entryTime;
    }

    public String getExitTime() {
        return exitTime;
    }
    

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getID() {
        return this.getId();
     }      

    public int getT_ID() {
        return T_ID;
    }

    public void setT_ID(int T_ID) {
        this.T_ID = T_ID;
    }
     
      
    
}

