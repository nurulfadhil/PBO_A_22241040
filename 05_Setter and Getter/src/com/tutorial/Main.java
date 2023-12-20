package com.tutorial;

class User {
    private String username;
    private String password;

    //membuat konstruktor
    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //method getter
    public String getUsername(){
        return this.username;

    }

    public String getPassword(){
        return this.password;
    }

    //method setter
    public void setPassword(String password){
        this.password = password;
    }
}

public class Main {
    public static void main(String[] args) {
        //instansiasi objek
        User person_1 = new User("ila", "ila123");        
        //panggil method getter
        System.out.println(person_1.getUsername());
        System.out.println(person_1.getPassword());

        person_1.setPassword("ila123");
        System.out.println("new password:" + person_1.getPassword());

    

    
 
       
        

    }
}