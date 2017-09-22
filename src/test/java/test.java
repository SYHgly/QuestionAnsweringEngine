import java.io.*;

/**
 * Created by hzlidandan1 on 2017/9/22.
 */
public class test {
    public static void main(String args[]) {
        Object input = test.class.getResource("qadict/qadict");
        String path = test.class.getResource("qadict/qadict").getPath();
        System.out.println(input);
        System.out.println(path);
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(test.class.getResourceAsStream("qadict/qadict")));
            // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(path))));
            String line = null;
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
