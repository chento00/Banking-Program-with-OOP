package co.istad.banking.model;

import co.istad.banking.repository.Interests;

public class DollarRate implements Interests{
    @Override
    public Double calcaulate(Double amount) {
        return amount*0.5;
    }
}