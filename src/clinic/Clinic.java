package clinic;

import clinic.animals.Animal;
import clinic.animals.Cat;
import clinic.animals.Fox;
import clinic.animals.Frog;
import clinic.animals.Hamster;
import clinic.animals.Horse;
import clinic.animals.Parrot;
import clinic.animals.Speakable;
import clinic.animals.Swimmable;
import clinic.animals.fishes.Fish;
import clinic.animals.fishes.Goldfish;
import clinic.animals.fishes.Guppy;
import clinic.animals.fishes.Shark;
import clinic.clients.Client;
import clinic.disease.Disease;
import clinic.exceptions.DoctorIsBusyException;

import clinic.staff.Doctor;
import clinic.staff.Nurse;
import clinic.treating.Treating;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Clinic {
    private String brand;

    @Override
    public String toString(){
        return brand;
    }
    
    private static Disease generateDisease(int category){
        
        Random random = new Random();
        int typeNumber = random.nextInt(5);
        //System.out.println("random.nextInt(5) = " + typeNumber);
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
            int typeNumber = random.nextInt(9);
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
                case 6:
                    Random random7 = new Random();
                    Guppy guppy = new Guppy(false, 5);
                    guppy.setName("Глупышка гуппи");
                    guppy.setDisease(generateDisease(2));
                    patients[i] = guppy;
                    break;
                case 7:
                    Random random8 = new Random();
                    Goldfish goldfish = new Goldfish(false, 4);
                    goldfish.setName("Золотая рыбка");
                    goldfish.setDisease(generateDisease(2));
                    patients[i] = goldfish;
                    break; 
                case 8:
                    Random random9 = new Random();
                    Shark shark = new Shark(false, 8);
                    shark.setName("Акула-убийца");
                    shark.setDisease(generateDisease(2));
                    patients[i] = shark;
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

        Parrot unknownParrot = new Parrot(false);
        
        Guppy guppy01 = new Guppy(false, 4);
        guppy01.setName("Глупышка Гуппи");
        
        Guppy guppy02 = new Guppy(true, 4);
        guppy02.setName("Умняшка Гуппи");
        
        
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
           
//        for(Animal a: animals){
//            a.voice();
//            a.run();
//        }
          
//        Animal[] patients = generatePatients(6);
//        
//        for(Animal a : patients){
//            if(!a.isIll()){
//                System.out.println("пациент: " + a + " здоров!");
//            }
//            else{
//                System.out.println("пациент: " + a + " болен: " + a.getDisease());
//            }
//
//        }
        
        /////////////////
//        System.out.println("\nВыведем в сгенерированном списке пациентов только болеющих водоплавающих:\n");
//        for(Animal a: generatePatients(20)){
//            if(a instanceof Fish && a.isIll()){
//                Fish fish = (Fish)a;
//                System.out.println(fish.getFinsCount());
//            }else{
//                System.out.println(a.getName());
//            }
//        }
        
        ////////////////////
        System.out.println("\nВыведем в сгенерированном списке Speakable пациентов с каждой болезнью:\n");
        
        Animal[] animalsArray = generatePatients(20);
        
        Map<Disease, Integer> map = new HashMap();
        
        //создать и заполнить массив болезней:
        Disease[] diseases = new Disease[animalsArray.length];
        for(int i = 0; i < animalsArray.length; i++){
            if(animalsArray[i] instanceof Speakable){
                if(animalsArray[i].getDisease() != null){
                    if(!Arrays.asList(diseases).contains(animalsArray[i].getDisease())){
                          diseases[i] = animalsArray[i].getDisease();
                    }
                }
                
            }
            
        }
        
        //итерироваться по массиву болезней. Считать количество заболевших:
        for(Disease disease : diseases){
            int counter = 0;
            if(disease != null){
                
                for(int i = 0; i < animalsArray.length; i++){
                    if(animalsArray[i] instanceof Speakable){
                        if(disease.equals(animalsArray[i].getDisease())){
                            counter++;
                        }
                    }
                   
                }
            }
            if(disease != null){
                System.out.println(disease.getName() + " : " + counter);
                counter = 0;
            }

        }
        
        
    }
}
 