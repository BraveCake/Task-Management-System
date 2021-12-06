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
public class Tasks {
    private int p_ID;
    private String name ;
    private String startDate;
    private String endDate;
    private String projectName;
    private float progress;
    private int  e_ID;
    private int  t_ID;
    private double e_Progresss;
    private String  employeeName;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public float getProgress() {
        return progress;
    }

    public void setProgress(float progress) {
        this.progress = progress;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    

    public int getPID() {
        return p_ID;
    }

    public void setPID(int ID) {
        this.p_ID = ID;
    }
    

  
    public Tasks() {
      
    }
    

    public void setName(String name) {
        this.name = name.toLowerCase();
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

   

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setP_ID(int p_ID) {
        this.p_ID = p_ID;
    }

    public void setE_ID(int e_ID) {
        this.e_ID = e_ID;
    }

    public void setT_ID(int t_ID) {
        this.t_ID = t_ID;
    }

    public void setE_Progresss(double e_Progresss) {
        this.e_Progresss = e_Progresss;
    }

    public String getEndDate() {
        return endDate;
    }
    public  void  assinedEmployee(Employee e){
         e_ID=e.getID();
     }
    
    public  void  assinedTeamLeader(TeamLeader t ){
         t_ID=t.getID();
     }
    
     public  void  progressOfTask(TeamLeader t){
         e_Progresss=t.getProgress();
     }
    
    
    public int getE_ID() {
        return e_ID;
    }

    public int getT_ID() {
        return t_ID;
    }

    public double getE_Progresss() {
        return e_Progresss;
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