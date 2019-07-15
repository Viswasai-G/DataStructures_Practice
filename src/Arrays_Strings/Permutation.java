package Arrays_Strings;

public class Permutation {
    public boolean isPermutation(String inp1, String inp2){
        boolean result = false;
        if(inp1.length()!= inp2.length()){
            result = false;
        }
        else{
            int[] count1 = new int[103];
            int[] count2 = new int[103];
            for(int i = 0; i <inp1.length();i++){
                count1[inp1.charAt(i)]++;
                count2[inp2.charAt(i)]++;
            }
            for(int i = 0; i<count1.length; i++){
               if(count1[i] == count2[i]){ result = true;}
               else{ result = false;
               break;
               }
            }
        }
        return result;
    }
}
