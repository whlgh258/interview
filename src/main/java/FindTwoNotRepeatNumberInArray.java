/**
 * Created by wanghl on 17-3-29.
 */
public class FindTwoNotRepeatNumberInArray {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 1, 2, 3, 4, 102, 378};

        int result  = 0;
        for(int i = 0; i < a.length; i++){
            result ^= a[i];
        }

        System.out.println(result);

        int p = 0;
        for(int i = 0; i < 32; i++){
            int k = (result >> i) & 1;
            if( k == 1){
                p = i;
                break;
            }
        }

        System.out.println(p);

        int b = 0;
        int c = 0;

        for(int i = 0; i < a.length; i++){
            if(((a[i] >> p) & 1) == 1){
                b ^= a[i];
            }
            else c ^= a[i];
        }

        System.out.println(b);
        System.out.println(c);
    }
}
