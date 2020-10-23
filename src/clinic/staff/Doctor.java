package clinic.staff;

import clinic.animals.Animal;
import clinic.animals.Cat;
import clinic.animals.Hamster;
import clinic.animals.Parrot;

public class Doctor {
    private String name;
    private double salary;
    private String specification;
    private Animal[] animals;
    private Cat[] cats;
    private Hamster[] hamsters;
    private Parrot[] parrots;

    public Doctor(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public Cat[] getCats() {
        return cats;
    }

    public void setCats(Cat[] cats) {
        this.cats = cats;
    }

    public Hamster[] getHamsters() {
        return hamsters;
    }

    public void setHamsters(Hamster[] hamsters) {
        this.hamsters = hamsters;
    }

    public Parrot[] getParrots() {
        return parrots;
    }

    public void setParrots(Parrot[] parrots) {
        this.parrots = parrots;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }
    
    
    
    @Override
    public String toString(){
        return name;
    }
}
