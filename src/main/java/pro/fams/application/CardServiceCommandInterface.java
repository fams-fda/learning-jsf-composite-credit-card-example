package pro.fams.application;

/* CQRS Pattern - Command Interface */
public interface CardServiceCommandInterface {

    public String lock();

    public String unLock();

    public String enableInternationalPurchases();

    public String disableInternationalPurchases();

    public String lockBuyContactless();

    public String unLockBuyContactless();
}
