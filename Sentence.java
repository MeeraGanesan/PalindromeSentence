import java.util.*;
public class Sentence
{
    public String sentence;
    public int numWords;
    public Sentence(String str)
    {
        sentence=str;
        
    }
    public int getNumWords()
    {
        return numWords;
    }
    public String getSentence()
    {
        return sentence;
    }
    public String removeBlanks(String str)
    {
        String s="";
        int i=0;
        while (i<str.length())
        {
            char ch=str.charAt(i);
            if (ch!=' ')
            {
               s=s+ch;
               i++;
            }
            else
            {
                i++;
            }
        }
        return s;
    }
    public String toLowerCase(String str)
    {
        String s="";
        for (int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            s=s+Character.toLowerCase(ch);
        }
        return s;
    }
    public String removePunctuation(String s)
    {
        String s2="";
        for (int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if (Character.isLetter(ch)==true)
            {
                s2+=ch;
            }
        }
        return s2;
    }
    public boolean isPalindrome()
    {
        String temp=removeBlanks(sentence);
        temp=removePunctuation(temp);
        temp=toLowerCase(temp);;
        return isPalindrome(temp,0,temp.length()-1);
    }
    public boolean isPalindrome(String s,int start,int end)
    {
        if (start>=end)
        return true;
        else
        {
            String first=s.substring(start,start+1);
            String last=s.substring(end,end+1);
            if(first.equals(last))
            return isPalindrome(s,start+1,end-1);
            else
            return false;
        }
    }
}

