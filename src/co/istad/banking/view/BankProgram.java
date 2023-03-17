package co.istad.banking.view;

import co.istad.banking.model.CreditCard;
import co.istad.banking.model.DollarRate;
import co.istad.banking.model.SavingAccount;
import co.istad.service.Database;

public class BankProgram {
    public static void main(String[] args) {
        System.out.println("##################################################");
        System.out.println("                    Credit card                     ");
        CreditCard creditCard=new CreditCard();
        creditCard.setNumber(1001);
        creditCard.setPin(2002);
        if(Database.creditCard().getNumber().equals(creditCard.getNumber())){
            creditCard=Database.creditCard();
        }else{
            System.out.println("Invalid card...");
            return;
        }
        creditCard.deposit(100.0);
        creditCard.withdrawal(1000.0);
        creditCard.withdrawal();
        creditCard.showBalance();
        System.out.println("##################################################");
        System.out.println("                    Saving card                     ");
        SavingAccount savingAccount1=Database.savingAccount();
        savingAccount1.setInterestI(new DollarRate());
        savingAccount1.calculateInterest();
        savingAccount1.showBalance();
    }
}
