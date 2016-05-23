package nifobjeto;

import nifexceptions.*;

/**
 *
 * @author dam118
 */
public class NIF {
    private String nif;

    public NIF(String nif) throws NifLetraException, NifLetraExisteException, NifDigitosException, NifTamanoException {
        if(controlTamano(nif))
            if(todoDigitos(nif))
                if(tieneLetra(nif))
                    if(letraCorrecta(nif))
                        this.nif=nif;
                    else
                        throw new NifLetraException();
                else
                    throw new NifLetraExisteException();
            else
                throw new NifDigitosException();
        else
            throw new NifTamanoException();
    }

    public String getNif() {
        return nif;
    }
    
    /**
     * Comprueba que el tamañano de la cadena introducida sea 9
     * @param cadena cadena introducida
     * @return True si la cadena tiene 9 elementos
     */
    private boolean controlTamano(String cadena){
        return cadena.length()==9 || cadena.length()==8;
    }
    
    /**
     * Comrpueba que los 8 primeros elmentos de la cadena sean digitos
     * @param cadena cadena introducida
     * @return True si los 8 primeros elementos son digitos
     */
    private boolean todoDigitos(String cadena){
        boolean digitos = true;
        
        for(int i=0; i<cadena.length()-1&&digitos;i++){
            digitos = Character.isDigit(cadena.charAt(i));
        }
        return digitos;
    }
    
    /**
     * Comprueba que el ultimo elemento de una cadena de 9 elementos sea una letra
     * @param cadena cadena introducida
     * @return True si el elementos 9 (ultimo) es una letra
     */
    private boolean tieneLetra(String cadena){
        return Character.isLetter(cadena.charAt(cadena.length()-1));
    }
    
    /**
     * Comprueba que la letra de la cadena es la que corresponde a los digitos
     * @param cadena Cadena Introducida
     * @return True si la letra corresponde a la adecuada
     */
    private boolean letraCorrecta(String cadena){
        return Character.toUpperCase(cadena.charAt(cadena.length()-1))==calculoLetra(Integer.valueOf(cadena.substring(0, cadena.length()-1)));
    }
    
    /**
     * Calcula el caracter que le corresponde a los digitos del nif
     * @param numero Parte numerica de la cadena de nif
     * @return El caracter que le corresponde a ese numero
     */
    private char calculoLetra(int numero){
        final char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        
        return letras[numero%23];
    }
}
