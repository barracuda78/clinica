package clinic.animals;

public class Cat extends Animal {

    public static void run(){
        System.out.println("кот бежит");
    }
    
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
