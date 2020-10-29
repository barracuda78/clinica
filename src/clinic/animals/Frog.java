package clinic.animals;

import clinic.clients.Client;
import clinic.disease.Disease;


public class Frog extends Animal {
    
    //constructors
    public Frog(boolean isMale, String name, int age) {
        super(isMale);
        setName(name);
        setAge(age);
        
        setId(Animal.getCounter().get());
    }

    public Frog(boolean isMale) {
        super(isMale);
        
        setId(Animal.getCounter().get());
    }
    
    @Override
    public String toString(){
        return getName();
    }
}