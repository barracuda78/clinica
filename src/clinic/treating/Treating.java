package clinic.treating;

import clinic.animals.Animal;
import clinic.animals.Cat;
import clinic.animals.Hamster;
import clinic.animals.Parrot;
import clinic.exceptions.DoctorIsBusyException;
import clinic.staff.Doctor;

public class Treating {

    private Doctor doctor;

    public Treating(Doctor d) {
        doctor = d;
    }

    //ВАРИАНТ 1: статический метод: добавляет Animal animal в поле private Animal[] animals класса Doctor;
    public static void assignToDoctor(Animal animal, Doctor doctor) throws DoctorIsBusyException {
        Animal[] arr = doctor.getAnimals();
        new Treating(doctor).assigner(arr, animal);
        doctor.setAnimals(arr);
    }

    //ВАРИАНТ 2: нестатический метод, через Object: возвращает true если пациент назначен доктору успешно.
    //добавляет Cat, Hamster или Parrot в соответствующее поле[] в классе Doctor;
    public boolean assignToDoctor(Object animal) {
        
        if (animal instanceof Cat){
            Cat cat = (Cat)animal;
            Cat[] cats = doctor.getCats();
            try{
                assigner(cats, cat);
                doctor.setCats(cats);
            }catch(DoctorIsBusyException e){
                System.out.println(e.getMessage());
                System.out.println("Кот/кошка не может быть добавлен/а к этому доктору: доктор занят.");
                return false;
            }
            return true;
            
        }else if(animal instanceof Hamster){
            Hamster hamster = (Hamster)animal;
            Hamster[] hamsters = doctor.getHamsters();
            try{
                assigner(hamsters, hamster);
                doctor.setHamsters(hamsters);
            }catch(DoctorIsBusyException e){
                System.out.println(e.getMessage());
                System.out.println("Хомяк не может быть добавлен к этому доктору: доктор занят.");
                return false;
            }
            return true;
            
        }else if(animal instanceof Parrot){
            Parrot parrot = (Parrot)animal;
            Parrot[] parrots = doctor.getParrots();
            try{
                assigner(parrots, parrot);
                doctor.setParrots(parrots);
            }catch(DoctorIsBusyException e){
                System.out.println(e.getMessage());
                System.out.println("Попугай не может быть добавлен к этому доктору: доктор занят.");
                return false;
            }
            return true;
        }else
            return false;
    
    }
    
    //вспомогательный метод для проверки наличия пустых ячеек в массиве и записи животного в этот массив.
    private void assigner(Object[] objects, Object animal) throws DoctorIsBusyException{
        int emptyIndexCounter = 0;
        for (int i = 0; i < objects.length; i++) {
            
            if (objects[i] == null) {
                objects[i] = animal;
                emptyIndexCounter++;
                break;
            }
        }
        if (emptyIndexCounter == 0) {
            throw new DoctorIsBusyException("Ошибка: очередь доктора полна.");
        }
    }
   

    public void treat() {
        System.out.println("Мы вас лечим.");
    }

}
