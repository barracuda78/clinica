package clinic;

import clinic.animals.Animal;
import clinic.animals.Cat;
import clinic.animals.Parrot;
import clinic.clients.Client;
import clinic.disease.Disease;
import clinic.exceptions.DoctorIsBusyException;

import clinic.staff.Doctor;
import clinic.staff.Nurse;
import clinic.treating.Treating;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        
        Cat cat01 = new Cat(true, "Murzik", 5);
        Cat cat02 = new Cat(true, "Barsik", 2);
        Cat cat03 = new Cat(true, "Bazilio", 65);
        Cat cat04 = new Cat(true, "Vaska", 4);
        
        //boolean isMale
        Parrot unknownParrot = new Parrot(false);
       
        
        Doctor doctor01 = new Doctor("Преображенский");
        doctor01.setAnimals(new Animal[4]);
                
        Nurse nurse = new Nurse("Eva", 44);
        
        //проверка статического метода: добавление в поле типа Animal[]:
        System.out.println("массив animals до привязки: " + Arrays.toString(doctor01.getAnimals()));
        
        Treating treating01 = new Treating(doctor01);
        
        treating01.assignToDoctor(cat01);
        treating01.assignToDoctor(cat02);
        treating01.assignToDoctor(cat03);
        
        try {
            Treating.assignToDoctor(cat04, doctor01);
        } catch (DoctorIsBusyException e) {
            e.printStackTrace();
            System.out.println("Невозможно привязать животное к доктору");
        }
        
        System.out.println("массив animals после привязки: " + Arrays.toString(doctor01.getAnimals()));
    }
}
 