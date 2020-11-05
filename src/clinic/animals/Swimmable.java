package clinic.animals;

public interface Swimmable {
    default void swim(){
        System.out.println("я плаваю!!!");
    }
}
