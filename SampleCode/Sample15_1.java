//スレッドを理解する
/*
処理フロー一つを「スレッド（Thread）」という。
コード上でフローを増やすことを、「スレッドを起動する」という。
ここでは、複数のスレッドを起動するプログラムを作る
*/
/*
class Car extends Thred //クラスライブラリのTreadクラス（java.langパッケージ）を拡張する
{
    public void run()
    {
        別のスレッドで行いたい処理;
        ・・・
    }
}

Threadクラスを拡張したクラスには、その中にrun()メソッドを定義することが必要。
*/

class Car extends Thread
{
    private String name;

    public Car(String nm)
    {
        name  = nm;
    }
    public void run()
    {
        for(int i=0; i<5; i++)
        {
        System.out.println(name + "の処理をしています。");
        }
    }
}

class Sample15_1
{
    public static void main(String[] args)
    {
        Car car1 = new Car("1号車");
        car1.start();       //スレッドを起動
        
        for(int i=0; i<5; i++)
        {
            System.out.println("main()の処理をしています。");
        }
    }
}

//Threadクラスを拡張し、run()メソッドを定義してスレッドを扱う準備をする。
//start()メソッドの呼び出しでスレッドが起動する。
