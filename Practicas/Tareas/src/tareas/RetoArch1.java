package tareas;
import java.io.*;

public class RetoArch1 {
    public static void main (String args[])throws IOException{
        BufferedReader in = null;
        PrintWriter out = null;
        try{
            in = new BufferedReader(new FileReader("/home/jonatan/NetBeansProjects/Tareas/XP.txt"));
            out = new PrintWriter (new FileWriter("Alberto.txt"));
            
            int lineas;
            int c=0;
             while((lineas=in.read())!=-1){
                 c++;
             }
             out.print(c);  
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
