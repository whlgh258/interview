/**
 * Created by wanghl on 17-4-2.
 */
public class SearchRotateArray {
    public static int search(int a[], int l, int u, int x) {
        while(l<=u){
            int m = (l+u)/2;
            if(x==a[m]){
                return m;
            }
            else if(a[l]<=a[m]){ //左半部分升序排列
                if(x>a[m]){
                    l=m+1;
                }
                else if(x>=a[l]){
                    u=m-1;
                }
                else{// x<a[l]
                    l=m+1;
                }
            }
            else if(a[l]>a[m]){ //右半部分升序
                if(x>a[u]){
                    u=m-1;
                }
                else if(x>=a[m]){
                    l=m+1;
                }
                else{ //x<a[m]
                    u=m-1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int a[] = {15, 16 ,19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
        System.out.println(search(a, 0, a.length - 1, 7));
    }
}
