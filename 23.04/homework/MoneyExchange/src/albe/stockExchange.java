package albe;

import java.util.concurrent.atomic.AtomicInteger;

public class stockExchange {

    AtomicInteger rub = new AtomicInteger(1000);
    AtomicInteger eur = new AtomicInteger(1000);
    AtomicInteger dol = new AtomicInteger(1000);

    stockExchange() {
    }


    public void exchangeRE(int money) {
        int existingValue;
        int newValue;
        rub.getAndAdd(money);
        do {
            existingValue = eur.get();
            newValue = existingValue - money;
        } while (!eur.compareAndSet(existingValue, newValue));
    }

    public void exchangeRD(int money) {
        int existingValue;
        int newValue;
        rub.getAndAdd(money);
        do {
            existingValue = dol.get();
            newValue = existingValue - money;
        } while (!dol.compareAndSet(existingValue, newValue));
    }

    public void exchangeER(int money) {
        int existingValue;
        int newValue;
        eur.getAndAdd(money);
        do {
            existingValue = rub.get();
            newValue = existingValue - money;
        } while (!rub.compareAndSet(existingValue, newValue));
    }

    public void exchangeED(int money) {
        int existingValue;
        int newValue;
        eur.getAndAdd(money);
        do {
            existingValue = dol.get();
            newValue = existingValue - money;
        } while (!dol.compareAndSet(existingValue, newValue));
    }

    public void exchangeDR(int money) {
        int existingValue;
        int newValue;
        dol.getAndAdd(money);
        do {
            existingValue = rub.get();
            newValue = existingValue - money;
        } while (!rub.compareAndSet(existingValue, newValue));
    }

    public void exchangeDE(int money) {
        int existingValue;
        int newValue;
        dol.getAndAdd(money);
        do {
            existingValue = eur.get();
            newValue = existingValue - money;
        } while (!eur.compareAndSet(existingValue, newValue));
    }

    public void print(){
        System.out.println("rub: " + rub + " " + "eur: " + eur + " " + "dol: " + dol);
    }
}
