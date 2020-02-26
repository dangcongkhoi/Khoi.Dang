package VTC_JavaOOP.lab1;

import java.util.Arrays;

public class Fraction {
    private int n,d;

    // Constructors
    public Fraction () { // default
        n=0; d=1;
    }

    public Fraction (int n, int d) { // with parameters
        this.n = n; // this is the member variable
        this.d = d;
    }



    // std method for conversion to string
    public String toString () {
        return ("Fraction("+n+"/"+d+")=" + (double) n/ (double) d);
    }


    // this implements Comparable (see: Interface java.lang.Comparable)
    // uses Java 5.0 Generics
    public int compareTo(Fraction o) {
        double me = (double) n/ (double) d;
        double other = (double) o.n / (double) o.d;
        if (me < other) { return -1; }
        if (me > other) { return 1; }
        return 0;
    }
    public static void main(String[] argv) {

        Fraction [] myFracs = new Fraction[5];


        // create random fractions
        for (int i=0; i< myFracs.length; i++) {
            int n= (int) (Math.random()*10);
            int d= (int) (Math.random()*9) +1;

            myFracs[i] = new Fraction(n,d);
        }

        // print fractions
        System.out.println("Created Fractions:");
        for (int i=0; i< myFracs.length; i++) {
            System.out.println(myFracs[i]);
        }

        // sort fractions using Comparable (java.util.Arrays)
        Arrays.sort(myFracs);



        // print fractions
        System.out.println("\nSorted Fractions:");
        for (int i=0; i< myFracs.length; i++) {
            System.out.println(myFracs[i]);
        }


    }
}
