package clinic.disease;

public class Disease {
    private int category;
    private String name;

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    private double temperature;

    public Disease(int category, String name, double temperature) {
        this.category = category;
        this.name = name;
        this.temperature = temperature;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    @Override
    public boolean equals(Object anObject){
        if(anObject instanceof Disease){
            Disease disease = (Disease)anObject;
            return name.equals(disease.getName());
        }
            return false;
        
    }
}
