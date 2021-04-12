package a9;

import javax.swing.*;

public class driver {

    public static void main(String [] args) {
        SalesPerson sp = new SalesPerson();
        sp.setSales(Double.parseDouble(JOptionPane.showInputDialog("Please enter the salesperson’s monthly sales")));
        sp.setAdvance(Double.parseDouble(JOptionPane.showInputDialog("Please enter the amount of advanced pay")));
        sp.setMontlyRate();
        sp.calculateCommission();
        sp.calculatePayAdvance();
        sp.display();
    }

}
