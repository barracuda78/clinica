package clinic.animals;

import clinic.clients.Client;
import clinic.disease.Disease;


public class Frog extends Animal{
    private int id;
    private String name;
    private String color;
    private Disease disease;
    private boolean isAlive;
    private Client owner;
    
    
    public Frog(String name, String color){
        this(name);
        this.color = color;
        
        id = Animal.getCounter().get();
    }

    public Frog(String name) {
        this.name = name;
        
        id = Animal.getCounter().get();
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }
    
    
    @Override
    public String toString(){
        return "Frog: " + name + ", color: " + color;
    }
    
}
