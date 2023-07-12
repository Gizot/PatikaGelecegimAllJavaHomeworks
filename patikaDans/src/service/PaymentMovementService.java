package service;

import model.BankAccount;
import model.MovementType;
import model.PaymentMovement;

import java.math.BigDecimal;

public class PaymentMovementService {
    /*

    private BankAccount bankAccount;

    private String description;

    private MovementType movementType;

    private BigDecimal amount;
     */
    public PaymentMovement createPaymentMovement(BankAccount bankAccount, String description,
                                                 MovementType movementType, BigDecimal amount){
        PaymentMovement paymentMovement = new PaymentMovement();
        paymentMovement.setBankAccount(bankAccount);
        paymentMovement.setDescription(description);
        paymentMovement.setMovementType(movementType);
        paymentMovement.setAmount(amount);
        return paymentMovement;

    }
}
