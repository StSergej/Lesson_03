package printercolor;

public class Printer {

    final String RED = (char) 27 + "[31m";  //управляющие символы ANSI
    final String GREEN = (char) 27 + "[32m";
    final String YELLOE = (char) 27 + "[33m";
    final String BLUE = (char) 27 + "[34m";


    public void print(String value) {
        System.out.println(RED + value);
    }
    public void print(String value1, String value2) {
        System.out.println(BLUE + value1 + YELLOE + value2);
    }
    public void print(String value1, String value2, String value3){
        System.out.println(GREEN + value1 + BLUE + value2 + RED + value3);
    }
}
