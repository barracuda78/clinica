package clinic.animals;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class Animal {
    private static AtomicInteger counter = new AtomicInteger(0);

    public Animal(){
        counter.incrementAndGet();
    }
    
    public static void setCounter(AtomicInteger counter) {
        Animal.counter = counter;
    }
  
    public static AtomicInteger getCounter() {
        return counter;
    }
}
