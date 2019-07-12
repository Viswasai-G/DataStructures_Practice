package Arrays_Strings;


import java.util.HashMap;
import java.util.stream.Stream;

public class PrintDuplicate {

    public <T> void printDuplicate_Generic(T[] input){
        HashMap<T, Integer> inputMap = new HashMap<>();
        for(T iter:input){
            if(inputMap.containsKey(iter)){
                inputMap.replace(iter, inputMap.get(iter)+1);
            }
            else{
                inputMap.put(iter, 1);
            }
        }
        for(T key:inputMap.keySet()){
            if(inputMap.get(key)>1){
                System.out.println("Duplicate element: "+key+" repeated:"+inputMap.get(key)+" times");
            }
        }
    }

    //Alternate
    public <T> void printDuplicate_Stream(T[] input){
        HashMap<T, Integer> inputMap = new HashMap<>();
        Stream.of(input).forEach(i -> {
            if(inputMap.containsKey(i)) { inputMap.replace(i, inputMap.get(i)+1); } else inputMap.put(i, 1);});

        for(T key:inputMap.keySet()){
            if(inputMap.get(key)>1){
                System.out.println("Duplicate element: "+key+" repeated:"+inputMap.get(key)+" times");
            }
        }
    }
}
