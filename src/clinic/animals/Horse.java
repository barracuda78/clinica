package clinic.animals;

import clinic.clients.Client;
import clinic.disease.Disease;

public class Horse extends Animal {
    
    //constructors
    public Horse(boolean isMale, String name, int age) {
        super(isMale);
        setName(name);
        setAge(age);
        
        setId(Animal.getCounter().get());
    }

    public Horse(boolean isMale) {
        super(isMale);
        
        setId(Animal.getCounter().get());
    }
    
    @Override
    public void voice() {
        System.out.println("Игого!!!");
    }
    
    @Override
    public String toString(){
        return getName();
    }
}
