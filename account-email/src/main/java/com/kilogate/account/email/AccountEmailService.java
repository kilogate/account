package com.kilogate.account.email;

/**
 * Created by kilogate on 2017/2/4.
 */
public interface AccountEmailService {
    void sendMail(String to, String subject, String htmlText) throws AccountEmailException;
}
