import java.util.HashSet;
public class LC_202{
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while (n != 1) {
            if (set.contains(n)) {
                return false; // cycle detected
            }
            set.add(n);

            n = getNext(n);
        }

        return true;
    }

    private int getNext(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    
    }
    public static void main(String[] args) {
        LC_202 obj=new LC_202();
        int n=19;
        System.out.println(obj.isHappy(n));
    }
    
}