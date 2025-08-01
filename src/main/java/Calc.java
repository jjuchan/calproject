import java.util.StringTokenizer;

public class Calc {


    public static int run(String expression) {

        StringTokenizer st = new StringTokenizer(expression);

        int a = Integer.parseInt(st.nextToken());
        String b = st.nextToken();
        int c = Integer.parseInt(st.nextToken());

        if (b.equals("+")) {
            return a + c;
        }

        return -1;
    }
}
