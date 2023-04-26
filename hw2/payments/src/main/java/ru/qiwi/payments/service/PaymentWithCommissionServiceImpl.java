package ru.qiwi.payments.service;

import org.springframework.stereotype.Service;
import ru.qiwi.payments.dataprovider.PaymentsDataProvider;
import ru.qiwi.payments.dto.PaymentWithCommission;

@Service
public class PaymentWithCommissionServiceImpl extends PaymentAbstractServiceImpl<PaymentWithCommission> implements PaymentService {
    public PaymentWithCommissionServiceImpl(PaymentsDataProvider paymentsDataProvider) {
        this.paymentsDataProvider = paymentsDataProvider;
        this.getPayments = paymentsDataProvider::getPaymentWithCommission;
        this.getTotalAmount = p -> p.getAmount() + p.getCommission();
    }
}
