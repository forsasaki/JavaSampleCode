//インスタンス変数（メソッド）と同様に、クラス変数（メソッド）が存在する。インスタンス変数がオブジェクトに関連付けられている変数であるのに対して、クラス変数はクラスに関連付けられている変数。
//車クラス
class Car
{
    public static int sum = 0;

    private int num;
    private double gas;

    public Car()
    {
        num = 0;
        gas =0.0;
        sum++;          //オブジェクトが作成されてコンストラクタが作動する度にsumがインクリメントされる。
        System.out.println("車を作成しました。");
    }
    public void setCar(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
    }
    public static void showSum()        //クラスメソッド。オブジェクトが作成されていなくても呼び出すことができる。
    {
        System.out.println("車は全部で" + sum + "台あります。");
    }
    public void show()
    {
        System.out.println("車のナンバーは" + num + "です。");
        System.out.println("ガソリン量は" + gas + "です。");
    }
}

class Sample9_8
{
    public static void main(String[] args)
    {
        Car.showSum();

        Car car1 = new Car();
        car1.setCar(1234, 20.5);

        Car.showSum();

        Car car2 = new Car();
        car2.setCar(4567, 30.5);

        Car.showSum();
    }
}

//showSum()はオブジェクトに関連付けられていないことを確認する。
//クラスメソッドはオブジェクトに関連付けられていないので、インスタンス変数のようにthis.variableの形で参照することはできない。
//クラスメソッド内ではインスタンス変数にアクセスできない。

//インスタンス変数とクラス変数は、ローカル変数とは違い、メソッドが呼び出される度に初期化されることは無い。なぜなら、それぞれオブジェクトとクラスに関連付けられて値が格納されるからだ。