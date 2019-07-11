package Arrays_Strings;

public class Main {
    public static void main(String[] args) {
        System.out.println("This package contains java implementations for common arrays and strings related problems.");
        //Array Duplicates
        String[] arrStr = {"abc","cde","def","abc","def"};
        int[] arrInt = {1,2,3,4,5,2,4,7,2};
        PrintDuplicate obj = new PrintDuplicate();
        obj.printDuplicate_Array(arrStr);
        obj.printDuplicate_Array(arrInt);

        //String rotation
        CheckRotation rotation = new CheckRotation();
        System.out.println(rotation.checkRotate("7765121109","1211097765"));
    }

}
