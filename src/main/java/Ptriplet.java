import java.util.Arrays;
import java.util.Collections;

public class Ptriplet {

    public static void getTriplet(Integer[] arr){
        Collections.sort(Arrays.asList(arr));
        int i,j=1,k=arr.length-1;
        int l,m,n;
        String s = null;

        for(i=0;i<arr.length;i++){
            while (j<k){
                l = arr[i]*arr[i];
                m = arr[j]*arr[j];
                n = arr[k]*arr[k];

                if(l + m == n){
                    s = String.format("Triplet are: %d,%d,%d",arr[i],arr[j],arr[k]);
                    System.out.println(s);
                }else if(l+m>n){
                    k--;
                }else {
                    j++;
                }
            }
        }
    }

    public static void main(String...args){
        Integer[] arr = {1,9,3,7,2,8,13};
        getTriplet(arr);
    }
}
