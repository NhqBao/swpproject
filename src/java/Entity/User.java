/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;

/**
 *
 * @author msi-pc
 */
public class User {

    public User(int userID, String userName, String password, int userPhone, String userEmail, String userGender, int isSelf, int isAdmin) {
        this.userID = userID;
        this.userName = userName;
        this.password = password;
        this.userPhone = userPhone;
        this.userEmail = userEmail;
        this.userGender = userGender;
        this.isSelf = isSelf;
        this.isAdmin = isAdmin;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(int userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public int getIsSelf() {
        return isSelf;
    }

    public void setIsSelf(int isSelf) {
        this.isSelf = isSelf;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "User{" + "userID=" + userID + ", userName=" + userName + ", password=" + password + ", userPhone=" + userPhone + ", userEmail=" + userEmail + ", userGender=" + userGender + ", isSelf=" + isSelf + ", isAdmin=" + isAdmin + '}';
    }


    private int userID;
    private String userName;
    private String password;
    private int userPhone;
    private String userEmail;
    private String userGender;
    private int isSelf;
    private int isAdmin;


}
