
package clinic.animals.fishes;

import clinic.animals.Animal;


public class Fish extends Animal{

    private int finsCount;
    
    public Fish(boolean isMale,int finsCount ) {
        super(isMale);
        this.finsCount = finsCount;
    }

    @Override
    public void voice() {
        System.out.println("Буль-буль. Я некая рыба.");
    }
    
}
