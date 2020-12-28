// Demonstration of SerialVersionID
import java.io.*;

class Dog1 implements java.io.Serializable
{
   int i=10;
   int j=20;
  
}

//Sender.java
class Sender
{
  public static void main(String arg[])throws Exception
  {
     Dog1 d1=new Dog1();
	 //Serilization
	 FileOutputStream fos=new FileOutputStream("abc.ser");
	 ObjectOutputStream oos=new ObjectOutputStream(fos);
	    oos.writeObject(d1);
		fos.close();
		oos.close();
  }

}
//Receiver.java
class Receiver
{
	
	 public static void main(String arg[])throws Exception
     {
       //Deserilization
	   FileInputStream fis=new FileInputStream("abc.ser");
	   ObjectInputStream ois=new ObjectInputStream(fis);
	
       Dog1 d2= (Dog1)ois.readObject(); 
	   System.out.println(d2.i+" and "+d2.j);
	 
	 }
}

   
	