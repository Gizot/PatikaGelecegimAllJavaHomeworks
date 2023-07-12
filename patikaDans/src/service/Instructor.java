package service;

import model.Branch;
import model.Sex;

import model.Instructor;

import java.math.BigDecimal;
import java.util.List;

public class Instructor {
    /*
     private String name;
    private List<Branch> branchList;
    private int age;
    private Sex sex;
    private BigDecimal salary;
     */

    public Instructor createInstructor(String name, Branch branchList,
                                       int age, Sex sex, BigDecimal salary) {
        Instructor instructor = new Instructor();
        instructor.setName(name);
        instructor.setBranchList(branchList);
        instructor.setAge(age);
        instructor.setSex(sex);
        instructor.setSalary(salary);
        return instructor;
    }
}
