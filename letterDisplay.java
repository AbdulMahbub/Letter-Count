import java.util.*;

public class letterDisplay {

    // Takes char and returns the index
    static int lCount(char x)
    {
        int num=(int)x;

        if(num>=65 && num<91)
            num-=65;
        else if(num>=97 && num <123)
            num-=97;
        else
            num=26; //Chars that arent letters

        return num;
    }



    public static void main(String[] args) {
        System.out.println("Enter a line of text");
        Scanner input= new Scanner(System.in);
        String word= input.nextLine();

        int alphabet[];
        alphabet = new int[27];

        for(int i = 0; i<word.length();i++)
        {
            alphabet[lCount(word.charAt(i))]++;
        }

        for(int j=0;j<26;j++)
        {
            if(alphabet[j]!=0)
            {
                int let= j+65;
                System.out.println((char)let + " "+ alphabet[j]);
            }
        }

        while(true)
        {
            System.out.println("Enter another line? ('y' = yes, 'n' = no)");
            Scanner input2=new Scanner(System.in);
            String choice= input.nextLine();

            if(choice.charAt(0) =='n')
                break;

            else
            {
                System.out.println("Enter a line of text");
                input= new Scanner(System.in);
                word= input.nextLine();

                alphabet= new int[27];

                for(int i = 0; i<word.length();i++)
                {
                    alphabet[lCount(word.charAt(i))]++;
                }

                for(int j=0;j<26;j++)
                {
                    if(alphabet[j]!=0)
                    {
                        int let= j+65;
                        System.out.println((char)let + " "+ alphabet[j]);
                    }
                }
            }

        }

    }
}
