package ru.qiwi.payments.service;

import org.springframework.stereotype.Service;
import ru.qiwi.payments.dataprovider.PaymentsDataProvider;
import ru.qiwi.payments.dto.Payment;

@Service
public class PaymentServiceImpl extends PaymentAbstractServiceImpl<Payment> {

    public PaymentServiceImpl(PaymentsDataProvider paymentsDataProvider) {
        this.paymentsDataProvider = paymentsDataProvider;
        this.getTotalAmount = Payment::getAmount;
        this.getPayments = paymentsDataProvider::getPayments;
    }

}
