import java.math.BigInteger;
import java.util.BitSet;

/**
 * Created by wanghl on 17-4-2.
 */
public class BitSetTest {

    public static void main(String[] args) {
        BitSet bs = new BitSet(32);
        System.out.println(bs.length());

        for(int i = 0; i < 1000; i++){
            bs.set(i, true);
        }

        System.out.println(bs.length());

        System.out.println(bs.get(10001));

        Integer integer = new Integer(56);
        System.out.println(integer.bitCount(30));

        BigInteger bi = new BigInteger("56");
        System.out.println(bi.toString(2));
    }
}
