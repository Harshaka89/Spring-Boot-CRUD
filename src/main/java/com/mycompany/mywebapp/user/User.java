package com.mycompany.mywebapp.user;


import javax.persistence.*;

//JPI annotation
@Entity //map with database
@Table(name = "users") //specify map in tabel
public class User {

    @Id // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // generate value by column
    private Integer id;

    @Column(nullable = false, unique = true, length = 45)//column additional property (not null ,unique,length)
    private String email;

    @Column(length = 15, nullable = false)
    private String Password;

    @Column(length = 45, nullable = false, name = "frist_name")
    private String firsName;

    @Column(length = 45, nullable = false, name = "last_name")
    private String lastName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
