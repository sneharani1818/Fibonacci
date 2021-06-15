/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author Sushil Kumar
 */
import java.util.Scanner;
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    private int terms;
    Fibonacci()
    {
        terms=15;
    }
    Fibonacci(int terms)
    {
        this.terms=terms;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER HOW MANY TERMS OF FIBONACCI SERIES YOU WANT TO PRINT");
        terms=sc.nextInt();
    }
    void generateSeries()
    {
        int a=0, b=1, c=a+b;
        System.out.print(a+"\t"+b+"\t"+c+"\t");
        for(int i=4;i<=terms;i++)
        {
            a=b;
            b=c;
            c=a+b;
            System.out.print(c+"\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Fibonacci f1=new Fibonacci();
        f1.generateSeries();
        Fibonacci f2=new Fibonacci(23);
        f2.generateSeries();
        Fibonacci f3=new Fibonacci();
        f3.input();
        f3.generateSeries();
    }
    
}
