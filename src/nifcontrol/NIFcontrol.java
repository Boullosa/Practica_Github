package nifcontrol;

import nifexceptions.*;
import nifobjeto.NIF;

/**
 *
 * @author dam118
 */
public class NIFcontrol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lector in = new Lector();
        boolean fallo;
        NIF n;
        
        do{
            try{
                System.out.print("Introduce tu nif: ");
                n = new NIF(in.leerCadena());
                System.out.println("NIF: "+n.getNif());
                fallo=false;
            }catch(NifLetraException | NifLetraExisteException | NifDigitosException | NifTamanoException e){
                System.err.println(e.getMessage());
                fallo=true;
            }
        }while(fallo);
        System.out.println("Programa finalizado");
    }
}