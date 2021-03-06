package moneycalculator.ui.swing;

import javax.swing.JLabel;
import javax.swing.JPanel;
import moneycalculator.model.Money;
import moneycalculator.UI.MoneyDisplay;

public class SwingMoneyDisplay extends JPanel implements MoneyDisplay{
    private Money money;

    @Override
    public void display(Money money) {
        this.money = money;
        this.removeAll();
        this.add(amount());
        this.add(currency());
        this.updateUI();
    }

    private JLabel currency() {
        return new JLabel(String.valueOf(money.getAmount()));
    }

    private JLabel amount() {
        return new JLabel(money.getCurrency().getCode());
    }
}