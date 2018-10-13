package org.edu.services;

import org.edu.domain.Bank;

/**
 * Reads and writes bank to|from file in following format:
 * accounttype=c|s;balance=100;overdraft=50;name=John;gender=m|f;
 * (e.g.: accounttype=c;balance=100;overdraft=50;name=John;gender=f;)
 */
public class BankServiceImpl implements BankService {

    @Override
    public Bank readBank(String fileName) throws Exception {
        // TODO: implement
        return null;
    }

    @Override
    public void writeBank(Bank bank, String filename) throws Exception {
        // TODO: implement
    }
}
