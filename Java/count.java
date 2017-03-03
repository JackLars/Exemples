import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 * Created by akash on 07/02/2017.
 */
public class count {

    public static void main(String[] args) throws Exception {
        int n = 0;
        int l = 0;
        int c = 0;

        System.out.println("Enter number of lines!");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int nbl = Integer.parseInt(reader.readLine());

        System.out.println("Enter number of columns!");
        int nbc = Integer.parseInt(reader.readLine());

        while (l <= nbl && c <= nbc) {
            for (int i = l; i < nbl; i++) {
                for (int j = c; j < nbc; j++) {
                    n++;
                }
            }
            l++;
            c++;
        }
        System.out.println(n);
    }
}
