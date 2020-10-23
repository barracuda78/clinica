package clinic;

import clinic.animals.Animal;
import clinic.animals.Cat;
import clinic.animals.Fox;
import clinic.animals.Frog;
import clinic.animals.Hamster;
import clinic.animals.Horse;
import clinic.animals.Parrot;
import clinic.clients.Client;
import clinic.disease.Disease;
import clinic.exceptions.DoctorIsBusyException;
import clinic.staff.Doctor;
import clinic.staff.Nurse;
import clinic.treating.Treating;
import java.util.Arrays;

public class Clinic {
    private String brand;
    
    @Override
    public String toString(){
        return brand;
    }
    
    public static void main(String[] args) {
        //String name, int age, double weight, Client owner, boolean isMale, Disease disease
        Client mikeTyson = new Client();
        Client mikkieRurk = new Client();
        Client alisa = new Client();
        
        //int category, String name, double temperature
        Disease covid19 = new Disease(1, "коронавирус", 39.9);
        Disease angina = new Disease(2, "ангина", 38.5);
        Disease gripp = new Disease(2, "грипп", 37.9);
        
        Cat cat01 = new Cat("Murzik", 5, 3.0, mikeTyson, true, covid19);
        Cat cat02 = new Cat("Barsik", 2, 2.5, mikkieRurk, true, angina);
        Cat cat03 = new Cat("Bazilio", 65, 70.5, alisa, true, gripp);
        Cat cat04 = new Cat("Vaska", 4, 2.9, mikkieRurk, true, covid19);
        
        //String name, int age
        Hamster hamster01 = new Hamster("Homa", 2);
        
        //boolean isMale
        Parrot unknownParrot = new Parrot(false);
        
        //boolean isMale, boolean isAlive
        Fox fox01 = new Fox(true, true);       
        Frog frog01 = new Frog("Царевна", "green");
        //String name, int age, Client owner, Disease disease
        Horse horse01 = new Horse("Stallion", 8, mikeTyson, gripp);
        
        Doctor doctor01 = new Doctor("Преображенский");
        
        doctor01.setCats(new Cat[50]);
        Cat[] cats = doctor01.getCats();
        cats[0] = cat01;
        cats[1] = cat02;
        cats[2] = cat03;
        System.out.println("массив котов: " + Arrays.toString(cats));
        doctor01.setCats(cats);
        
        doctor01.setHamsters(new Hamster[]{hamster01});
        doctor01.setParrots(new Parrot[]{unknownParrot});
        doctor01.setAnimals(new Animal[4]);
        
        //String name, int age, Doctor doctor
        Nurse nurse = new Nurse("Eva", 44, doctor01);
        
        //проверка статического метода: добавление в поле типа Animal[]:
        System.out.println("массив animals до привязки: " + Arrays.toString(doctor01.getAnimals()));
        try{
        Treating.assignToDoctor(horse01, doctor01);
        }
        catch(DoctorIsBusyException e){
            e.printStackTrace();
            System.out.println("Невозможно привязать животное к доктору");
        }
        System.out.println("привязана ли лошадь: ");
        System.out.println("теперь массив animals: " + Arrays.toString(doctor01.getAnimals()));
        
        //проверка нестатического метода:
        boolean isAssigned = new Treating(doctor01).assignToDoctor(cat04);
        System.out.println("привязан ли cat04: " + isAssigned);
        System.out.println("теперь массив котов: " + Arrays.toString(doctor01.getCats()));
        
        System.out.println("Подсчитаем животных: " + Animal.getCounter());
    }
}
 