package tareas;
import java.io.*;

public class CopiaBytes {
	public static void main(String arg[]) throws IOException{
		
		FileInputStream in=null;
		FileOutputStream on=null;
		
		try{
			in= new FileInputStream("/home/jonatan/NetBeansProjects/Tareas/src/tareas/CopiaBytes.java");
			on= new FileOutputStream("CopiaBytes.txt");
                int c;
                while ((c=in.read()) !=-1){
                    on.write(c);
                }
		}
                finally{
                    if(in!=null){
                        in.close();
                    }
                    if(on!=null){
                        on.close();
                    }
                }
	}
}
