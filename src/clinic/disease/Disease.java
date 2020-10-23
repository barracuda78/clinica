package clinic.disease;

public class Disease {
    private int category;
    private String name;
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
}
