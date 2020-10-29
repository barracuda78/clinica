package clinic.staff;

import clinic.animals.Animal;

public class Doctor extends Staff {
    private String specification;
    private Animal[] animals;

    public Doctor(String name) {
        super(name);
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }
    
    @Override
    public String toString(){
        return getName();
    }
}
