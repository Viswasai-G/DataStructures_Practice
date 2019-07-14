package Arrays_Strings;

public class CheckRotation {
    public boolean checkRotate(String rotated, String checker) {
        String temp = rotated + rotated;
        boolean ans = temp.contains(checker) ? true : false ;
        return ans;
    }
}
