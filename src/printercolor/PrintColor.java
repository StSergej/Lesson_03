package printercolor;

public class PrintColor extends Printer{
    public static void main(String[] args) {

        Printer color = new PrintColor();
        Printer printer = new Printer();

        color.print("JAVA");
        color.print("Think ", "Different", "!");
        printer.print("Hello  ", "World!");
        printer.print("Just ", "do ", "it!");
    }
}
