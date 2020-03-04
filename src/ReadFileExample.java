import java.io.*;

public class ReadFileExample {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/vuanh/IdeaProjects/APJ-DemoReadFile/src/numbers.txt";
        File file = new File(filePath);

        if (!file.exists()){
            file.createNewFile();
        }

        FileInputStream fileInputStream = new FileInputStream(file);

        int c = fileInputStream.read();
        while (c != -1){
            System.out.println((char) c);
            c = fileInputStream.read();
        }
    }
}
