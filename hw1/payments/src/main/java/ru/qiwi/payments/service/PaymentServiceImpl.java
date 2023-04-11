package ru.qiwi.payments.service;

import org.springframework.stereotype.Service;
import ru.qiwi.payments.dataprovider.PaymentsDataProvider;

import java.util.Arrays;

@Service
public class PaymentServiceImpl implements PaymentService {

    private PaymentsDataProvider paymentsDataProvider;

    public PaymentServiceImpl(PaymentsDataProvider paymentsDataProvider) {
        this.paymentsDataProvider = paymentsDataProvider;
    }

    public int getTotalSum() {
        return Arrays.stream(paymentsDataProvider.getPayments()).mapToInt(payment -> payment.getAmount()).sum();
    }

    public int getPaymentsCount() {
        return paymentsDataProvider.getPayments().length;
    }
}
