package MortgagePayementProject;

import java.text.NumberFormat;

public class MortgageReport {

    private final NumberFormat currency;
    private MortgageCalculator mortgageCalculator;

    public MortgageReport(MortgageCalculator mortgageCalculator) {
        this.mortgageCalculator = mortgageCalculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printPaymentSchedule() {

        System.out.println("\nPAYMENT SCHEDULE");
        System.out.println("----------------");
        for(double balance : mortgageCalculator.getRemainingBalances()) {
            System.out.println( currency.format(balance));
        }
    }

    public void printMortgage() {


        double mortgage = mortgageCalculator.calculateMortgage();
        String mortgageFormatted = currency.format(mortgage);
        System.out.println("\nMORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }
}
