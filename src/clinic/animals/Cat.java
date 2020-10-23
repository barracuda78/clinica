package clinic.animals;

import clinic.clients.Client;
import clinic.disease.Disease;
import java.util.concurrent.atomic.AtomicInteger;

public class Cat extends Animal {
    
    //fields
    private int id;
    private String name;
    private int age;
    private double weight;
    private Client owner;
    private boolean isMale;
    private Disease disease;
    private boolean isAlive;

    //constructors
    public Cat(String name, int age, double weight, Client owner, boolean isMale, Disease disease) {
        this(name, age);

        this.weight = weight;
        this.owner = owner;
        this.isMale = isMale;
        this.disease = disease;
        
        id = Animal.getCounter().get();
        
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        
        id = Animal.getCounter().get();
    }

    public Cat(boolean isMale) {
        this.isMale = isMale;
        
        id = Animal.getCounter().get();
    }

    //getters:
    public boolean isIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public Client getOwner() {
        return owner;
    }

    public boolean isIsMale() {
        return isMale;
    }

    public Disease getDisease() {
        return disease;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    
}
