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
public class Vacation {
    private String startDate;
    private String endDate;
    private String  reason;
    private int e_ID;
    private int status;

    public String getStatus() {
        switch (status) {
            case 0:
                return "Pending";
            case 1:
                return "Accepted";
            case -1:
                return "Rejected";
            default:
                return "Unknown" ;
        }
    }
    

    public void setStatus(int status) {
        this.status = status;
    }
    
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
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
    
    public void setEmployeeID(int id)
    {
       e_ID=id;
    }
    public int getEmployeeID()
    {
        return e_ID;
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
