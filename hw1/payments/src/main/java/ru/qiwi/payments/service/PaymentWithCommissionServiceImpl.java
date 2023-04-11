package ru.qiwi.payments.service;

import org.springframework.stereotype.Service;
import ru.qiwi.payments.dataprovider.PaymentsDataProvider;

import java.util.Arrays;

@Service
public class PaymentWithCommissionServiceImpl implements PaymentService {

    private PaymentsDataProvider paymentsDataProvider;

    public PaymentWithCommissionServiceImpl(PaymentsDataProvider paymentsDataProvider) {
        this.paymentsDataProvider = paymentsDataProvider;
    }

    public int getTotalSum() {
        return Arrays.stream(paymentsDataProvider.getPaymentWithCommission()).mapToInt(payment -> payment.getAmount() + payment.getCommission()).sum();
    }

    public int getPaymentsCount() {
        return paymentsDataProvider.getPaymentWithCommission().length;
    }
}
