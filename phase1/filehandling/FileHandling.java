package filehandling;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FileHandling {
	
	
	 public static List<String> readFileInList(String fileName) 
	  { 
	  
	    List<String> lines = Collections.emptyList(); 
	    try
	    { 
	      lines = 
	       Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8); 
	    } 
	  
	    catch (IOException e) 
	    { 
	      e.printStackTrace(); 
	    } 
	    return lines; 
	  } 
	public static void main(String[] args) throws IOException, InterruptedException {
		String cont = "y";
		while(cont.equalsIgnoreCase("Y")) {
		System.out.println("1. Add the data \n2. Read the data\n3. Append the data");
		Scanner sc1=new Scanner(System.in);
		int choose=sc1.nextInt();
		
		if(choose==1) {
		File file=new File("D:\\hello\\addedfile.txt");
		if(file.createNewFile()) {
			System.out.println("New File is Created");    //file is created
		}
		else {
			System.out.println("File already Exists");
		}
		
		
		//Writing  Content in the created file 
        FileWriter writer = new FileWriter(file);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Content you want to add in the created file:");
        String str=sc.nextLine();
        writer.write(str);
        writer.flush();
        
        writer.close();
        System.out.println("Entered Content added to the file");
        
        
        System.out.println("Do you want to continue? Y/N");
      	 cont = sc.nextLine();
		}
		
		else if(choose==2) {
        //Reading content in the file
        System.out.println("Reading the content in the file.....");
        Thread.sleep(2000);
        List li=readFileInList("D:\\hello\\addedfile.txt");
        Iterator<String> it=li.iterator();
        while(it.hasNext())
        	System.out.println(it.next());
        System.out.println("Do you want to continue? Y/N");
        Scanner sc=new Scanner(System.in);
      	 cont = sc.nextLine();
		}
        //Append the file
		else if(choose==3) {
			System.out.println("Append the data");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the data to append :");
			String str=sc.nextLine();
        List<String> lines = Arrays.asList("\n"+str);
        Files.write(Paths.get("D:\\hello\\addedfile.txt"),
                     lines,
                     StandardCharsets.UTF_8,
                     StandardOpenOption.CREATE,
                     StandardOpenOption.APPEND);
        System.out.println("data append completed");
        System.out.println("Do you want to continue? Y/N");
        
      	 cont = sc.nextLine();
        
        
		}
        
	}
	}
	}


