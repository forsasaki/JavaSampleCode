//ファイルに出力する
import java.io.*;

class Sample14_7
{
    public static void main(String[] args)
    {
        try{
            PrintWriter pw = new PrintWriter
            (new BufferedWriter(new FileWriter("test1.txt")));

            pw.println("Hello!");
            pw.println("Goobye!");
            System.out.println("ファイルに書き込みました。");

            pw.close();
        }
        catch(IOException e){
            System.out.println("入出力エラーです。");
        }
    }
}

//ここで使われたクラスを理解する
/*
 FileWriter : ファイルに書き込むための文字ストリーム
 BufferedWriter : バッファを介して書き込むための文字ストリーム
 PrintWriterクラス : 1行書きだすための文字ストリーム

 ・ファイル名を指定してFileWriterクラスのオブジェクトを作成する
 ・BufferedWriterクラスのオブジェクトを作成する
 ・PrintWriterのオブジェクトを作成する
 ・Println()メソッドを使って1行書き出す
 ・close()メソッドを使ってファイルを閉じる
 */
