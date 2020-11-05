
package clinic.animals.fishes;

import clinic.animals.Animal;
import clinic.animals.Swimmable;


public class Fish extends Animal implements Swimmable{

    private int finsCount;

    
    public Fish(boolean isMale,int finsCount ) {
        super(isMale);
        this.finsCount = finsCount;
    }
    
    
    
    public int getFinsCount() {
        return finsCount;
    }

    public void setFinsCount(int finsCount) {
        this.finsCount = finsCount;
    }
    
    

    @Override
    public void voice() {
        System.out.println("Буль-буль. Я некая рыба.");
    }
    
    @Override
    public String toString(){
        return "Рыба: " + getName();
    }
}
