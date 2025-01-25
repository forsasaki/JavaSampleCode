
class Sample14_1
{
    public static void main(String[] args)
    {
        int[] test;
        test = new int[5];
        System.out.println("test[10]に値を代入します。");

        test[10] = 80;
        System.out.println("test[10]に80を代入しました。");
        System.out.println("無事終了しました。");
    }
}
//ArrayIndexOutOfBoundsExceptionという例外が起きる。
//例外が起きた⇒throw
//例外を処理する
//例外処理(exception handling)を適切に行い、エラーに強いプログラムを書く。