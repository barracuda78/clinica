/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.exceptions;

/**
 *
 * @author ENVY
 */
public class DoctorIsBusyException extends Exception{
    public DoctorIsBusyException(String message){
        super(message);
    }
}
