package clinic.staff;

public class Nurse extends Staff {
    private int age;
    private Doctor doctor;

    public Nurse(String name, int age) {
        super(name);
        this.age = age;
        this.doctor = doctor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    
    @Override
    public String toString(){
        return "Nurse: " + getName();
    }
    
}
