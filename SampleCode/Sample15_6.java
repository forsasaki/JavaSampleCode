//複数クラスから多重継承できない⇒Threadクラス以外から拡張したい時にどうするか。
//Runnableインターフェースを使用する。インターフェイスは、完全な抽象クラスの性質を持つ。
//Threadを起動するには、①「Threadクラスを拡張する」②「Runnableインターフェイスを実装する」の二つがある。

class Car implements Runnable
{
    private String name;

    public Car(String nm)
    {
        name = nm;
    }
    public void run()
    {
        for(int i=0; i<5; i++)
        {
            System.out.println(name + "の処理をしています。");
        }
    }
}

class Sample15_6
{
    public static void main(String[] args)
    {
        Car car1 = new Car("1号車");
        Thread th1 = new Thread(car1);
        th1.start();

        for(int i=0; i<5; i++)
        {
            System.out.println("main()の処理をしています。");
        }
    }
}