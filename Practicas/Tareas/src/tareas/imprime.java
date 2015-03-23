package tareas;
import java.io.*;

public class imprime {
    public static void main (String [] args) throws IOException{
        int cont=0, n;
        FileReader in=null;
        try{
            in=new FileReader("/home/jonatan/NetBeansProjects/Tareas/XP.txt");
            
            while((n=in.read())!=-1){
                if(n!=32){
                    cont++;
                }
            }
            System.out.println("El total de cracteres son: "+cont);
        }
        catch (IOException e){
            System.out.println("Error"+e);
        }
        finally{
            if(in!=null){
                in.close();
            }
        }
    }
    
}
