package a9;

import javax.swing.*;

public class SalesPerson {

    private double sales;
    private double rate;
    private double commission;
    private double advance;
    private double pay;

    public SalesPerson() {
    }

    public SalesPerson(double sales, double rate, double commission, double advance, double pay) {
        this.sales = sales;
        this.rate = rate;
        this.commission = commission;
        this.advance = advance;
        this.pay = pay;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getAdvance() {
        return advance;
    }

    public void setAdvance(double advance) {
        this.advance = advance;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public void calculateCommission()
    {
        setCommission(getSales() * getRate());
    }
    public void setMontlyRate()
    {
        if(getSales() < 10000)
            setRate(0.05);
        if(getSales() >= 10000 && getSales() <= 14999)
            setRate(0.10);
        if(getSales() >= 15000 && getSales() <= 17999)
            setRate(0.12);
        if(getSales() >= 18000 && getSales() <= 17999)
            setRate(0.15);
        if(getSales() >= 22000)
            setRate(0.16);
    }

    public void calculatePayAdvance()    {

        if(getAdvance()>1500)
            System.out.println("You exceed the maximum request");
        else
            setPay(getCommission() - getAdvance());

        if(getPay() < 0)
            System.out.println("You owe Hal: " + getPay());
    }

    public void display() {
        JOptionPane.showMessageDialog(null, "Rate: " + getRate());
        JOptionPane.showMessageDialog(null, "Commission: " + getCommission());

        if (getPay() < 0)
            JOptionPane.showMessageDialog(null, "You owe Hal: " + getPay() * -1);
        else
            JOptionPane.showMessageDialog(null, "Your Pay Is: " + getPay());
    }

}
