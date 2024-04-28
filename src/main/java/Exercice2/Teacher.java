/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercice2;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author DELL
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Teacher extends User {
     private Long hIndex;
    private List<Course> courses;
    public Teacher(String firstName,String lastName,String email,Long cin,Long hIndex,List<Course> courses){
    super(firstName,lastName,email,cin);
    this.hIndex=hIndex;
    this.courses=courses;
    }
     @Override
    public void displayInfo(){
super.displayInfo();
System.out.println(this.hIndex+","+this.courses);
 }
public void updateProfile(String firstName, String lastName,String email,Long cin,Long hIndex,List courses)  {
super.updateProfile(firstName, lastName, email, cin);
this.hIndex = hIndex;
this.courses = courses;} 
    @Override
  public boolean authenticate(){
    super.authenticate();
    return true;
    }
  public void displayCoursesContent(){
      for (int i = 0; i < this.courses.size(); i++) {
    System.out.println(this.courses.get(i));
}
  }
}
