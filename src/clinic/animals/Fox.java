package clinic.animals;

import clinic.clients.Client;
import clinic.disease.Disease;


public class Fox extends Animal {
    
    public static void run(){
        System.out.println("лиса бежит");
    }
        
    //constructors
    public Fox(boolean isMale, String name, int age) {
        super(isMale);
        setName(name);
        setAge(age);
        
        setId(Animal.getCounter().get());
    }

    public Fox(boolean isMale) {
        super(isMale);
        
        setId(Animal.getCounter().get());
    }
    
    @Override
    public void voice() {
        System.out.println("Аууу!!!");
    }
    
    @Override
    public String toString(){
        return getName();
    }
}