package Arrays_Strings;

public class CheckRotation {
    public boolean checkRotate(String rotated, String checker){
        String temp = rotated + rotated;
        if (temp.contains(checker)){
            return true;
        }
        else
            return false;
    }
}
