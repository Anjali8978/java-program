// Filecreate
import java.io.*;
import java.util.Scanner;

class File_handling
{
public static void main(String[] args)
{

    try
    {
        File obj1=new File("Doc.txt");
        if(obj1.createNewFile()){
            System.out.println("File is create");
        }
        else{
            System.out.println("already exists");
        }
    }  
    catch(IOException ae){
        System.out.println("error...!!");
        ae.printStackTrace();
    }
// file write
    try{
        FileWriter obj2=new FileWriter("Doc.txt");
        obj2.write("This is documentation file");
        obj2.close();
        System.out.println("Successful..!!");
    }
    catch(IOException ae){
     System.out.println("an error occured");
        ae.printStackTrace();
    }
// file read
    try{
        File obj3=new File("Doc.txt");
        Scanner scan=new Scanner(obj3);
        while(scan.hasNextLine());{
        String var1=scan.nextLine();
        System.out.println(var1);
        }
        scan.close();
      } 
      catch(FileNotFoundException e ){
          System.out.println("error");
          e.printStackTrace();

      }

  }

  }
    


    





