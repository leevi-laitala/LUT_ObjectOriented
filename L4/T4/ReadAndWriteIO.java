import java.io.FileReader;
import java.io.FileWriter;
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
    
    public void readAndWrite(String rfname, String wfname) {
        try {
            FileReader fr = new FileReader(rfname);
            FileWriter fw = new FileWriter(wfname);
            BufferedReader br = new BufferedReader(fr);
                
            String line;
            while ((line = br.readLine()) != null)
                if (line.replaceAll(" ", "").length() > 0 && line.length() < 30 && line.contains("v"))
                    fw.write(line + '\n');

            fr.close();
            fw.close();
        } catch (IOException exception) {
            System.out.println("Error occured while reading/writing file.");
        }

    }
}
