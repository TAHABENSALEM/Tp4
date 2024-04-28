/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercice2;

import java.util.List;

/**
 *
 * @author DELL
 */
public class Course {
    private String name;
    private List<String> contents;
    private float coef;
    public Course(String name,List<String> contents,float coef){
    this.name=name;
    this.contents=contents;
    this.coef=coef;
    }
}
