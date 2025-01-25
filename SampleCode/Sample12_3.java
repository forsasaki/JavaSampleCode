//インターフェース
/*
interface iVehicle
{
    void show();
}
これを、インターフェースの宣言（declearation）という。
class の代わりにinterfaceを使う。
*/

/*
インターフェースのメンバには、修飾子を付けないが、
フィールド : public static final
メソッド : abstract
という修飾子が既に付いていることと同じ。
つまり、インターフェースの「フィールドは定数」で、「メソッドは抽象メソッド」となる。
インターフェースは、抽象クラスと同様に、オブジェクトを作成できない。
ただし、インターフェース型の変数、配列を宣言することはできる。
これも、抽象メソッドをオーバーライドしていく感覚と近い。
*/

/*
インターフェースを実装する
class Car implements iVehicle
{
    ・・・
}

このような（インターフェースを実装した）Carクラスのオブジェクトを作成するためには、
インターフェースのメソッドを全て定義する作業が必要になる。
これも、抽象メソッドをオーバライドするために各クラスで定義が必要になることと同様。
*/

//乗り物インターフェース
interface iVehicle
{
    void show();
}
//車クラス
class Car implements iVehicle
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
    }
}
//飛行機クラス
class Plane implements iVehicle
{
    private int flight;

    public Plane(int f)
    {
        flight = f;
        System.out.println("便" + flight + "です。");
    }
    public void show()
    {
        System.out.println("飛行機の便は" + flight + "です。");
    }
}

class Sample12_3
{
    public static void main(String[] args)
    {
        iVehicle[] ivc;
        ivc = new iVehicle[2];

        ivc[0] = new Car(1234, 20.5);

        ivc[1] = new Plane(232);

        for(int i=0; i<ivc.length; i++)
        {
            ivc[i].show();
        }
    }
}