package tareas;

import java.io.*;
public class Numeros {
    public static void main (String args[])throws IOException{
        BufferedReader in = null;
        int l;
        int c=0;
        //PrintWriter out = null;
        try{
            in = new BufferedReader(new FileReader("/home/jonatan/NetBeansProjects/Tareas/XP.txt"));
            //out = new PrintWriter (new FileWriter("Alberto.txt"));
            
            
             while((l=in.read())!=-1){
                 if (l>=48 && l<=57){
     
                 c++;
                }
            // out.print(c);  
            }
        }
         finally{
            if(in!=null){
                in.close();
                System.out.println("El total de numeros son: "+c);
            }
            //if(out!=null){
              //  out.close();
        }
    }
}
