/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercice2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author DELL
 */
@Getter
@Setter
@NoArgsConstructor
public class Student extends User {
    private double average;
    private Classes classe;
    private Status status;
   public Student(String firstName,String lastName,String email,Long cin,double average,Classes classe,Status status){
   super(firstName,lastName,email,cin);
   this.average=average;
   this.classe=classe;
   this.status=status;
   }
 @Override
public void displayInfo(){
super.displayInfo();
System.out.println(this.average+","+this.classe+","+this.status);}
public void updateProfile(String firstName, String lastName,String email,Long cin,Double average,Classes classes,Status status){
    super.updateProfile(firstName, lastName, email, cin);
    this.average= average;
    this.classe=classe;
    this.status=status;
}
    @Override
    public boolean authenticate(){
    super.authenticate();
    return true;
    }
}
