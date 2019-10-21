package pl.sdacademy.algorithms.basic;

public class WarmUp {
    public static void main(String[] args) {
//        int [] array = new int[10]; //to jest pusta tablica - pomieści 10 elementów (o indeksach od 0 do 9)
        int [] array2 = {10, 29, 34, 23, 435, 45, 56, 34, 54, 65}; //to jest już zainicjalizowana wartościami tablica, jej wielkość jest automatycznie obliczona - w tym przypadku ma też 10 elementów

//        String text = "Hello";
//        System.out.println(String.valueOf(text.toCharArray()));
//        System.out.println(String.format("Czy osoba jest dorosła? %b", isAdult(15)));
//        System.out.println(String.format("Jak masz na imię? %s A czy jest dorosły? %b bo ma lat %d", getMyName(), isAdult(29), getMyAge()));
        String formattedNumbers = printArray(array2);
        System.out.println(formattedNumbers);
    }

    public static String printArray(int [] array) {
        String result = "";
//        for (int i = array.length - 1; i >= 0; i--) iteracja od końca
        String delimiter = ",";
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (i == array.length - 1) {
                delimiter = "";
            }
            result = result + String.format("%d%s", num, delimiter);
        }
        result = "[" + result + "]";
        return result;
    }

    /*
        wiek := input("Podaj wiek")
        if wiek > 18 then
            print("Jesteś dorosły")
        else
            print("Nie jesteś dorosły")
        endif
     */

    public static boolean isAdult(int age) {
        boolean isAdult = false;
        if (age >= 18) {
            isAdult = true;
        }
        return isAdult;
    }

    public static boolean isAdult2(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isAdult3(int age) {
        return age >= 18;
    }

    public static String getMyName() {
        printName();
        return "Paweł";
    }

    public static int getMyAge() {
        return 29;
    }

    public static void printName() {
        System.out.println("Paweł");
        int ageOfPawel = getMyAge();
        if(ageOfPawel > 30) {
            return;
        }
        System.out.println("Kmiecik");
    }

}
