import java .util.*;
class Roman_num
{
    static int convo(String s)
    {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='I')
            {
                if(i+1<s.length())
                {
                    if(s.charAt(i+1)=='V')
                    {
                        sum=sum+4;
                        ++i;
                    }
                    else if(s.charAt(i+1)=='X')
                    {
                        sum+=9;
                        ++i;
                    }
                    else if(s.charAt(i+1)=='I')
                    {
                        if(i+2<s.length())
                        {
                            if(s.charAt(i+2)=='I')
                            {
                                sum+=3;
                                i+=2;
                            }
                            else
                            {
                                sum+=2;
                                ++i;
                            }
                        }
                        else
                        {
                            sum+=2;
                            ++i;
                        }
                    }
                    else
                    {
                        sum+=1;
                    }
                }
                    else
                    {
                        sum+=1;
                    }
            }
            else if(ch=='V')
            {
                sum+=5;
            }
            else if(ch=='X')
            {
                if(i+1<s.length())
                {
                    if(s.charAt(i+1)=='L')
                    {
                        sum+=40;
                        ++i;
                    }
                    else if(s.charAt(i+1)=='C')
                    {
                        sum+=90;
                        ++i;
                    }
                    else
                    {
                        sum+=10;
                    }
                }
                else
                {
                    sum+=10;
                }
            }
            else if(ch=='C')
            {
                if(i+1<s.length())
                {
                    if(s.charAt(i+1)=='D')
                    {
                        sum+=400;
                        ++i;
                    }
                    else if(s.charAt(i+1)=='M')
                    {
                        sum+=900;
                        ++i;
                    }
                    else
                    {
                        sum+=100;
                    }
                }
                else
                {
                    sum+=100;
                }
            }
            else if(ch=='D')
            {
                sum+=500;
            }
            else if(ch=='M')
            {
                sum+=1000;
            }
            else
            {
                return -1;
            }
        }
        return  sum;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the romans=");
        String s=sc.next();
        System.out.printf("Romans to Integer =%d %n",convo(s));
    }
}