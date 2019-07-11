package Arrays_Strings;

public class Main {
    public static void main(String[] args) {
        System.out.println("This package contains java implementations for common arrays and strings related problems.");
        String[] arrStr = {"abc","cde","def","abc","def"};
        PrintDuplicate obj = new PrintDuplicate();
        obj.printDuplicate_Array(arrStr);
    }

}
