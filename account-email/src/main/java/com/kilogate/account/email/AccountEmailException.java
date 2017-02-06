package com.kilogate.account.email;

/**
 * Created by kilogate on 2017/2/6.
 */
public class AccountEmailException extends Exception {
    public AccountEmailException(String msg) {
        super(msg);
    }

    public AccountEmailException(String msg, Throwable throwable) {
        super(msg, throwable);
    }
}
