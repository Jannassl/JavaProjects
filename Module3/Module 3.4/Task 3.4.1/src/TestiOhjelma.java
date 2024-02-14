import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class TestiOhjelma {
    public static void main(String[] args) {
        ArrayList<Float> luvut = new ArrayList<>();


        String [] data = ReadColumn(1, "https://users.metropolia.fi/~jarkkov/temploki.csv",";");
        for(int i = 1; i<data.length; i++){
            System.out.println(data[i]);

        }

    }
    public static String[] ReadColumn(int col, String website, String delimeter){
        URL myUrl;

        try {
            myUrl = new URL(website);
        } catch (MalformedURLException e) {
            System.err.println(e);
            return null;
        }
        String data [];
        String currentLine;
        ArrayList<String> colData = new ArrayList<>();

        try {
            InputStream istream = myUrl.openStream();
            InputStreamReader istreamreader = new InputStreamReader(istream);
            BufferedReader reader = new BufferedReader(istreamreader);
            for (int i = 0; i < 145; i++){
                currentLine = reader.readLine();
                data = currentLine.split(delimeter);

                colData.add(data[1]);




            } // while((currentLine = reader.readLine()) != null)
        }catch (IOException e) {
            System.out.println(e);
            return null;
        }
        return colData.toArray(new String[0]);

    }
}
