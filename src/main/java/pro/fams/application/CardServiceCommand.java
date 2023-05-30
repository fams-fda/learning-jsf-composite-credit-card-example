package pro.fams.application;

import jakarta.ejb.Stateless;

// CQRS Pattern - Commands write 
@Stateless
public class CardServiceCommand implements CardServiceCommandInterface {

    @Override
    public String lock() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'lock'");
    }

    @Override
    public String unLock() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'unLock'");
    }

    @Override
    public String enableInternationalPurchases() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'enableInternationalPurchases'");
    }

    @Override
    public String disableInternationalPurchases() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'disableInternationalPurchases'");
    }

    @Override
    public String lockBuyContactless() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'lockBuyContactless'");
    }

    @Override
    public String unLockBuyContactless() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'unLockBuyContactless'");
    }

}
