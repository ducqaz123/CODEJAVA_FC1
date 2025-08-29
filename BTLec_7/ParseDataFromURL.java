
package BTLec_7;

import java.util.Scanner;

public class ParseDataFromURL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int pos = s.indexOf("://");
        String protocol = s.substring(0,pos);
        System.out.println("protocol: "+protocol);
        int pos2 = s.indexOf("/",pos+3);
        String domain = s.substring(pos+3,pos2);
        System.out.println("Domain: "+domain);
        String path = s.substring(pos2);
        System.out.println("Path: "+ path);
    }
}
