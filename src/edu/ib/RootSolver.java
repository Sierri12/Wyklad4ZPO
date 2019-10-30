package edu.ib;

public class RootSolver {
    private double a;
    private double b;
    private ScalarFunction f;

    public RootSolver(double a, double b, ScalarFunction f) {
        this.a = a;
        this.b = b;
        this.f = f;
    }

    public double bisection(){
        if(f.calculateFunctionValue(a)*f.calculateFunctionValue(b)<0)
            System.out.println("Wartosci na koncach przedzialow maja rozne znaki");
        return 0;
    }

}
