import java.io.*;
import java.util.Scanner;

public class WeatherReader {

    Scanner input = null;

    /*
    Step 1: Method to check if the file exists, if file does not exists it throws and
    will throw a WeatherFileNotFoundException
    */
    public void checkFileExists(File file) throws WeatherFileNotFoundException{
        if (!(file.exists())){
            throw new WeatherFileNotFoundException();
        }
    }

    /*
    Step 2: Method to read file using Scanner methods and display the file content
    In this method catch the FileNotFoundException only
    */
    public void readFile(File file) {
        // Reading file line by line and display each line
        try {
            input = new Scanner(file);
            System.out.println("\nReading weather data from file:");
            while(input.hasNext()){
                String line = input.nextLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException();
        }
    }
    /*
    Step 3: Method to process the file by combining both tasks.
    In this method catch the WeatherFileNotFoundException only
    */
    public void processWeatherFile(String filePath) {
        // Step 1: Create File object to assign filePath
        File file = new File(filePath);
        // Step 2: Check file existence
        try {
            this.checkFileExists(file);
            // Step 3: Read the file
            this.readFile(file);
            this.readFileAsBytes(filePath);
            // Step extra: write to the file
            this.writeFileAsBytes(filePath, "Saturday: Foggy\n" );
            this.writeFileAsBytes(filePath, "Sunday: Rainy" );
            // Step extra: read the file
            this.readFile(file);
        } catch (WeatherFileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Method to read a file as a byte stream- FileInputStream
    //Make sure to include the IOException and printStackTrace() in the catch block.

    public void readFileAsBytes(String filePath) {
        try {
            FileInputStream fin = new FileInputStream(filePath);
            System.out.println("\nReading file as bytes");
            int i = 0;
            // System.out.println(fin.read());
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // Method to write data to a file as a byte stream - FileOutputStream
    //Make sure to include the IOException and printStackTrace() in the catch block.
    public void writeFileAsBytes(String filePath, String content) {
        try {
            FileOutputStream fout = new FileOutputStream(filePath, false);
            System.out.println("\n \nContent written to file successfully as bytes.");
            for(int i =0  ; i < content.length(); i++){
                fout.write((int) content.charAt(i));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // Method to accept user input for file names
    public String getFileNameFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name (with path): ");
        return scanner.nextLine();
    }
}
