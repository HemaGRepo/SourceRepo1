import java.io.IOException;
import java.util.Scanner;

//Substring removal from String using StringBuffer class
//Remove the substring "Bad" from "Good Bad Good Bad Good Bad"
public class SubstringRemoval {

	public static void main(String args[]) {
		
		String text = "Good Bad Good Bad Good Bad";
        String substr = "Bad";            
        StringBuffer strbuf = new StringBuffer(text);
        String op=null;
        System.out.println("Input :"+strbuf);
        
        //We are going to remove all "Bad" from strbuf
        strbuf.indexOf(substr);
        strbuf.lastIndexOf(substr);
        while (strbuf != null && strbuf.indexOf(substr) != -1) {
                strbuf.delete(strbuf.indexOf(substr), strbuf.indexOf(substr) + substr.length());
                op=strbuf.toString();

            }
        System.out.println("Output :"+op);
		
}
}
