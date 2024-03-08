package DesignPattern.HLD.UrlShortner;

import java.util.HashMap;

public class UrlShortner {
    public static HashMap<String, Integer> ltos = new HashMap<String, Integer>();
    public static HashMap<Integer, String> stol=new HashMap<Integer, String>();
    public static void main(String args[]) {
        String longUrl = "https://www.reddit.com/r/SiegeAcademy/comments/7m0ds7/how_to_quick_peek/";
        String shorturl = convertLongToShort(longUrl ,true );
        System.out.println("shorturl = " + shorturl);

        String longUrl2 = convertLongToShort(shorturl ,false );
        System.out.println("longUrl = " + longUrl2);
    }

    private static String convertLongToShort(String basicUrl, boolean longToShort) {

        int COUNTER=1000000000;
        String url="";
        if(longToShort) {
            url = base10ToBase62(COUNTER);
            ltos.put(basicUrl, COUNTER);
            stol.put(COUNTER, basicUrl);
            System.out.println("stol = "+stol);
            COUNTER++;
            return "http://tiny.url/" + url;

        } else {
            basicUrl = basicUrl.substring("http://tiny.url/".length());
            System.out.println("basicUrl = " + basicUrl);
            int n = base62ToBase10(basicUrl);
            return stol.get(n);
        }
    }

    private static int base62ToBase10(String url) {
        int n = 0;
        for (int i = 0; i < url.length(); i++) {
            n = n * 62 + convert(url.charAt(i));
        }
        System.out.println("n = "+n);
        return n;
    }
    public static int convert(char c) {
        if (c >= '0' && c <= '9')
            return c - '0';
        if (c >= 'a' && c <= 'z') {
            return c - 'a' + 10;
        }
        if (c >= 'A' && c <= 'Z') {
            return c - 'A' + 36;
        }
        return -1;
    }

    private static String base10ToBase62(int counter) {
        String elements="0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        while(counter!=0){
            sb.insert(0,elements.charAt(counter%62));
            counter /= 62;
        }
        while (sb.length() != 7) {
            sb.insert(0, '0');
        }
        return sb.toString();
    }
}
