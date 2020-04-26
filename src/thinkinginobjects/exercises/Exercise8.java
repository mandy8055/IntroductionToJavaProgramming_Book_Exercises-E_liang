package thinkinginobjects.exercises;

import thinkinginobjects.casestudiesandutilities.Tax;

public class Exercise8 {
    public static void main(String[] args){
//      2009 filing bracket and rates
        int[][] brackets_2009 = {{8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 20885, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}};
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        Tax tax = new Tax(0, brackets_2009, rates, 400000);
        System.out.println(tax.getTax());
    }
}
