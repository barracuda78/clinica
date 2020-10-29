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
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Clinic {
    private String brand;

    @Override
    public String toString(){
        return brand;
    }
    
    private static Disease generateDisease(int category){
        
        Random random = new Random();
        int typeNumber = random.nextInt(5);
        System.out.println("random.nextInt(5) = " + typeNumber);
        switch(typeNumber){
            case 0:
                //int category, String name, double temperature
                return new Disease(category, "Covid19", random.nextDouble());
                
            case 1:
                return new Disease(category, "Коклюш", random.nextDouble());
                
            case 2:
                return new Disease(category, "Холера", random.nextDouble());

            case 3:
                return new Disease(category, "Чума", random.nextDouble());
               
            case 4:
                return null;

        }
        
        return null;
    }
    
    private static Animal[] generatePatients(int size){
        Animal[] patients = new Animal[size];
        Random random = new Random();
        
        for (int i = 0; i < patients.length; i++) {
            int typeNumber = random.nextInt(6);
            switch(typeNumber){
                case 0:
                    //boolean isMale, String name, int age
                    Random random1 = new Random();
                    Cat cat = new Cat(true, "Мурзик" + random1.nextInt(10), typeNumber*(31/29));
                    cat.setDisease(generateDisease(1));
                    patients[i] = cat;
                    break;
                case 1:
                    Random random2 = new Random();
                    Fox fox = new Fox(false, "Лиса Алиса" + random2.nextInt(10), typeNumber*(31/29));
                    fox.setDisease(generateDisease(2));
                    patients[i] = fox;
                    break;
                case 2:
                    Random random3 = new Random();
                    Frog frog = new Frog(false, "Царевна" + random3.nextInt(10), typeNumber*(31/29));
                    frog.setDisease(generateDisease(1));
                    patients[i] = frog;
                    break;    
                case 3:
                    Random random4 = new Random();
                    Hamster hamster = new Hamster(true, "Хома" + random4.nextInt(10), typeNumber*(31/29));
                    hamster.setDisease(generateDisease(2));
                    patients[i] = hamster;
                    break;
                case 4:
                    Random random5 = new Random();
                    Horse horse = new Horse(true, "Сивка" + random5.nextInt(10), typeNumber*(31/29));
                    horse.setDisease(generateDisease(2));
                    patients[i] = horse;
                    break; 
                case 5:
                    Random random6 = new Random();
                    Parrot parrot = new Parrot(true, "Гриша" + random6.nextInt(10), typeNumber*(31/29));
                    parrot.setDisease(generateDisease(2));
                    patients[i] = parrot;
                    break;       
            }   
        }
        return patients; 
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
        
        Animal[] animals = doctor01.getAnimals();
           
        for(Animal a: animals){
            a.voice();
            a.run();
        }
          
        Animal[] patients = generatePatients(6);
        
        for(Animal a : patients){
            System.out.println("пациент: " + a);
            System.out.println(a.getDisease());
        }
        

    }
}
 