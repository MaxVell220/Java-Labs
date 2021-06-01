import exceptions.MainException;
import exceptions.NumberParseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class TaskC {
    public static void defiant() throws MainException, FileNotFoundException, ParseException {
        File file = new File("C:\\Users\\DELL\\Desktop\\ЛАБЫ ПРОГА\\lab4\\text-files-for-lab\\numbers.txt");
        Scanner in = new Scanner(file);
        int count = in.nextInt();
        ArrayList<Double> mass = new ArrayList<>();
        String locale;
        String numb;
        for (int i = 0; i < count; i++) {
            locale = in.next();
            numb = in.next();
            switch (locale) {
                case "en":
                    final NumberFormat format = NumberFormat.getInstance(Locale.ENGLISH);
                    final Number number = format.parse(numb);
                    String num = String.format(Locale.getDefault(), "%.3f", number);
                    if (isNumeric(num)) {
                        mass.add(Double.parseDouble(num));
                    } else {
                        throw new NumberParseException("Can't parse string from english locale");
                    }
                    break;
                case "de":
                    final NumberFormat format1 = NumberFormat.getInstance(Locale.GERMAN);
                    final Number number1 = format1.parse(numb);
                    String num1 = String.format(Locale.getDefault(), "%.3f", number1);
                    if (isNumeric(num1)) {
                        mass.add(Double.parseDouble(num1));
                    } else {
                        throw new NumberParseException("Can't parse string from german locale");
                    }
                    break;
                case "en_CA":
                    final NumberFormat format2 = NumberFormat.getInstance(Locale.CANADA);
                    final Number number2 = format2.parse(numb);
                    String num2 = String.format(Locale.getDefault(), "%.3f", number2);
                    if (isNumeric(num2)) {
                        mass.add(Double.parseDouble(num2));
                    } else {
                        throw new NumberParseException("Can't parse string from canada english locale");
                    }
                    break;
                case "fr_FR":
                    final NumberFormat format3 = NumberFormat.getInstance(Locale.FRANCE);
                    final Number number3 = format3.parse(numb);
                    String num3 = String.format(Locale.getDefault(), "%.3f", number3);
                    if (isNumeric(num3)) {
                        mass.add(Double.parseDouble(num3));
                    } else {
                        throw new NumberParseException("Can't parse string from france locale");
                    }
                    break;
                case "en_US":
                    final NumberFormat format4 = NumberFormat.getInstance(Locale.US);
                    final Number number4 = format4.parse(numb);
                    String num4 = String.format(Locale.getDefault(), "%.3f", number4);
                    if (isNumeric(num4)) {
                        mass.add(Double.parseDouble(num4));
                    } else {
                        throw new NumberParseException("Can't parse string from us locale");
                    }
                    break;
                case "en_GB":
                    final NumberFormat format5 = NumberFormat.getInstance(Locale.UK);
                    final Number number5 = format5.parse(numb);
                    String num5 = String.format(Locale.getDefault(), "%.3f", number5);
                    if (isNumeric(num5)) {
                        mass.add(Double.parseDouble(num5));
                    } else {

                        throw new NumberParseException("Can't parse string from uk locale");
                    }
                    break;
                case "it_IT":
                    final NumberFormat format6 = NumberFormat.getInstance(Locale.ITALIAN);
                    final Number number6 = format6.parse(numb);
                    String num6 = String.format(Locale.getDefault(), "%.3f", number6);
                    if (isNumeric(num6)) {
                        mass.add(Double.parseDouble(num6));
                    } else {
                        throw new NumberParseException("Can't parse string from italian locale");
                    }
                    break;
                case "zh_CN":
                    final NumberFormat format7 = NumberFormat.getInstance(Locale.CHINA);
                    final Number number7 = format7.parse(numb);
                    String num7 = String.format(Locale.getDefault(), "%.3f", number7);
                    if (isNumeric(num7)) {
                        mass.add(Double.parseDouble(num7));
                    } else {
                        throw new NumberParseException("Can't parse string from china locale");
                    }
                    break;
                default:
                    break;
            }
        }
        System.out.println("Sum of numbers: ");
        double sum = mass.stream().mapToDouble(a -> a).sum();
        System.out.println(sum);
        System.out.println("Average of numbers: ");
        System.out.println(sum / mass.size());
        in.close();
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
