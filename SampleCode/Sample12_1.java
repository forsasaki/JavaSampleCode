//インターフェース.その前に、抽象クラス
//抽象クラスは、オブジェクトを作成することができない。
//抽象クラスは、処理内容が記述されていないメソッドを持つ。
//抽象クラスのサブクラスでオブジェクトを作成できるようにするには、
//抽象クラスから継承した抽象メソッドの内容をサブクラスでオーバーライドする必要がある。

//抽象クラス内のメソッド全てが抽象メソッドである訳ではない。
//抽象クラスは「オブジェクトを作成できない」だけで、
//「サブクラスを作成することはできる」ので、
//継承したメンバのうち、abstractでないものはサブクラスで利用できる。

//抽象クラスのサブクラスは、メンバを完全に継承し、抽象メソッドを実装しなければ動作しない。
//オーバーライドが動作する条件は、同名のメソッドが各クラスで定義されていること。

//のりものクラス
abstract class Vehicle
{
    protected int speed;
    public void setSpeed(int s)
    {
        speed = s;
        System.out.println("速度を" + speed + "にしました。");
    }
    abstract void show();
}
//車クラス
class Car extends Vehicle
{
    private int num;
    private double gas;

    public Car(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
    }
    public void show()
    {
        System.out.println("車のナンバーは" + num + "です。");
        System.out.println("ガソリン量は" + gas + "です。");
        System.out.println("速度は" + speed + "です。");
    }
}
//飛行機クラス
class Plane extends Vehicle
{
    private int flight;

    public Plane(int f)
    {
        flight = f;
        System.out.println("便" + flight + "の飛行機を作成しました。");
    }
    public void show()
    {
        System.out.println("飛行機の便は" + flight + "です。");
        System.out.println("速度は" + speed + "です。");
    }
}

class Sample12_1
{
    public static void main(String[] args)
    {
        Vehicle[] vc;
        vc = new Vehicle[2];

        vc[0] = new Car(1234, 20.5);
        vc[0].setSpeed(60);

        vc[1] = new Plane(232);
        vc[1].setSpeed(500);

        for(int i=0; i<vc.length; i++)
        {
            vc[i].show();
        }
    }
}