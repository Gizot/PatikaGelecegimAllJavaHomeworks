package service;

import model.BankAccount;

import java.math.BigDecimal;

public class BankAccountService {
    /*
    private String bankName;
    private String ibanNo;
    private String companyName;
    private BigDecimal amount;
     */

    public BankAccount createBankAccount(String bankName, String ibanNo,
                                         String companyName, BigDecimal amount) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBankName(bankName);
        bankAccount.setAmount(amount);
        bankAccount.setCompanyName(companyName);
        bankAccount.setIbanNo(ibanNo);
        return bankAccount;
    }
}
