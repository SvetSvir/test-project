import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String[] list = new String[10];
            for (int i = 0; i < 8; i++)
            {
                list[i] = reader.readLine();

            }
            for (int j = list.length - 1; j >= 0; j--) {
                System.out.println(list[j]);
            }

    }
}