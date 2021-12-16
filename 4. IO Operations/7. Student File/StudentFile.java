import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

public class StudentFile {
	public static void main(String[] args) throws IOException{  
        File dir = new File("./Classes"); // File Directory
        FileWriter writer = new FileWriter("Students.txt"); // Target File 
        File[] files = dir.listFiles(); // Listing all the files as file objets in the directory
        for(File file : files){
            /* Splitting the filename to get the class name 
            Eg:-
            File Name "1.txt" -> Class ==> 1
            */
            String studentClass = file.getName().split("\\.(?=[^\\.]+$)")[0]; 
            if (file.isFile()){
                BufferedReader input = null;
                String line;
                try{
                    input = new BufferedReader(new FileReader(file));
                    while ((line = input.readLine()) != null){
                        String[] student = line.split("###"); // Splitting the data of each student
                        if (Integer.parseInt(student[2])>10){ // Checking the age of the Student
                            for(int i=1; i<student.length; i++){
                                writer.write(student[i] + "###"); // Writing the data in the target file
                            }
                            writer.write(studentClass + "\n");
                        }
                    }
                }
                catch(IOException e) {
                	System.out.println(e);
                }
                finally {
                    if (input != null) {
                        input.close();
                    }
                }
            }
        }  
        writer.close();
	}
}