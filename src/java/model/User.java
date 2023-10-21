/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;
import java.util.ArrayList;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


/**
 *
 * @author ASUS
 */
public class User {
    private String UserID;
    private String UserAccount;
    private String UserName;
    private String UserPassword;
    private String Phone;
    private String Gender;
    private java.sql.Date UserDOB;
    private String UserSkills;
    private int isAdmin;
    private String OTP; 
    private String activationFlag;
    private String verificationToken;
    private String signupFlag;
    private String profilePic;
    private String UserFbId;
    private String UserGmailId;

    public User() {
    }

    public User( String UserAccount, String UserPassword) {
        this.UserID = newID();
        this.UserAccount = UserAccount;
        this.UserPassword = UserPassword;
    }

    public User(String UserID, String UserAccount, String UserPassword) {
        this.UserID = UserID;
        this.UserAccount = UserAccount;
        this.UserPassword = UserPassword;
    }
    
    
    
    

    public User(String UserID, String UserAccount, String UserName, String UserPassword, String Phone, String Gender, Date UserDOB, String UserSkills, int isAdmin) {
        this.UserID = UserID;
        this.UserAccount = UserAccount;
        this.UserName = UserName;
        this.UserPassword = UserPassword;
        this.Phone = Phone;
        this.Gender = Gender;
        this.UserDOB = UserDOB;
        this.UserSkills = UserSkills;
        this.isAdmin = isAdmin;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getUserAccount() {
        return UserAccount;
    }

    public void setUserAccount(String UserAccount) {
        this.UserAccount = UserAccount;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String UserPassword) {
        this.UserPassword = UserPassword;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public Date getUserDOB() {
        return UserDOB;
    }

    public void setUserDOB(Date UserDOB) {
        this.UserDOB = UserDOB;
    }

    public String getUserSkills() {
        return UserSkills;
    }

    public void setUserSkills(String UserSkills) {
        this.UserSkills = UserSkills;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getOTP() {
        return OTP;
    }

    public void setOTP(String OTP) {
        this.OTP = OTP;
    }

    public String getActivationFlag() {
        return activationFlag;
    }

    public void setActivationFlag(String activationFlag) {
        this.activationFlag = activationFlag;
    }

    public String getVerificationToken() {
        return verificationToken;
    }

    public void setVerificationToken(String verificationToken) {
        this.verificationToken = verificationToken;
    }

    public String getSignupFlag() {
        return signupFlag;
    }

    public void setSignupFlag(String signupFlag) {
        this.signupFlag = signupFlag;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getUserFbId() {
        return UserFbId;
    }

    public void setUserFbId(String UserFbId) {
        this.UserFbId = UserFbId;
    }

    public String getUserGmailId() {
        return UserGmailId;
    }

    public void setUserGmailId(String UserGmailId) {
        this.UserGmailId = UserGmailId;
    }
    
    
    
    
    public String newID(){
        if(UserDB.getListUser().isEmpty())
            return "user100";
        ArrayList<User> listUser  = UserDB.getListUser();
        for( User user : listUser){
            String numID = user.getUserID().substring(4);
            String nextID = "user"+ (Integer.parseInt(numID)+1);
            if( !isDupplicatedID(nextID)){
                return nextID;
            }
        }
        return null;
    }
    
    public boolean isDupplicatedID(String id){
        ArrayList<User> listUser = UserDB.getListUser();
        for( User user : listUser){
            if(user.getUserID().equals(id)) return true;
        }
        return false;
    }
    public boolean isDupplicatedAccount() {
        ArrayList<User> listUser =  UserDB.getListUser();
        for (User user : listUser) {
            if (user.getUserAccount().equals(this.UserAccount)) return true;
        }
        return false;
    }
    
    public int addNew(){
        return  UserDB.addNewUser(this);
    }
    
    public User login (String acc , String pass) throws NoSuchAlgorithmException{
        return UserDB.login(acc, pass);
    }

}
