//文字列を追加する. StringBufferクラス。
import java.io.*;
class Sample10_4
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("文字列を入力してください。") ;

        BufferedReader br =
         new BufferedReader(new InputStreamReader(System.in, "Shift-JIS"));
        
        String str1 = br.readLine();

        System.out.println("追加する文字列を入力してください。");

        String str2 = br.readLine();

        StringBuffer sb = new StringBuffer(str1);      //StringBufferクラスのオブジェクトsbは引数としてstr1を持つ。
        sb.append(str2);                               //sbに関するStirngBufferのインスタンスメソッドappendは引数としてstr2を持つ。

        System.out.println(str1 + "に" + str2 + "を追加すると、" + sb + "です。");
    }
}