/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.animals.comparators;

import clinic.animals.Animal;
import java.util.Comparator;

/**
 *
 * @author ENVY
 */
public class IdComparator implements Comparator<Animal>{

    @Override
    public int compare(Animal t, Animal t1) {
        if(t.getId() == t1.getId()){
            return 0;
        }
        else if(t.getId() >= t1.getId()){
            return 1;
        }else{
            return -1;
        }
    }
    
}
