package Arrays_Strings;


import java.util.HashMap;

public class PrintDuplicate {
    public void printDuplicate_Array(String[] input){
        HashMap<String, Integer> inputMap = new HashMap<>();
        for(String iter:input){
            if(inputMap.containsKey(iter)){
                inputMap.replace(iter, inputMap.get(iter)+1);
            }
            else{
                inputMap.put(iter, 1);
            }
        }
        for(String key:inputMap.keySet()){
            if(inputMap.get(key)>1){
                System.out.println("Duplicate element: "+key+" repeated:"+inputMap.get(key)+" times");
            }
        }

    }
}
