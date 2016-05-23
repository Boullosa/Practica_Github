package nifcontrol;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author Oscarina
 */
public class Lector {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    public String leerCadena(){
        String cadena=null;
        boolean fallo;
        
        do{
            try{
                cadena = in.readLine();
                fallo=false;
            }catch(NumberFormatException error){
                System.out.print("ERROR: "+error.getMessage()+"\nIntente de nuevo: ");
                fallo=true;
            }catch(IOException error){
                System.out.print("ERROR: "+error.getMessage()+"\nIntente de nuevo: ");
                fallo=true;
            }catch(Exception error){
                System.out.print("UNEXPECTED ERROR: "+error.getMessage()+"\nIntente de nuevo: ");
                fallo=true;
            }
        }while(fallo);
        
        return cadena;
    }
    
    public char leerCaracter(){
        String cadena=null;
        char caracter=0;
        boolean fallo;
        
        do{
            try{
                cadena = in.readLine();
                caracter = cadena.charAt(1);
                System.out.println("Usa solo un caracter");
                fallo=true;
            }catch(StringIndexOutOfBoundsException e){
                caracter = cadena.charAt(0);
                fallo=false;
            }catch(NumberFormatException error){
                System.out.print("ERROR: "+error.getMessage()+"\nIntente de nuevo: ");
                fallo=true;
            }catch(IOException error){
                System.out.print("ERROR: "+error.getMessage()+"\nIntente de nuevo: ");
                fallo=true;
            }catch(Exception error){
                System.out.print("UNEXPECTED ERROR: "+error.getMessage()+"\nIntente de nuevo: ");
                fallo=true;
            }
        }while(fallo);
        
        return caracter;
    }
    
    public int leerByte(){
        byte bite=0;
        boolean fallo;
        
        do{
            try{
                bite = Byte.parseByte(in.readLine());
                fallo=false;
            }catch(NumberFormatException error){
                System.out.print("ERROR: "+error.getMessage()+"\nIntente de nuevo: ");
                fallo=true;
            }catch(IOException error){
                System.out.print("ERROR: "+error.getMessage()+"\nIntente de nuevo: ");
                fallo=true;
            }catch(Exception error){
                System.out.print("UNEXPECTED ERROR: "+error.getMessage()+"\nIntente de nuevo: ");
                fallo=true;
            }
        }while(fallo);
        
        return bite;
    }
    
    public short leerShort(){
        short corto=0;
        boolean fallo;
        
        do{
            try{
                corto = Short.parseShort(in.readLine());
                fallo=false;
            }catch(NumberFormatException error){
                System.out.print("ERROR: "+error.getMessage()+"\nIntente de nuevo: ");
                fallo=true;
            }catch(IOException error){
                System.out.print("ERROR: "+error.getMessage()+"\nIntente de nuevo: ");
                fallo=true;
            }catch(Exception error){
                System.out.print("UNEXPECTED ERROR: "+error.getMessage()+"\nIntente de nuevo: ");
                fallo=true;
            }
        }while(fallo);
        
        return corto;
    }
    
    public int leerEntero(){
        int entero=0;
        boolean fallo;
        
        do{
            try{
                entero = Integer.parseInt(in.readLine());
                fallo=false;
            }catch(NumberFormatException error){
                System.out.print("ERROR: "+error.getMessage()+"\nIntente de nuevo: ");
                fallo=true;
            }catch(IOException error){
                System.out.print("ERROR: "+error.getMessage()+"\nIntente de nuevo: ");
                fallo=true;
            }catch(Exception error){
                System.out.print("UNEXPECTED ERROR: "+error.getMessage()+"\nIntente de nuevo: ");
                fallo=true;
            }
        }while(fallo);
        
        return entero;
    }
    
    public long leerLong(){
        long largo=0;
        boolean fallo;
        
        do{
            try{
                largo = Long.parseLong(in.readLine());
                fallo=false;
            }catch(NumberFormatException error){
                System.out.print("ERROR: "+error.getMessage()+"\nIntente de nuevo: ");
                fallo=true;
            }catch(IOException error){
                System.out.print("ERROR: "+error.getMessage()+"\nIntente de nuevo: ");
                fallo=true;
            }catch(Exception error){
                System.out.print("UNEXPECTED ERROR: "+error.getMessage()+"\nIntente de nuevo: ");
                fallo=true;
            }
        }while(fallo);
        
        return largo;
    }
    
    public float leerDecimal(){
        float deci=0;
        boolean fallo;
        
        do{
            try{
                deci = Integer.parseInt(in.readLine());
                fallo=false;
            }catch(NumberFormatException error){
                System.out.print("ERROR: "+error.getMessage()+"\nIntente de nuevo: ");
                fallo=true;
            }catch(IOException error){
                System.out.print("ERROR: "+error.getMessage()+"\nIntente de nuevo: ");
                fallo=true;
            }catch(Exception error){
                System.out.print("UNEXPECTED ERROR: "+error.getMessage()+"\nIntente de nuevo: ");
                fallo=true;
            }
        }while(fallo);
        
        return deci;
    }
    
    public double leerDouble(){
        double doble=0;
        boolean fallo;
        
        do{
            try{
                doble = Integer.parseInt(in.readLine());
                fallo=false;
            }catch(NumberFormatException error){
                System.out.print("ERROR: "+error.getMessage()+"\nIntente de nuevo: ");
                fallo=true;
            }catch(IOException error){
                System.out.print("ERROR: "+error.getMessage()+"\nIntente de nuevo: ");
                fallo=true;
            }catch(Exception error){
                System.out.print("UNEXPECTED ERROR: "+error.getMessage()+"\nIntente de nuevo: ");
                fallo=true;
            }
        }while(fallo);
        
        return doble;
    }
}