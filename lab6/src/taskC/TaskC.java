package taskC;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class TaskC {
    public static void taskC() throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Input dir name:");
        String dirPath = in.nextLine();
        File dir = new File(dirPath);
        dir.mkdir();
        ArrayList<Phone> phone = new ArrayList<>();
        phone.add(new Phone("758932472", "Tom"));
        phone.add(new Phone("865324472", "Mary"));
        phone.add(new Phone("375256565", "Pol"));
        phone.add(new Phone("102535445", "Robert"));
        phone.add(new Phone("258552555", "Sandra"));
        phone.add(new Phone("776546546", "Lily"));
        phone.add(new Phone("246562135", "Kate"));
        phone.add(new Phone("3952812482", "Rob"));
        phone.add(new Phone("9423153535", "Ivan"));
        phone.add(new Phone("758932472", "Mark"));
        phone.add(new Phone("758932472", "Jan"));
        phone.add(new Phone("758932472", "Jane"));
        phone.add(new Phone("758932472", "Katrin"));
        if (dir.isDirectory()) {
            System.out.println("Input file name:");
            String fileName = in.next();
            File file = new File(dir, fileName);
            FileOutputStream fos = new FileOutputStream(file);
            System.out.println("input interval:");
            char first = in.next().charAt(0);
            char second = in.next().charAt(0);
            if(first>second){
                throw new Exception("Incorrect interval");
            }
            ArrayList<Phone> resArr = chooseByNumb(first, second, phone);
            StringBuilder resultStr = new StringBuilder();
            if(resArr != null) {
                for (Phone iter : resArr) {
                    resultStr.append(iter.toString()).append("\n");
                }
            } else{
                resultStr.append("Numbers not found");
            }
            String result = resultStr.toString();
            byte[] textRes = result.getBytes();
            fos.write(textRes);
            fos.close();
        }
    }

    public static ArrayList<Phone> chooseByNumb(char first, char second, ArrayList<Phone> phone) {
        ArrayList<Phone> result = new ArrayList<>();
        for (Phone iter : phone) {
            if (iter.getOwnerName().toLowerCase(Locale.ROOT).charAt(0) >= first && iter.getOwnerName().toLowerCase(Locale.ROOT).charAt(0) <= second) {
                result.add(iter);
            }
        }
        return result;
    }
}
