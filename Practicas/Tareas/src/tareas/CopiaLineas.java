package tareas;
import java.io.*;

public class CopiaLineas {
    public static void main (String Args[]) throws IOException{
        BufferedReader in = null;
        PrintWriter out = null;
        try{
            in = new BufferedReader(new FileReader("/home/jonatan/NetBeansProjects/Tareas/src/tareas/CopiaLineas.java"));
            out = new PrintWriter (new FileWriter("CopiaLineas.txt"));
            
            String linea;
            
            while((linea=in.readLine())!=null){
                out.print(linea);
                //break;
            }
        }
        finally{
            if(in!=null){
                in.close();
            }
            if(out!=null){
                out.close();
            }
        }
    }
    
}
