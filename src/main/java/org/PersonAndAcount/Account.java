package org.PersonAndAcount;

import lombok.Getter;
import lombok.Setter;

public class Account {
    private @Getter @Setter String acountNumber;
    private @Getter @Setter String pin;
    private @Getter @Setter double balance;

    public Account(String acountNumber, String pin, double balance) {
        this.acountNumber = acountNumber;
        this.pin = pin;
        this.balance = balance;
    }
}
