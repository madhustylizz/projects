package filehandlingmechanisms;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class CreateNewFile {
	public static void main(String[] args) throws IOException {
		createFileUsingFileClass();
		createFileUsingFileOutputStreamClass();
		createFileIn_NIO();
	}
    private static void createFileUsingFileClass() throws IOException
    {
          File file = new File("D:\\hello\\file1.txt");
  
          //Create the file
          if (file.createNewFile()){
            System.out.println("File is created!");
          }else{
            System.out.println("File already exists.");
          }
           
          //Write Content
          FileWriter writer = new FileWriter(file);
          writer.write("Hi I have created a New File and i am reading the data inside the file");
          writer.close();
    }
 
    private static void createFileUsingFileOutputStreamClass() throws IOException
    {
        String data = "Hi I have created a New File and i am reading the data inside the file";
        FileOutputStream out = new FileOutputStream("D:\\hello\\file1.txt");
        out.write(data.getBytes());
        out.close();
    }
 
    private static void createFileIn_NIO()  throws IOException
    {
        String data = "Test data";
        Files.write(Paths.get("D:\\hello\\file2.txt"), data.getBytes());
        List<String> lines = Arrays.asList("1st line", "2nd line");
       Files.write(Paths.get("D:\\hello\\file6.txt"),
                    lines,
                    StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
    }
}



