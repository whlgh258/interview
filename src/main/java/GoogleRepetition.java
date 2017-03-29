/**
 * Created by wanghl on 17-3-28.
 */
public class GoogleRepetition {

    public static void main(String[] args) {
        int[] a = {2, 5, 3, 4, 2, 1};
        int result = 0;
        for(int i = 0; i < a.length; i++){
            while(i != a[i]){
                if(a[i] == a[a[i]]){
                    System.out.println(a[i]);
                    break;
                }
                else {
                    swap(a, a[i], a[a[i]]);
                }
            }
        }
    }

    public static void swap(int[] a, int x, int y){
        int tmp = a[x];
        a[x] = a[y];
        a[y] = tmp;
    }
}
