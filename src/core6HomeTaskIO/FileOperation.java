package core6HomeTaskIO;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class FileOperation {
    public static void main(String[] args) {
        fileLineOperations();
    }

    public static void fileLineOperations() {
        File file = new File("/Users/admin/IdeaProjects/Test/src/core6HomeTaskIO/Files/InitialFile.txt");
        ArrayList<String> arrayList = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                arrayList.add(line);
                line = bufferedReader.readLine();
            }
            FileWriter fileWriter = new FileWriter("/Users/admin/IdeaProjects/Test/src/core6HomeTaskIO/Files/ResultFile.txt");
            Collections.sort(arrayList);
            for (String currentLine : arrayList) {
                fileWriter.write(currentLine);
                fileWriter.write("\n");
            }
            fileWriter.close();
            bufferedReader.close();
            fileReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
