/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bill;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author asus
 */
public class stu {
    public static void main(String[] args){
        ArrayList<student> stud=new ArrayList<>(20);
        stud.add(new student("ram",1,9.1));
        stud.add(new student("meghna",2,7.6));
        stud.add(new student("anu",3,7));
        stud.add(new student("sam",4,6.0));
        stud.add(new student("sandy",5,7.7));
        stud.add(new student("anitha",6,8.0));
        stud.add(new student("kumar",7,6.7));
        stud.add(new student("ramya",8,9.8));
        stud.add(new student("rena",9,10));
        stud.add(new student("niki",10,9.26));
        stud.add(new student("sorna",11,8.26));
        stud.add(new student("inba",12,8.3));
        stud.add(new student("mohan",13,7.8));
        stud.add(new student("meena",14,9.1));
        stud.add(new student("priya",15,5.5));
        stud.add(new student("kavya",16,6.7));
        stud.add(new student("arjun",17,8.7));
        stud.add(new student("rohini",18,8.89));
        stud.add(new student("abi",19,9.1));
        stud.add(new student("ravi",20,9.99));
        
        Collections.sort(stud,new namesort());
        System.out.println(stud);
        
        
    }
    
}
class student
{
    String name;
    long rollno;
    double cgpa;
    student(String n,long r,double c)
    {
        name=n;
        rollno=r;
        cgpa=c;
    }
    public String toString()
    {
        return "\nName:"+name+" Roll.no:"+rollno+" CGPA:"+cgpa;
    }
}
class namesort implements Comparator<student>
{
    public int compare(student s1,student s2)
    {
        return s1.name.compareTo(s2.name);
    }
}