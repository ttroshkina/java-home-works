package ru.qiwi.payments.service;

import ru.qiwi.payments.dataprovider.PaymentsDataProvider;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public abstract class PaymentAbstractServiceImpl<T> implements PaymentService {
    protected PaymentsDataProvider paymentsDataProvider;

    public Supplier<T[]> getPayments;

    public ToIntFunction<T> getTotalAmount;

    public int getTotalSum() {
        return Arrays.stream(getPayments.get()).mapToInt(p -> getTotalAmount.applyAsInt(p)).sum();
    }

    public int getPaymentsCount() {
        return getPayments.get().length;
    }
}
