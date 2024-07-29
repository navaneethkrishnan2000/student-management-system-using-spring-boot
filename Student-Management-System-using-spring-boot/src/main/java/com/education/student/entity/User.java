// package com.education.student.entity;

// import java.util.UUID;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.Table;

// @Entity
// @Table(name = "user")
// public class User {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private UUID id;

//     private String username;

//     private String password;

//     //Constructor
//     public User() {
//     }

//     public User(UUID id, String username, String password) {
//         this.id = id;
//         this.username = username;
//         this.password = password;
//     }

//     //Getters and Setters
//     public UUID getId() {
//         return this.id;
//     }

//     public void setId(UUID id) {
//         this.id = id;
//     }

//     public String getUsername() {
//         return this.username;
//     }

//     public void setUsername(String username) {
//         this.username = username;
//     }

//     public String getPassword() {
//         return this.password;
//     }

//     public void setPassword(String password) {
//         this.password = password;
//     }

//     //to String
//     @Override
//     public String toString() {
//         return "{" +
//             " id='" + getId() + "'" +
//             ", username='" + getUsername() + "'" +
//             ", password='" + getPassword() + "'" +
//             "}";
//     }


    
// }
