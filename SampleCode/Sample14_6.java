//入出力の基本.Streamを理解する。
import java.io.*;

class Sample14_6
{
    public static void main(String[] args)
    {
        System.out.println("文字列を入力してください。");

        try{
            BufferedReader br =
             new BufferedReader //Bufferを介して読み込むようにする。
              (new InputStreamReader(System.in, "Shift-JIS"));
              //標準入力を指定して文字ストリームを作成する。

            String str = br.readLine();
            System.out.println(str + "が入力されました。");
        }
        catch(IOException e){
            System.out.println("入出力エラーです。");
        }
    }
}

//System.out⇒標準出力
//System.in ⇒標準入力
/*
1.System.in(標準入力)からInputStreamReaderクラスのオブジェクトを作成する.
2.1.からBufferedReaderクラスのオブジェクトを作成する.
3.2.のreadLine()メソッドを使って1行データを読み込む.

InputStreamReaderクラス⇒文字ストリーム
BufferedReaderクラス⇒バッファを介して読み込むためのストリーム
*/