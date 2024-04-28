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
public class StaffMember extends User {
    private String qualification;
    private Integer experience;
     private List<String> tasks;
     public StaffMember(String firstName,String lastName,String email,Long cin,String qualification,Integer experience,List<String> tasks){
     super(firstName,lastName,email,cin);
     this.qualification=qualification;
     this.experience=experience;
     this.tasks=tasks;
     }
      @Override
public void displayInfo(){
super.displayInfo();
System.out.println(this.qualification+","+this.experience+","+this.tasks);
}
public void updateProfile(String firstName, String lastName,String email,Long cin,String qualification,Integer experience,List tasks){
super.updateProfile(firstName, lastName, email, cin);
this.qualification=qualification;
this.experience=experience;
this.tasks=tasks;
}
    @Override
    public boolean authenticate(){
    super.authenticate();
    return true;
    }
    public void finishTask(String task){}
}
