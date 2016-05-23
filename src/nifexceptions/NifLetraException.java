/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nifexceptions;

/**
 *
 * @author dam118
 */
public class NifLetraException extends Exception{

    public NifLetraException() {
        super("La letra introducida no se corresponde con esos digitos.");
    }
}
