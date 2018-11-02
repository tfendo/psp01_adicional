
package crearprocesos;

import java.io.File;
import java.io.IOException;
/**
 *
 * @author HugoGuillin
 */
public class CrearProcesos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Process proceso=null;
        int n_procesos=0;
        String nombre_os=System.getProperty("os.name"), nombre_user=System.getProperty("user.name");
        
        if (args.length>0) { //Se comprueba si se ha pasado algún argumento
            try{ 
                n_procesos=Integer.parseInt(args[0]); //Abajo se captura la excepción en caso de que el argumento no sea un int
                if(nombre_os.toUpperCase().contains("WIN")){ //Se comprueba si el SO es Windows
                    for (int i = 1; i <= n_procesos; i++) {
                        proceso=Runtime.getRuntime().exec("java -jar C:"+File.separator+"Users"+File.separator+nombre_user+File.separator+"Documents"
                            + File.separator+"NetBeansProjects"+File.separator+"Editor"+File.separator+"dist"+File.separator+"DocumentEditor.jar");
                        System.out.println("Proceso nº "+i+" creado");
                    }
                }else if(nombre_os.toUpperCase().contains("MAC")){ //Se comprueba si el SO es MacOS
                    for (int i = 1; i <= n_procesos; i++) {
                        proceso=Runtime.getRuntime().exec("java -jar "+File.separator+"Users"+File.separator+nombre_user+File.separator+
                            "NetBeansProjects"+File.separator+"Editor"+File.separator+"dist"+File.separator+"DocumentEditor.jar");
                        System.out.println("Proceso nº "+i+" creado");
                    }
                }else{
                    for (int i = 1; i <= n_procesos; i++) { //Se comprueba si el SO es Linux
                        proceso=Runtime.getRuntime().exec("java -jar "+File.separator+"home"+File.separator+nombre_user+File.separator+"NetBeansProjects"+
                            File.separator+"Editor"+File.separator+"dist"+File.separator+"DocumentEditor.jar");
                        System.out.println("Proceso nº "+i+" creado");
                    }
                }
                
            }catch(NumberFormatException nfe){
                System.err.println("Solo se admiten números enteros como parametro");
                System.err.println(nfe.toString());
                System.exit(1);
            }catch(SecurityException se){
                System.err.println(se.toString());
            }catch(IOException ioe){
                System.err.println(ioe.toString());
            }
            
            
        }else{
            System.err.println("Se debe indicar el número de procesos a crear como parámetro");
            System.exit(1);
        }
    }
    
}
