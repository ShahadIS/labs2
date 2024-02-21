public class Balance  extends CreditCard{
    public Balance(String cust, String bk, String acnt, int lim, double initialBal) {
        super(cust, bk, acnt, lim, initialBal);
    }

    public Balance(String cust, String bk, String acnt, int lim)
    {
        super(cust, bk, acnt, lim);
    }

    public void makePayment(double amount) {
        if(amount<0)
            throw new IllegalArgumentException("Negative Amount is not Allowed");
        balance -= amount;
    }
}

