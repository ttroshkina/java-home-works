Имеем:
Простенькое приложение на спринге, работающее с сущностью платеж. 
Платежи могут быть с комиссией `PaymentWithCommission` и без Payment
Нужно сделать две реализации интерфейса `PaymentService` для каждого вида платежей
метод `int getTotalSum()` должен вернуть сумму всех платежей
метод `int getPaymentsCount()` должен вернуть количество платежей
в PaymentsDataProvider есть методы, возвращающие массив платежей нужного типа
избегайте дублирования логики