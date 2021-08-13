/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Phuong Nguyen
 */
public class Account {
    private String acc_ID;
    private String username;
    private String pass;
    private String permission;

    public Account() {
    }

    public Account(String acc_ID, String username, String pass, String permission) {
        this.acc_ID = acc_ID;
        this.username = username;
        this.pass = pass;
        this.permission = permission;
    }

    public String getAcc_ID() {
        return acc_ID;
    }

    public void setAcc_ID(String acc_ID) {
        this.acc_ID = acc_ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    @Override
    public String toString() {
        return "Account{" + "acc_ID=" + acc_ID + ", username=" + username + ", pass=" + pass + ", permission=" + permission + '}';
    }
    
    
}

