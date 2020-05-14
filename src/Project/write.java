package Project;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class write implements Runnable {
	holder ob;
    write(holder ob)
    {
        this.ob=ob;
    }
    @Override
    public void run() {
          try{
        FileOutputStream fout=new FileOutputStream("backup");
        ObjectOutputStream oos=new ObjectOutputStream(fout);
        oos.writeObject(ob);
        }
        catch(Exception e)
        {
            System.out.println("Error in writing "+e);
        }        
       
    }
}
