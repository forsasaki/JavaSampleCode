//文字を検索する。
import java.io.*;

class Sample10_3
{
    public static void main(String [] args)throws IOException
    {
        System.out.println("文字列を入力してください。");

        BufferedReader br =
         new BufferedReader(new InputStreamReader(System.in, "Shift-JIS"));

        String str1 = br.readLine();    //BufferedReaderクラスのインスタンスメソッド

        System.out.println("検索文字列を入力してください。");

        String str2 = br.readLine();
        char ch = str2.charAt(0);

        int num = str1.indexOf(ch);     //文字chの位置を返す。

        if(num != -1)
            System.out.println(str1 + "の" + (num + 1) + "番目に「" + ch + "」が見つかりました。");
        else
            System.out.println(str1 + "に「" + ch + "」はありません。" );

    }
}