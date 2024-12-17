import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class myRunner {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path = "C:\\Users\\User\\Desktop\\Noor\\test\\test2.txt";
        FileReader f0 = new FileReader(path);

        int i ;
        while ((i = f0.read()) != -1){
            System.out.print((char) i);
        }

    }
}
