import java.io.*;
import java.net.*;
public class TestiOhjelma {
    public static void main(String[] args) {
        URL myUrl;
        try {
            myUrl = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
        }catch (MalformedURLException e){
            System.err.println(e);
            return;
        }
        try {
            InputStream isStream = myUrl.openStream();
            InputStreamReader istreamreader = new InputStreamReader(isStream);

            BufferedReader reader = new BufferedReader(istreamreader);

            String line;
            StringBuilder response = new StringBuilder();
            while((line=reader.readLine()) != null){
                response.append(line);
            }
            reader.close();
            System.out.println(response.toString());
        } catch (IOException e){
            System.err.println(e);
        }
    }

}
