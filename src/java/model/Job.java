/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Job {

    private String JobId;
    private String Title;
    private java.sql.Date DateOpen;
    private java.sql.Date DateClose;
    private String Location;
    private String Type;
    private String Description;
    private String Skills;
    private String Salary;
    private String EnterpriseID;
    private int isAccept;
    

    public Job() {
    }

    public Job(String Title, java.sql.Date DateOpen, java.sql.Date DateClose, String Location, String Type, String Description, String Skills, String Salary, String EnterpriseID) {
        this.JobId = newID();
        this.Title = Title;
        this.DateOpen = DateOpen;
        this.DateClose = DateClose;
        this.Location = Location;
        this.Type = Type;
        this.Description = Description;
        this.Skills = Skills;
        this.Salary = Salary;
        this.EnterpriseID = EnterpriseID;
        
    }

    public Job(String JobId, String Title, java.sql.Date DateOpen, java.sql.Date DateClose, String Location, String Type, String Description, String Skills , String EnterpriseID, String Salary, int isAccept) {
        this.JobId = JobId;
        this.Title = Title;
        this.DateOpen = DateOpen;
        this.DateClose = DateClose;
        this.Location = Location;
        this.Type = Type;
        this.Description = Description;
        this.Skills = Skills;
        this.Salary = Salary;
        this.EnterpriseID = EnterpriseID;
        this.isAccept = isAccept;
        
    }

    public Job(String JobId, int isAccept) {
        this.JobId = JobId;
        this.isAccept = isAccept;
    }

    public Job(String JobId) {
        this.JobId = JobId;
    }
    
    
    

    public String getJobId() {
        return JobId;
    }

    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public java.sql.Date getDateOpen() {
        return DateOpen;
    }

    public void setDateOpen(java.sql.Date DateOpen) {
        this.DateOpen = DateOpen;
    }

    public java.sql.Date getDateClose() {
        return DateClose;
    }

    public void setDateClose(java.sql.Date DateClose) {
        this.DateClose = DateClose;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getSkills() {
        return Skills;
    }

    public void setSkills(String Skills) {
        this.Skills = Skills;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String Salary) {
        this.Salary = Salary;
    }

    public String getEnterpriseID() {
        return EnterpriseID;
    }

    public void setEnterpriseID(String EnterpriseID) {
        this.EnterpriseID = EnterpriseID;
    }

    public int getIsAccept() {
        return isAccept;
    }

    public void setIsAccept(int isAccept) {
        this.isAccept = isAccept;
    }


    
    

    public String newID() {
        if (JobDB.getListJob().isEmpty()) 
            return "job100";
        ArrayList<Job> listJob = JobDB.getListJob();
        for (Job job : listJob) {
            String numID = job.getJobId().substring(3);
            String nextID = "job" + (Integer.parseInt(numID)+ 1);
            if (!isDupplicatedID(nextID)) {
                return nextID;
            }
        }
        return null;
    }

    public boolean isDupplicatedID(String id) {
        ArrayList<Job> listJob = JobDB.getListJob();
        for (Job job : listJob) {
            if (job.getJobId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public int addNew() {
        return JobDB.addNewJob(this);
    }
    
    public int acceptJob(){
        return JobDB.accepJob(this);
    }
    public  int deleteJob(){
        return  JobDB.deleteJob(this);
    }
}
