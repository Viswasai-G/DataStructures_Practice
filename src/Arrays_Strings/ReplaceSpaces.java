package Arrays_Strings;


public class ReplaceSpaces {
    public String replaceString(String str){
        //In-built
//        String result = str.replace(' ', '%');
//        return result;


        //Using an array
        char[] string = str.toCharArray();
        for (int i = 0; i <string.length;i++){
            string[i] = str.charAt(i) != ' ' ? str.charAt(i):'%';
        }
        return new String(string);
    }
}
