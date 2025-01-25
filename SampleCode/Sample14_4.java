//例外とクラス
//Throwable クラスのサブクラスのオブジェクト
/*
Throwable クラスのサブクラスから拡張された、
ArrayIndexOutOfBoundsExceptionというクラスのオブジェクト。

catch(ArrayIndexOutOfBoundsException(例外のクラス) e(例外オブジェクトを受け取る変数))
*/
//例外の情報を出力する。

class Sample14_4
{
    public static void main(String[] args)
    {
        try{

            int[] test;
            test = new int[5];

            System.out.println("test[10]に値を代入します。");

            test[10] = 80;
            System.out.println("test[10]に80を代入しました。");
        }
        catch(ArrayIndexOutOfBoundsException e){

            System.out.println("配列の要素を超えています。");
            System.out.println(e + "という例外が発生しました。"); 
        }
        System.out.println("無事終了しました。");
    }
}