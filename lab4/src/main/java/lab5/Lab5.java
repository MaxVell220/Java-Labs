package lab5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab5 {
    public static void defiant() {
        try {
            File file = new File("D:/BSU/lab4/text-files-for-lab");
            Scanner in = new Scanner(file);
            int count = in.nextInt();
            double[] mass = new double[count];
            String locale;
            String numb;
            for (int i = 0; i < count; i++) {
                locale = in.next();
                numb = in.next();
                switch (locale) {
                    case "en":
                        break;
                    case "de":
                        break;
                    case "en_CA":
                        break;
                    case "fr_FR":
                        break;
                    case "en_US":
                        break;
                    case "en_GB":
                        break;
                    case "it-IT":
                        break;
                    case "zh_CN":
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
