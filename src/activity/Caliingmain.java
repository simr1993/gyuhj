/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 1792937
 */
public class Caliingmain {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        Student stu = new Student(5, "amit", "kumar", "mad");
        Employee emp = new Employee(2500.9, 6, "Raghu", "goswami");
        Person per=new Person(9, "arzoo", "rajput");
        Graduation g=new Graduation(7,"amaya","sharma","IT", format.parse("28/09/1994"));
        emp.displayInfo();
        g.display();
        stu.displayInfo();
        
        
        g.setGraduation_year(format.parse("09/06/1994"));
        g.display();
        per.displayInfo();
        
        
    }
}
