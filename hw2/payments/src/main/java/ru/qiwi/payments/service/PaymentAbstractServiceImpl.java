package ru.qiwi.payments.service;

import org.springframework.stereotype.Service;
import ru.qiwi.payments.dataprovider.PaymentsDataProvider;

import java.util.Arrays;

public abstract class PaymentAbstractServiceImpl<T> {
    protected PaymentsDataProvider paymentsDataProvider;

    public abstract T[] getPayments();

    public abstract int getTotalAmount(T payment);

    public int getTotalSum() {
        return Arrays.stream(getPayments()).mapToInt(this::getTotalAmount).sum();
    }

    public int getPaymentsCount() {
        return getPayments().length;
    }
}
