package ru.qiwi.payments.service;

import org.springframework.stereotype.Service;
import ru.qiwi.payments.dataprovider.PaymentsDataProvider;
import ru.qiwi.payments.dto.Payment;

@Service
public class PaymentServiceImpl extends PaymentAbstractServiceImpl<Payment> implements PaymentService {

    public PaymentServiceImpl(PaymentsDataProvider paymentsDataProvider) {
        this.paymentsDataProvider = paymentsDataProvider;
    }

    public Payment[] getPayments() {
        return paymentsDataProvider.getPayments();
    }

    public int getTotalAmount(Payment payment) {
        return payment.getAmount();
    }
}
