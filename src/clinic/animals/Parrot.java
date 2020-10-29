package clinic.animals;

import clinic.clients.Client;
import clinic.disease.Disease;

public class Parrot extends Animal {
    
    //constructors
    public Parrot(boolean isMale, String name, int age) {
        super(isMale);
        setName(name);
        setAge(age);
        
        setId(Animal.getCounter().get());
    }

    public Parrot(boolean isMale) {
        super(isMale);
        
        setId(Animal.getCounter().get());
    }
    
    @Override
    public String toString(){
        return getName();
    }
}
