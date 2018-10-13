package org.edu.services;

import org.edu.domain.Bank;

public interface BankService {

    Bank readBank(String fileName) throws Exception;

    void writeBank(Bank bank, String filename) throws Exception;
}
