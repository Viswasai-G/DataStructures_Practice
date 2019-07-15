package Arrays_Strings;

public class Main {
    public static void main(String[] args) {
        System.out.println("This package contains java implementations for common arrays and strings related problems.");
        //Array Duplicates
        String[] arrStr = {"abc","cde","def","abc","def"};
        Integer[] arrInt = {1,2,3,4,5,2,4,7,2};
        PrintDuplicate obj = new PrintDuplicate();
        obj.printDuplicate_Generic(arrStr);
        obj.printDuplicate_Generic(arrInt);
        obj.printDuplicate_Stream(arrStr);
        obj.printDuplicate_Stream(arrInt);


        //String rotation
        CheckRotation rotation = new CheckRotation();
        System.out.println(rotation.checkRotate("7765121109","1211097765"));

        //String Permutation
        Permutation permutation = new Permutation();
        System.out.println(permutation.isPermutation("abcdef", "adfeba"));

    }

}
