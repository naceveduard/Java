import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainClass {
    public static void main(String[] args) {

        String destination = "";
        String nameFolder="";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String verification="yes";
        while(verification.equals("yes")) {

            try {
                System.out.println("C:\\Users\\nacev\\OneDrive\\Desktop");
                System.out.print("Enter destination - ");
                destination = br.readLine();
                File file = new File(destination);
                System.out.println(file.getName() + " |" + file.getPath() + " |" + file.getTotalSpace() + " |" + file.lastModified());

                String operation = "";
                BufferedReader cr = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Types of operations: create, rename, copy, move, delete");
                System.out.print("Enter your operation:");
                operation = br.readLine();

                if (operation.equals("create")) {
                    System.out.println("Enter the name of the folder you want to create:");
                    nameFolder = br.readLine(); //read string
                    String folderName = destination + "\\" + nameFolder;
                    File testDirectory = new File(folderName); //am creat cale fisier nou

                    if (!testDirectory.exists()) {  //if directory doesn`t exist, then create it
                        testDirectory.mkdir(); //create the folder
                        System.out.println("Folder was created with the name: " + testDirectory.getName());
                    }

                }

                if (operation.equals("Rename")) {
                    String newFileName = "";
                    System.out.println("Enter the name of the folder to replace:");
                    nameFolder = br.readLine();
                    System.out.println("Enter the new name for the folder");
                    newFileName = br.readLine();

                    File oldfile = new File(destination + "\\" + nameFolder);
                    File newfile = new File(destination + "\\" + newFileName);
                    if (!oldfile.exists()) {
                        System.out.println("Folder doesn`t exist");
                        return;
                    }
                    if (newfile.exists()) {
                        System.out.println("Choose another name for the folder");
                        newFileName = br.readLine();
                        newfile = new File(destination + "\\" + newFileName);
                    }
                    if (oldfile.renameTo(newfile)) {
                        System.out.println("Folder has been succesfully renamed");
                    } else {
                        System.out.println("Folder wasn`t renamed");


                    }
                }

                if (operation.equals("copy")) {
                    String path="";
                    System.out.println("Enter the name of the folder to copy: ");
                    nameFolder = br.readLine();
                    System.out.println("Enter the path where the file will be sent: ");
                    path = br.readLine();
                    File afile = new File(destination + "\\" + nameFolder);
                    File bfile = new File(path + "\\" + nameFolder);

                    FileInputStream inStream = new FileInputStream(afile);
                    FileOutputStream outStream = new FileOutputStream(bfile);
                    byte[] buffer = new byte[1024];
                    int length;
                    while((length=inStream.read(buffer))>0){
                        outStream.write(buffer, 0, length);
                        System.out.println("File is copied successfuly!");

                    }

                }

                if (operation.equals("move")) {
                    System.out.println("Sunteti in mutare");
                }

                if (operation.equals("delete")) {
                    System.out.println("Enter the name of the folder you want to delete: ");
                    nameFolder = br.readLine(); // read string
                    String folderName = destination + "\\" + nameFolder;
                    File testDirectory = new File(folderName); //create path, new file

                    if (testDirectory.exists()) {
                        testDirectory.delete(); //delete the file
                        System.out.println("Folder " + " " + testDirectory.getName() + " has been deleted");
                    }
                }
                System.out.println("Would you like to continue?");
                verification=br.readLine();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        }
    }


