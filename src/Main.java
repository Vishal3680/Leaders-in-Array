import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int  arr[] = {5,12,6,2,1,7};
        int n = arr.length;
        List<Integer> result = new ArrayList<>();
        int leader = arr[n-1];
        result.add(arr[n-1]);
        for(int i = n -2 ; i >= 0 ; i--){
            if(arr[i] >= leader){
                result.add(arr[i]);
                leader = arr[i];
            }


        }
        Collections.reverse(result);
        for(Integer j : result){
            System.out.println(j);
        }



    }
}
