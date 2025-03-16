# lab1

Low Coupling means reducing direct dependencies between classes, making the system more flexible and easier to modify.

# In without principle file:

The Order class is directly dependent on Payment and Invoice classes.

If we need to change Payment (e.g., add PayPal), we must modify Order, which violates Open-Closed Principle.

# In with principle file:

ntroduced interfaces (PaymentService and InvoiceService).

Order now depends on abstractions instead of specific implementations.

We can now easily switch payment methods (Credit Card, PayPal, etc.) without modifying Order class.