package albe;

import java.util.concurrent.atomic.AtomicInteger;

public class stockExchange {

    AtomicInteger rub = new AtomicInteger(1000);
    AtomicInteger eur = new AtomicInteger(1000);
    AtomicInteger dol = new AtomicInteger(1000);

    stockExchange(){
    }

    public AtomicInteger getRub() {
        return rub;
    }
    public AtomicInteger getEur() {
        return eur;
    }
    public AtomicInteger getDol() {
        return dol;
    }
    public void exchange(String val1, String val2, int money){
        int existingValue;
        int newValue;

        switch (val1){
            case "rub":
                switch (val2){
                    case "eur":
                        rub.getAndAdd(money);
                        existingValue = eur.get();
                        newValue = existingValue - money;
                        eur.compareAndSet(existingValue, newValue);
                        break;
                    case "dol":
                        rub.getAndAdd(money);
                        existingValue = dol.get();
                        newValue = existingValue - money;
                        dol.compareAndSet(existingValue, newValue);
                        break;
                    default:
                        break;
                }
                break;
            case "eur":
                switch (val2){
                    case "rub":
                        eur.getAndAdd(money);
                        existingValue = rub.get();
                        newValue = existingValue - money;
                        rub.compareAndSet(existingValue, newValue);
                        break;
                    case "dol":
                        eur.getAndAdd(money);
                        existingValue = dol.get();
                        newValue = existingValue - money;
                        dol.compareAndSet(existingValue, newValue);
                        break;
                    default:
                        break;
                }
                break;
            case "dol":
                switch (val2){
                    case "rub":
                        dol.getAndAdd(money);
                        existingValue = rub.get();
                        newValue = existingValue - money;
                        rub.compareAndSet(existingValue, newValue);
                        break;
                    case "eur":
                        dol.getAndAdd(money);
                        existingValue = eur.get();
                        newValue = existingValue - money;
                        eur.compareAndSet(existingValue, newValue);
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }

    }

}
