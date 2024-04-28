/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercice2;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
/**
 *
 * @author DELL
 */
@Getter
@Setter

@NoArgsConstructor

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private Long cin;
    public User(String firstName,String lastName,String email,Long cin){
    this.firstName=firstName;
    this.lastName=lastName;
    this.email=email;
    this.cin=cin;}
public void displayInfo(){
    System.out.println(this.firstName+","+this.lastName+","+this.email+","+this.cin);}
    
public void updateProfile(String firstName, String lastName,String email,Long cin){
 this.firstName= firstName;
    this.lastName= lastName;
    this.email= email;
    this.cin= cin;}

public boolean authenticate(){
return true;}
}
