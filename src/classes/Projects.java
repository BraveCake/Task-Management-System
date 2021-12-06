/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author Ali Otaku
 */
public class Projects {
    private int ID;
    private String name;
    private String startDate;
    private String endDate;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    private double projectProgress;
    
    public void setName(String name) {
        this.name = name.toLowerCase();
    }

    public String getName() {
        return name;
    }

  
     
     public int getStartYear()
    {
        return Integer.parseInt(startDate.substring(0,startDate.indexOf("-")));
    }
    public int getStartMonth() {
     return Integer.parseInt(startDate.substring(startDate.indexOf("-")+1,startDate.lastIndexOf("-")));
    
    }
    public int getStartDay(){ 
        return Integer.parseInt(startDate.substring(startDate.lastIndexOf("-")+1));
    }
    public int getEndYear()
    {
        return Integer.parseInt(endDate.substring(0,endDate.indexOf("-")));
    }
    public int getEndMonth() {
     return Integer.parseInt(endDate.substring(endDate.indexOf("-")+1,endDate.lastIndexOf("-")));
    
    }
    public int getEndDay(){ 
        return Integer.parseInt(endDate.substring(endDate.lastIndexOf("-")+1));
    }
    
}       
