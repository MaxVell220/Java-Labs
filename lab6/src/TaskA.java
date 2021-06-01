import java.io.*;
import java.util.Scanner;

public class TaskA {
    public static void taskA() throws IOException {
        Scanner in = new Scanner(System.in);
        File file = new File("filePath.txt");
        Scanner inFile = new Scanner(file);
        String path = inFile.next();
        System.out.println("Input file name:");
        String fileName = in.next();
        File poemFile = new File(path + "/" + fileName);
        FileReader fr = new FileReader(poemFile);
        BufferedReader reader = new BufferedReader(fr);
        String text = reader.readLine();
        StringBuilder poem = new StringBuilder();
        while (text != null) {
            poem.append(text).append("\n");
            text = reader.readLine();
        }
        String textPoem = String.valueOf(poem);
        System.out.println(textPoem);
        System.out.println("Input enter the string to replace and the string to replace with: ");
        String buff = in.nextLine();
        String oldStr = in.nextLine();
        String newStr = in.nextLine();
        String result = textPoem.replaceAll(oldStr, newStr);
        System.out.println(result);
        fr.close();
        System.out.println("Input file name:");
        String fileNameResult = in.next();
        FileOutputStream fos = new FileOutputStream(path + "/" + fileNameResult);
        byte[] textRes = result.getBytes();
        fos.write(textRes);
        fos.close();
    }
}
