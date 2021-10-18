
package test;

import static manejoarchivos.ManejoArchivos.*;


public class Test {
    
    public static void main(String[] args) {
        var nombreArchivo = "Asignaturas.txt";
        var contenido1 = "Desarrollo de Aplicaciones Multiplataforma";
        
        //CrearArchivo(nombreArchivo);
        //escribirArchivo(nombreArchivo, contenido1);
         agregarArchivo(nombreArchivo, contenido1);
         agregarArchivo(nombreArchivo, "Empresas");
        leerArchivo(nombreArchivo);
    }
    
}
