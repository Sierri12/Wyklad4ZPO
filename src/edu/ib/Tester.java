package edu.ib;

public class Tester {

    public static void main(String[] args) {
        SalariedEmplyee s1=new SalariedEmplyee("J","D","1",10);
        SalariedEmplyee s2=new SalariedEmplyee("H","S","1",100);
        Invoice i1=new Invoice("mlotek",20,5);
        Invoice i2=new Invoice("siekiera",50,1);

        Payable payableRef=s1;
        payableRef=i1;



        Payable[] payables={s1,s2,i1,i2};

        for (Payable p: payables)
            System.out.println(p.getPaymentAmount());

        Employee e=s1;
        Employee[] employees=new Employee[10];
    }

}
