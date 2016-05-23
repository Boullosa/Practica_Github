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
public class NifDigitosException extends Exception{

    public NifDigitosException() {
        super("Los primeros 8 elementos tienen que ser digitos.");
    }
}
