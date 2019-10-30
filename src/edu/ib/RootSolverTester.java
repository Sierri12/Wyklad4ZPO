package edu.ib;

public class RootSolverTester {
    public static void main(String[] args) {
        RootSolver rs1=new RootSolver(0,2,new QuadraticFunction(1,0,-1));
        RootSolver rs2=new RootSolver(-0.5,0.5,new MySin(1,1));
        rs1.bisection();

    }
}
