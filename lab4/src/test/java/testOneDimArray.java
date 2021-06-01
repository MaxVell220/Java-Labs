import org.testng.annotations.Test;
import lab4.taskA.taskClasses.OneDimensionalArray;

import static org.testng.Assert.assertEquals;

public class testOneDimArray {
    private OneDimensionalArray copy(int[] mass) throws Exception {
        OneDimensionalArray arr = new OneDimensionalArray(mass.length);
        try {
            for (int i = 0; i < mass.length; i++) {
                arr.addElem(mass[i], i);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return arr;
    }

    @Test
    public void checkAddNumber1() throws Exception {
        System.out.println("\n\nПроверка на контрольных значениях сложения:");
        int[] testMass = {1, 4, 6, 0, -2};
        int[] addingMass = {23, 5, 66, -2, 0};
        int[] correct = {24, 9, 72, -2, -2};
        OneDimensionalArray test;
        test = copy(testMass);
        System.out.print("Первый массив: ");
        test.show();
        OneDimensionalArray adding;
        adding = copy(addingMass);
        System.out.print("Второй массив: ");
        adding.show();
        OneDimensionalArray result;
        result = test.addNumber(adding);
        System.out.print("Результат метода: ");
        result.show();
        System.out.print("Контрольный результат: ");
        for (int iter : correct) {
            System.out.print(iter + " ");
        }
        for (int i = 0; i < result.getSize(); i++) {
            assertEquals(correct[i], result.getNumb(i));
        }
    }

    @Test
    public void checkAddNumber2() {
        try {
            System.out.println("\n\nПроверка со случайными данными сложения:");
            int size = (int) (Math.random() * 30) + 5;
            OneDimensionalArray arrayFirst = new OneDimensionalArray(size);
            OneDimensionalArray arraySecond = new OneDimensionalArray(size);
            OneDimensionalArray result;
            for (int i = 0; i < size; i++) {
                arrayFirst.addElem((int) (Math.random() * 250) - 500, i);
                arraySecond.addElem((int) (Math.random() * 250) - 500, i);
            }
            System.out.print("Первый массив: ");
            arrayFirst.show();
            System.out.print("Второй массив: ");
            arraySecond.show();
            result = arrayFirst.addNumber(arraySecond);
            System.out.print("Результат метода: ");
            result.show();
            for (int i = 0; i < size; i++) {
                assertEquals(result.getNumb(i), arrayFirst.getNumb(i) + arraySecond.getNumb(i));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void checkSubtractNumber1() throws Exception {
        System.out.println("\n\nПроверка на контрольных значениях вычитания:");
        int[] testMass = {1, 4, 6, 0, -2};
        int[] addingMass = {23, 5, 66, -2, 0};
        int[] correct = {-22, -1, -60, 2, -2};
        OneDimensionalArray test;
        test = copy(testMass);
        System.out.print("Первый массив: ");
        test.show();
        OneDimensionalArray adding;
        adding = copy(addingMass);
        System.out.print("Второй массив: ");
        adding.show();
        OneDimensionalArray result;
        result = test.subtractNumber(adding);
        System.out.print("Результат метода: ");
        result.show();
        System.out.print("Контрольный результат: ");
        for (int iter : correct) {
            System.out.print(iter + " ");
        }
        for (int i = 0; i < result.getSize(); i++) {
            assertEquals(correct[i], result.getNumb(i));
        }
    }

    @Test
    public void checkSubtractNumber2() {
        try {
            System.out.println("\n\nПроверка со случайными данными вычитания:");
            int size = (int) (Math.random() * 30) + 5;
            OneDimensionalArray arrayFirst = new OneDimensionalArray(size);
            OneDimensionalArray arraySecond = new OneDimensionalArray(size);
            OneDimensionalArray result;
            for (int i = 0; i < size; i++) {
                arrayFirst.addElem((int) (Math.random() * 250) - 500, i);
                arraySecond.addElem((int) (Math.random() * 250) - 500, i);
            }
            System.out.print("Первый массив: ");
            arrayFirst.show();
            System.out.print("Второй массив: ");
            arraySecond.show();
            result = arrayFirst.subtractNumber(arraySecond);
            System.out.print("Результат метода: ");
            result.show();
            for (int i = 0; i < size; i++) {
                assertEquals(result.getNumb(i), arrayFirst.getNumb(i) - arraySecond.getNumb(i));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void checkMultiplyNumber1() throws Exception {
        System.out.println("\n\nПроверка на контрольных значениях умножения:");
        int[] testMass = {1, 4, 6, 0, -2};
        int[] addingMass = {23, 5, 66, -2, 0};
        int[] correct = {23, 20, 396, 0, 0};
        OneDimensionalArray test;
        test = copy(testMass);
        System.out.print("Первый массив: ");
        test.show();
        OneDimensionalArray adding;
        adding = copy(addingMass);
        System.out.print("Второй массив: ");
        adding.show();
        OneDimensionalArray result;
        result = test.multiplyNumber(adding);
        System.out.print("Результат метода: ");
        result.show();
        System.out.print("Контрольный результат: ");
        for (int iter : correct) {
            System.out.print(iter + " ");
        }
        for (int i = 0; i < result.getSize(); i++) {
            assertEquals(correct[i], result.getNumb(i));
        }
    }

    @Test
    public void checkMultiplyNumber2() {
        try {
            System.out.println("\n\nПроверка со случайными данными умножения:");
            int size = (int) (Math.random() * 30) + 5;
            OneDimensionalArray arrayFirst = new OneDimensionalArray(size);
            OneDimensionalArray arraySecond = new OneDimensionalArray(size);
            OneDimensionalArray result;
            for (int i = 0; i < size; i++) {
                arrayFirst.addElem((int) (Math.random() * 250) - 500, i);
                arraySecond.addElem((int) (Math.random() * 250) - 500, i);
            }
            System.out.print("Первый массив: ");
            arrayFirst.show();
            System.out.print("Второй массив: ");
            arraySecond.show();
            result = arrayFirst.multiplyNumber(arraySecond);
            System.out.print("Результат метода: ");
            result.show();
            for (int i = 0; i < size; i++) {
                assertEquals(result.getNumb(i), arrayFirst.getNumb(i) * arraySecond.getNumb(i));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void checkShow() {
        try {
            OneDimensionalArray arrayFirst = new OneDimensionalArray(5);
            for (int i = 0; i < 5; i++) {
                arrayFirst.addElem((int) (Math.random() * 250) - 500, i);
            }
            String result = "";
            for (int i = 0; i < 5; i++) {
                result += arrayFirst.getNumb(i) + " ";
            }
            assertEquals(arrayFirst.show(), result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
