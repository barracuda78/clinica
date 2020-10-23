package clinic.staff;

public class Nurse {
    private String name;
    private int age;
    private Doctor doctor;

    public Nurse(String name, int age, Doctor doctor) {
        this.name = name;
        this.age = age;
        this.doctor = doctor;
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

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    
    @Override
    public String toString(){
        return "Nurse: " + name;
    }
    
}
