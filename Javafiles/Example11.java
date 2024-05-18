import java.util.*;
class stringop{
    String text; int count;int s;
    stringop(String text, int length)
    {
        this.text=text;
        s=length;
        count=0;
    }


    int countWords()
    {
        int i=1;
        while(i<s)
        {
            if(text.charAt(i)==' ' && text.charAt(i-1)!=' ')
            {
                count++;
            }
            i++;
        }
        if(text.charAt(s-1)!=' ')
        {
            count++;
        }
        return count;
    }

    boolean findstring(String j)
    {
        int i=0; boolean ispresent=true;
        while(i<s)
        {
            if(text.charAt(i)==j.charAt(0))
            {
                int k=0;
                while(k<j.length())
                {
                    if(i+k<s && text.charAt(i+k)!=j.charAt(k))
                    {
                        ispresent=false;
                    }
                    k++;
                }
            }
            else
            {
                ispresent=false;
            }
            if(ispresent)
            {
                return true;
            }
            i++;
        }
        return false;
    }

    boolean checkpalindrome(String j)
    {
        int i=0; int len=j.length();
        while(i<len/2)
        {
            if(j.charAt(i)!=j.charAt(len-i-1))
            {
                return false;
            }
            i++;
        }
        return true;
    }
}


public class Example11 {
    public static void main(String args[])
    {
        String t="hello count my words";
        int s=t.length();
        stringop str=new stringop(t,s);
        System.out.println(str.countWords());
        System.out.println(str.findstring("hello count"));
        System.out.println(str.checkpalindrome("level"));
    }
}
