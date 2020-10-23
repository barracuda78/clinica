package clinic.animals;

import clinic.clients.Client;
import clinic.disease.Disease;

public class Horse extends Animal{
    //fields
    private int id;
    private String name;
    private int age;
    private double weight;
    private Client owner;
    private boolean isMale;
    private Disease disease;
    private boolean isAlive;

    public Horse(String name, int age, Client owner, Disease disease) {
        this.name = name;
        this.age = age;
        this.owner = owner;
        this.disease = disease;
        
        id = Animal.getCounter().get();
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
    
    @Override
    public String toString(){
        return name;
    }
}
