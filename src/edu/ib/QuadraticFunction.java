package edu.ib;

public class QuadraticFunction implements ScalarFunction {
    private double a,b,c;

    public QuadraticFunction(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }



    @Override
    public double calculateFunctionValue(double x) {
        return a*Math.pow(x,2)+b*x+c;
    }
}
