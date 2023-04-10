import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bee2783 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int irrelevant = sc.nextInt();
        int nSize = sc.nextInt();
        int mSize = sc.nextInt();
        int[] nArray = new int[nSize];
        for (int i = 0; i < nSize; i++) {
            nArray[i] = sc.nextInt();
        }
        int[] mArray = new int[mSize];
        for (int i = 0; i < mSize; i++) {
            mArray[i] = sc.nextInt();
        }
        Set<Integer> mSet = new HashSet<>();
        for (int num : mArray) {
            mSet.add(num);
        }
        int count = 0;
        for (int num : nArray) {
            if (mSet.contains(num)) {
                count++;
            }
        }
        System.out.println(nSize-count);
        sc.close();
    }
}