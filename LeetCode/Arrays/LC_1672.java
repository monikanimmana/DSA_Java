package Arrays;
import java.util.*;

public class LC_1672 {

    public void RichestCustomer(List<List<Integer>> listarray) {

        int greater = 0;
        int rows = listarray.size();
        int col = listarray.get(0).size();

        for (int i = 0; i < rows; i++) {
            int result = 0;

            for (int j = 0; j < col; j++) {
                result += listarray.get(i).get(j);
            }

            if (result > greater) {
                greater = result;
            }
        }

        System.out.println(greater);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LC_1672 obj = new LC_1672();

        List<List<Integer>> listarray = new ArrayList<>();

        while (true) {
            String str = sc.nextLine();

            if (str.isEmpty()) {
                break;
            }

            List<Integer> row = new ArrayList<>();
            String[] parts = str.split(" ");

            for (String p : parts) {
                row.add(Integer.parseInt(p));
            }

            listarray.add(row);
            System.out.println(listarray);
        }

        obj.RichestCustomer(listarray);
    }
}
