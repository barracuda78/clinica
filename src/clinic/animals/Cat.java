package clinic.animals;

import clinic.clients.Client;
import clinic.disease.Disease;
import java.util.concurrent.atomic.AtomicInteger;

public class Cat extends Animal {
    
    //constructors
    public Cat(boolean isMale, String name, int age) {
        super(isMale);
        setName(name);
        setAge(age);
        
        setId(Animal.getCounter().get());
    }

    public Cat(boolean isMale) {
        super(isMale);
        
        setId(Animal.getCounter().get());
    }
    
    @Override
    public void voice() {
        System.out.println("Мяу!!!");
    }
    
    @Override
    public String toString(){
        return getName();
    }


    
    
}
