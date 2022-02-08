import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class ReadAndWriteIO {
    public void readFile(String fname) {
        try {
            FileReader fr = new FileReader(fname);
            BufferedReader br = new BufferedReader(fr);
            
            String line;
            while ((line = br.readLine()) != null)
                System.out.println(line);
        } catch (IOException exception) {
            System.out.println("Error occured while reading file.");
        }
    }
}
