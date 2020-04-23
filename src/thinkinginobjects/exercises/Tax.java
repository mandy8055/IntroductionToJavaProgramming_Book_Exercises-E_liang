package thinkinginobjects.exercises;

public class Tax{
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW_ER = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;

    private int filingStatus;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;

    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome){
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

//  Accessor methods
    public double getTaxableIncome(){return taxableIncome;}
    public double[] getRates(){return rates;}
    public int getFilingStatus(){return filingStatus;}
    public int[][] getBrackets(){return brackets;}

//  Mutator Methods
    public void setTaxableIncome(double taxableIncome){this.taxableIncome = taxableIncome;}
    public void setRates(double[] rates){this.rates = rates;}
    public void setFilingStatus(int filingStatus){this.filingStatus = filingStatus;}
    public void setBrackets(int[][] brackets){this.brackets = brackets;}

//  Implementing Methods
    public double getTax(){
        double tax;
        if(filingStatus == SINGLE_FILER){
            if(taxableIncome <= brackets[0][0]){
                tax = taxableIncome * rates[0];
            }else if(taxableIncome <= brackets[0][1]){
                tax = brackets[0][0] * rates[0] +
                        (taxableIncome - brackets[0][0]) * rates[1];
            }else if(taxableIncome <= brackets[0][2]){
                tax = brackets[0][0] * rates[0] +
                        (brackets[0][1] - brackets[0][0]) * rates[1] +
                        (taxableIncome - brackets[0][1]) * rates[2];
            }else if(taxableIncome <= brackets[0][3]){
                tax = brackets[0][0] * rates[0] +
                        (brackets[0][1] - brackets[0][0]) * rates[1] +
                        (brackets[0][2] - brackets[0][1]) * rates[2] +
                        (taxableIncome - brackets[0][2]) * rates[3];
            }else if(taxableIncome <= brackets[0][4]){
                tax = brackets[0][0] * rates[0] +
                        (brackets[0][1] - brackets[0][0]) * rates[1] +
                        (brackets[0][2] - brackets[0][1]) * rates[2] +
                        (brackets[0][3] - brackets[0][2]) * rates[3] +
                        (taxableIncome - brackets[0][3]) * rates[4];
            } else{
                tax = brackets[0][0] * rates[0] +
                        (brackets[0][1] - brackets[0][0]) * rates[1] +
                        (brackets[0][2] - brackets[0][1]) * rates[2] +
                        (brackets[0][3] - brackets[0][2]) * rates[3] +
                        (brackets[0][4] - brackets[0][3]) * rates[4] +
                        (taxableIncome - brackets[0][4]) * rates[5];
            }
        }else if(filingStatus == MARRIED_JOINTLY_OR_QUALIFYING_WIDOW_ER){
            if(taxableIncome <= brackets[1][0]){
                tax = taxableIncome * rates[0];
            }else if(taxableIncome <= brackets[1][1]){
                tax = brackets[1][0] * rates[0] +
                        (taxableIncome - brackets[1][0]) * rates[1];
            }else if(taxableIncome <= brackets[1][2]){
                tax = brackets[1][0] * rates[0] +
                        (brackets[1][1] - brackets[1][0]) * rates[1] +
                        (taxableIncome - brackets[1][1]) * rates[2];
            }else if(taxableIncome <= brackets[1][3]){
                tax = brackets[1][0] * rates[0] +
                        (brackets[1][1] - brackets[1][0]) * rates[1] +
                        (brackets[1][2] - brackets[1][1]) * rates[2] +
                        (taxableIncome - brackets[1][2]) * rates[3];
            }else if(taxableIncome <= brackets[1][4]){
                tax = brackets[1][0] * rates[0] +
                        (brackets[1][1] - brackets[1][0]) * rates[1] +
                        (brackets[1][2] - brackets[1][1]) * rates[2] +
                        (brackets[1][3] - brackets[1][2]) * rates[3] +
                        (taxableIncome - brackets[1][3]) * rates[4];
            } else{
                tax = brackets[1][0] * rates[0] +
                        (brackets[1][1] - brackets[1][0]) * rates[1] +
                        (brackets[1][2] - brackets[1][1]) * rates[2] +
                        (brackets[1][3] - brackets[1][2]) * rates[3] +
                        (brackets[1][4] - brackets[1][3]) * rates[4] +
                        (taxableIncome - brackets[1][4]) * rates[5];
            }
        }else if(filingStatus == MARRIED_SEPARATELY){
            if(taxableIncome <= brackets[2][0]){
                tax = taxableIncome * rates[0];
            }else if(taxableIncome <= brackets[2][1]){
                tax = brackets[2][0] * rates[0] +
                        (taxableIncome - brackets[2][0]) * rates[1];
            }else if(taxableIncome <= brackets[2][2]){
                tax = brackets[2][0] * rates[0] +
                        (brackets[2][1] - brackets[2][0]) * rates[1] +
                        (taxableIncome - brackets[2][1]) * rates[2];
            }else if(taxableIncome <= brackets[2][3]){
                tax = brackets[2][0] * rates[0] +
                        (brackets[2][1] - brackets[2][0]) * rates[1] +
                        (brackets[2][2] - brackets[2][1]) * rates[2] +
                        (taxableIncome - brackets[2][2]) * rates[3];
            }else if(taxableIncome <= brackets[2][4]){
                tax = brackets[2][0] * rates[0] +
                        (brackets[2][1] - brackets[2][0]) * rates[1] +
                        (brackets[2][2] - brackets[2][1]) * rates[2] +
                        (brackets[2][3] - brackets[2][2]) * rates[3] +
                        (taxableIncome - brackets[2][3]) * rates[4];
            } else{
                tax = brackets[2][0] * rates[0] +
                        (brackets[2][1] - brackets[2][0]) * rates[1] +
                        (brackets[2][2] - brackets[2][1]) * rates[2] +
                        (brackets[2][3] - brackets[2][2]) * rates[3] +
                        (brackets[2][4] - brackets[2][3]) * rates[4] +
                        (taxableIncome - brackets[2][4]) * rates[5];
            }
        }else if(filingStatus == HEAD_OF_HOUSEHOLD){
            if(taxableIncome <= brackets[3][0]){
                tax = taxableIncome * rates[0];
            }else if(taxableIncome <= brackets[3][1]){
                tax = brackets[3][0] * rates[0] +
                        (taxableIncome - brackets[3][0]) * rates[1];
            }else if(taxableIncome <= brackets[3][2]){
                tax = brackets[3][0] * rates[0] +
                        (brackets[3][1] - brackets[3][0]) * rates[1] +
                        (taxableIncome - brackets[3][1]) * rates[2];
            }else if(taxableIncome <= brackets[3][3]){
                tax = brackets[3][0] * rates[0] +
                        (brackets[3][1] - brackets[3][0]) * rates[1] +
                        (brackets[3][2] - brackets[3][1]) * rates[2] +
                        (taxableIncome - brackets[3][2]) * rates[3];
            }else if(taxableIncome <= brackets[3][4]){
                tax = brackets[3][0] * rates[0] +
                        (brackets[3][1] - brackets[3][0]) * rates[1] +
                        (brackets[3][2] - brackets[3][1]) * rates[2] +
                        (brackets[3][3] - brackets[3][2]) * rates[3] +
                        (taxableIncome - brackets[3][3]) * rates[4];
            } else{
                tax = brackets[3][0] * rates[0] +
                        (brackets[3][1] - brackets[3][0]) * rates[1] +
                        (brackets[3][2] - brackets[3][1]) * rates[2] +
                        (brackets[3][3] - brackets[3][2]) * rates[3] +
                        (brackets[3][4] - brackets[3][3]) * rates[4] +
                        (taxableIncome - brackets[3][4]) * rates[5];
            }
        }else{
//          Invalid filing status
            tax = -1;
        }
        return tax;
    }
}
