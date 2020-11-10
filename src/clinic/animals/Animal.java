package clinic.animals;

import clinic.clients.Client;
import clinic.disease.Disease;
import clinic.treating.TreatingMethods;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Animal implements Speakable {
    private static AtomicInteger counter = new AtomicInteger(0);

    private TreatingMethods treatingMethod;
    private int id;
    private String name;
    private int age;
    private double weight;
    private Client owner;
    private boolean isMale;
    private Disease disease;
    private boolean isAlive;

    public Animal(boolean isMale){
        counter.incrementAndGet();
        isAlive = true;
    }
    
    public abstract void voice();
    
    public boolean isIll(){
        return disease!=null;
    }
    
    public static void run(){
        System.out.println("Бегают бегом");
    }
    //////////setters////////////////////////////////////
    
    public static void setCounter(AtomicInteger counter) {
        Animal.counter = counter;
    }
  
    public static AtomicInteger getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public boolean isIsMale() {
        return isMale;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    public boolean isIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public TreatingMethods getTreatingMethod() {
        return treatingMethod;
    }

    public void setTreatingMethod(TreatingMethods treatingMethod) {
        this.treatingMethod = treatingMethod;
    }
    
    
    
}
