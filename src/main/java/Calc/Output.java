package Calc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Output {
    public void write(ArrayList list) throws IOException {
        File file = new File("C:\\Users\\User1\\IdeaProjects\\Main\\src\\main\\java\\Calc\\output.txt");
        file.createNewFile();
        FileWriter filewriter = new FileWriter(file);
        for (int i=0; i<list.size();i++) {
            int element = (int) list.get(i);
            // System.out.println(element);
            filewriter.write(String.valueOf(element));
            filewriter.write("\n");
        }
        System.out.print(file.getPath());
        filewriter.flush();
        filewriter.close();

    }
}