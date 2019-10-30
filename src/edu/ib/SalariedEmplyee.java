package edu.ib;

public class SalariedEmplyee extends Employee {

    private double salary;

    public SalariedEmplyee(String firstName, String lastName, String ssn, double salary) {
        super(firstName, lastName, ssn);
        this.salary=salary;
    }

    @Override
    public double earnings() {
        return salary;
    }

    @Override
    public String toString() {

        String s1=super.toString();
        String s2=Double.toString(salary);

        return s1.concat(s2);
    }
}
