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
        System.out.println("String Rotation should be true: " + rotation.checkRotate("7765121109","1211097765"));

        //String Permutation
        Permutation permutation = new Permutation();
        System.out.println("Permutation of string should be false: "+permutation.isPermutation("abcdef", "adfeba"));

        //Replace String
        ReplaceSpaces replaceSpaces = new ReplaceSpaces();
        String replace = "abc a cc a";
        System.out.println(replaceSpaces.replaceString(replace));

        //Shuffle Cards
        DeckofCards deckofCards = new DeckofCards();
        deckofCards.shuffle();


        Stack_Impl<Integer> stack_ = new Stack_Impl<>();
        stack_.push(1);
        stack_.push(2);
        stack_.push(3);
        stack_.push(4);
        System.out.println(stack_.getHead());
        stack_.pop();
        stack_.pop();
        System.out.println(stack_.getLength());
        System.out.println(stack_.getHead());
        stack_.pop();
        stack_.push(3);
        System.out.println(stack_.getLength());
        System.out.println(stack_.getHead());


    }

}
