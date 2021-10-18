package manejoarchivos;

import java.io.*;


public class ManejoArchivos {

    public static void CrearArchivo(String nombreArchivo){
        // Declarnos un objeto de tipo File
        var archivo = new File(nombreArchivo);
       
        try {
            var salida = new PrintWriter(archivo); 
            // Aqui ya esta creado el archivo
            salida.close(); // cerrar el archivo
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }        
    }
    
    public static void escribirArchivo(String nombreArchivo, String contenido){
        // Declaramos un objeto de tipo File
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha escrito el contenido en el archivo");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
        
    }
    
    public static void agregarArchivo(String nombreArchivo, String contenido){
        // Declaramos un objeto de tipo File
        File archivo = new File(nombreArchivo);
        try {
            // Invocamos a FileWriter para poder anexar la información y no sobreescribir
            PrintWriter salida = new PrintWriter(new FileWriter(nombreArchivo, true));
            salida.println(contenido); // Agregar mi contenido
            salida.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e){
            e.printStackTrace(System.out);            
        }
    }
    
    public static void leerArchivo(String nombreArchivo){
        var archivo = new File(nombreArchivo);
        try {
            // entrada es el descriptor de lectura
            var entrada = new BufferedReader(new FileReader(archivo));
            // nos devuelve una línea de nuestro archivo
            var lectura = entrada.readLine();
            while(lectura != null){ // hasta null
                // Mostramos cada línea
                System.out.println("lectura = " + lectura);
                // Avanzamos en la lectura
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e){
            e.printStackTrace(System.out);
        }
    }
}
