package org.binfoo.bean;

/**
 * Created by ZhangHongbin on 2017/9/18.
 */
public class User {

    private Long id;
    private String username;
    private String password;
    private String address;

    public User(){

    }

    public User(Long id,String username,String password,String address){
        this.id = id;
        this.password = password;
        this.address = address;
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "address='" + address + '\'' +
                ", id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
