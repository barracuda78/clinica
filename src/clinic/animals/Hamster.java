package clinic.animals;

import clinic.clients.Client;
import clinic.disease.Disease;


public class Hamster extends Animal {
    public static void run(){
        System.out.println("хомяк бежит");
    }
    //constructors
    public Hamster(boolean isMale, String name, int age) {
        super(isMale);
        setName(name);
        setAge(age);
        
        setId(Animal.getCounter().get());
    }

    public Hamster(boolean isMale) {
        super(isMale);
        
        setId(Animal.getCounter().get());
    }
    
    @Override
    public void voice() {
        System.out.println("Я - хомяк");
    }
    
    @Override
    public String toString(){
        return getName();
    }
}
