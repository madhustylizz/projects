package pack1;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Sprint1 {
	static String DIRECTORY;
    File folder_name;

    public Sprint1() {
        DIRECTORY = System.getProperty("user.dir");
        folder_name = new File(DIRECTORY+"/New Folder");
        if (!folder_name.exists())
            folder_name.mkdirs();
        System.out.println("DIRECTORY : "+ folder_name.getAbsolutePath());
    }

    void showPrimaryMenu() {
        System.out.println("\n\t1 ->View the Files\n\t2 ->Add, Delete or Search\n\t3 ->Exit");
        System.out.println("Choose one option");
        try{
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            switch (option){
                case 1 : {
                    showFiles();
                    showPrimaryMenu();
                }
                case 2 : {
                	System.out.println("1. Add the file\n2. Delete the file\n3. Search the file\n4. Main menu");
                    System.out.println(" ");
                    break;
                }
                case 3 : {
                    System.out.println("Thank You");
                    System.exit(0);
                }
                default: showPrimaryMenu();
            }
        }
        catch (Exception e){
            System.out.println("Please enter 1, 2 or 3");
            showPrimaryMenu();
        }
    }

   

    void showFiles() {
        if (folder_name.list().length==0)
            System.out.println("The folder is empty");
        else {
            String[] list = folder_name.list();
            System.out.println("The files in "+ folder_name +" are :");
            Arrays.sort(list);
            for (String str:list) {
                System.out.println(str);
            }
        }
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n\t\t*---WELCOME---*\n\t\t*---BOYA MADHU---*");
        Sprint1 menu = new Sprint1();
        menu.showPrimaryMenu();

	}

}
