package ru.qiwi.payments.service;

import org.springframework.stereotype.Service;
import ru.qiwi.payments.dataprovider.PaymentsDataProvider;
import ru.qiwi.payments.dto.Payment;
import ru.qiwi.payments.dto.PaymentWithCommission;

import java.util.Arrays;

@Service
public class PaymentWithCommissionServiceImpl extends PaymentAbstractServiceImpl<PaymentWithCommission> implements PaymentService {
    public PaymentWithCommissionServiceImpl(PaymentsDataProvider paymentsDataProvider) {
        this.paymentsDataProvider = paymentsDataProvider;
    }

    public PaymentWithCommission[] getPayments() {
        return paymentsDataProvider.getPaymentWithCommission();
    }

    public int getTotalAmount(PaymentWithCommission payment) {
        return payment.getAmount() + payment.getCommission();
    }
}
