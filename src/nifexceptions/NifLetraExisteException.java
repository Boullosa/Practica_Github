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
public class NifLetraExisteException extends Exception{

    public NifLetraExisteException() {
        super("El ultimo elemento tiene que ser una letra.");
    }
}
