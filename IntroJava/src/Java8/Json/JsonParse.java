package Java8.Json;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsonParse {

    public static void main(String[] args) throws IOException {

        jsonParse();
    }

    public static void jsonParse() throws IOException {
        String filePath = "./attachment/myjson.json";

        BufferedReader bufferedReader = null;

        FileReader fileReader;

        {
            try {
                fileReader = new FileReader(filePath);
                bufferedReader = new BufferedReader(fileReader);

                StringBuffer stringBuffer = new StringBuffer();
                String line = "";

                while ((line = bufferedReader.readLine()) != null) {
                    stringBuffer.append(line).append(System.lineSeparator());
                }
                System.out.println(stringBuffer);

            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                bufferedReader.close();
                System.out.println();
            }
        }
    }
}
