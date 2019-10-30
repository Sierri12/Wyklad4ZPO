package edu.ib;

public class MySin implements ScalarFunction {
    private double a,f;

    public MySin(double a,double f){
        this.a=a;
        this.f=f;
    }

    @Override
    public double calculateFunctionValue(double x) {
        return a*Math.sin(2*Math.PI*f*x);
    }
}
