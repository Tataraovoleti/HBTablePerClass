/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author TATARAO
 */
public class Employee extends InPersons {
    
    private double salary;
    private int department;
    
        public double getSalary() {
        return this.salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getDepartment() {
        return this.department;
    }
    
    public void setDepartment(int department) {
        this.department = department;
    }
}
