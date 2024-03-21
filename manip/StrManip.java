import java.util.*;
import java.util.Scanner;
class StrManip
{
public static void main(String[]args)
{
System.out.print("\n\tCREATE NEW STRING USING NEW");
char chs[]={'l','i','v','e',' ','w','i','t','h','o','u','t',' ','f','e','a','r'};
String newstr=new String(chs);
System.out.print("\n\nNew String from char[] using new :"+newstr);
byte ksb[]={65,66,67,68,69,70};
String newstr2=new String(ksb);
System.out.print("\n\nNew string of corresponding ascii value from ksb[] using new :"+newstr2);
String s1="good";
String s2="MORNING";
System.out.print("\n\n string 1 :"+s1);
System.out.print("\n string 2 :"+s2);
System.out.print("\n\n\n\nlength of string 'good' :"+s1.length());
System.out.print("\n\n"+s1+" to uppercase :"+s1.toUpperCase());
System.out.print("\n\n"+s2+" to lowercase :"+s2.toLowerCase());
System.out.print("\n\n--------CONCATENATION---------");
System.out.print("\n\nusing concat() :"+s1.concat(" "+s2));
System.out.print("\n\nusing '+' operator :"+s1+" "+s2);
System.out.print("\n\n=====CHARACTER EXTRACTION=====");
System.out.print("\n\ncharacter at 3rd position :"+s1.charAt(3));
char c[]=new char[50];
s1.getChars(2,4,c,0);
System.out.print("\n\ncharcater between 2 and 4 :"+new String(c));
System.out.print("\n\n!!!!CHARACTER COMPARISON-!!!!");
String x="welcome";
String y="WELCOME";
System.out.print("\n\n\nstring 1 :"+x);
System.out.print("\n|nstring 2 :"+y);
System.out.print("\n\n"+x+" equals "+y+" :"+x.equals(y));
System.out.print("\n\n"+x+" equals IgnoreCase "+y+" :"+x.equalsIgnoreCase(y));
System.out.print("\n\n"+x+" compare to "+y+" :"+x.compareTo(y));
System.out.print("\n\n"+x+" starts with w  :"+x.startsWith("w"));
System.out.print("\n\n-----SEARCH SUBSTRINGS----");
String z="cheer up doode,Good luck  :):):):):)";
System.out.print("\n\nstring  :"+z);
System.out.print("\n\nindex of 'luck' word  :"+z.indexOf("luck"));
System.out.print("\n\nsubstring :"+z.substring(16));
System.out.print("\n\n------STRING MODIFICATION-----");
System.out.print("\n\nreplace 'luck' to 'morning' :"+z.replace("luck","morning"));
System.out.print("\n\n------USING VALUE OF------");
float n=35.87f;
System.out.print("\n\n"+n+" is converted to string "+String.valueOf(n));
}
}
