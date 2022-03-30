import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.*;

public class Main {
    static Set<String> words = new HashSet<String>();
    static HashMap<String, Integer> map = new HashMap<String, Integer>();

    public static void main(String[] args) {
        String match = "RSTLN AEIOU";

        StringBuffer sb = new StringBuffer();

        try {
            URL path = Main.class.getResource("sample.txt");
            File myObj = new File(path.getFile());

            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                func(data);

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        String s = sb.toString();

        // loop thru map
        int max = 0;
        String mc="";
        for (Map.Entry<String,Integer> e : map.entrySet()){
            if (e.getValue() > max){
                max = e.getValue();
                mc =e.getKey();
            }
        }

        MostCommon mostCommon = new MostCommon(mc , max);

        Result result = new Result(words,mostCommon);
        //Result result = func(s);

        System.out.println(result);
    }

    // s is a text , need to get words
    public static void func(String s){
        if ( s.length() == 0)
            return;

        // remove line feeds
        s =s.replaceAll("\n", " ");
        s =s.replaceAll("\r", " ");
        s = s.replaceAll(",|\\.|;"," ");
        String [] wordslist =s.split("\\s+");

        for ( String w : wordslist){
            // remove any comma, dot, or ;
            w = w.replaceAll(",|\\.|;"," ");

            int cnotin = 0;
            Set<Character> chars = new HashSet<Character>();
            boolean bin = false;

            for ( int i = 0; i < w.length(); i++){
                char c = w.charAt(i);
                if (!chars.contains(c)){
                    chars.add(c);
                    bin = charin(c);
                    if ( !bin) cnotin++;
                }

             }
            // if only one char do not match add to list
             if (cnotin == 1 ){
                 words.add(w);
                 w=w.toLowerCase();
                if (map.get(w) == null){
                    map.put(w,1);
                }else {
                    map.put(w,map.get(w) + 1);
                }
             }
        }


        return ;
    }

    public static boolean charin(char c){
        String match = "RSTLNAEIOU";
        char cu = Character.toUpperCase(c);
        for( int i = 0; i < match.length(); i++) {
            if (cu == match.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
