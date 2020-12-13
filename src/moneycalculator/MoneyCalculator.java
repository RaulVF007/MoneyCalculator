package moneycalculator;

import moneycalculator.control.CalculateCommand;
import moneycalculator.persistence.CurrencyListLoader;
import moneycalculator.persistence.ExchangeRateLoader;
import moneycalculator.persistence.file.FileCurrencyListLoader;
import moneycalculator.persistence.rest.RestExchangeRateLoader;

public class MoneyCalculator {

    public static void main(String[] args) {
        CurrencyListLoader currencyLoader = new FileCurrencyListLoader("currencies.txt");
        ExchangeRateLoader exchangeRateLoader = new RestExchangeRateLoader();
        MoneyCalculatorFrame moneyCalculatorFrame = new MoneyCalculatorFrame(currencyLoader.currencies());
        moneyCalculatorFrame.add(new CalculateCommand(moneyCalculatorFrame.getMoneyDialog(), moneyCalculatorFrame.getMoneyDisplay(), exchangeRateLoader));
    }
}