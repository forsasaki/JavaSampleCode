//サブクラスのオブジェクトを作成すると、何も指定しなければスーパークラスの引数ナシのコンストラクタが呼び出される。
//ここでは、スーパークラスのコンストラクタを指定する場合を考える。
// 車クラス
class Car
{
    private int num;
    private double gas;

    public Car()
    {
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました。");
    }
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

//レーシングカークラス
class RacingCar extends Car
{
    private int course;
    public RacingCar()
    {
        course = 0;
        System.out.println("レーシングカーを作成しました。");
    }
    public RacingCar(int n, double g, int c)
    {
        super(n,g);
        course = c;
        System.out.println("コース番号" + course + "のレーシングカーを作成しました。");
    }
    public void setCourse(int c)
    {
        course = c;
        System.out.println("コース番号を" + course + "にしました。");
    }
}

class Sample11_2
{
    public static void main(String[] args)
    {
        RacingCar rccar1 = new RacingCar(1234, 20.5, 5);
    }
}

//this(): Call the different constructor in the class.
//super(): Call the constructor of super class.