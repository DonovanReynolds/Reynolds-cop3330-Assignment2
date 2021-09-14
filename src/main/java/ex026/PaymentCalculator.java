package ex026;

public class PaymentCalculator {
    double apr;
    double balance;
    double monthlyPayment;
    double dailyRate;
    int months;

    public PaymentCalculator(double apr, double balance, double monthlyPayment)
    {
        this.apr = apr;
        this.balance = Math.ceil(balance);
        this.monthlyPayment = monthlyPayment;
        calculateRate();
    }

    private void calculateRate()
    {
        this.dailyRate = this.apr / 36500;
    }

    public int calculateMonthsUntilPaidOff()
    {
        double b = this.balance;
        double i = this.dailyRate;
        double p = this.monthlyPayment;
        double n = -((double)1/30)*Math.log(1+ b/p * (1-Math.pow(1+i,30)))/Math.log(1+i);
        this.months =  (int)Math.ceil(n);
        return months;
    }

    public double getApr() {
        return apr;
    }

    public void setApr(int apr) {
        this.apr = apr;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        calculateRate();
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }
}
