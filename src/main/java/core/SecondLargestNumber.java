package core;

/**
 * Created by golagem on 10/9/17.
 */
public class SecondLargestNumber {

    public static void main(String... s){
        int[] a={2,2,1};
        int first=a[0];
        int second=0;
        for(int i=0;i<a.length;i++){
            if(first<a[i]){
                second=first;
                first=a[i];
            }
            else             {
                if(second<a[i] && a[i]<first){
                    second=a[i];
                }
            }
        }

        System.out.println(second);
    }
}
