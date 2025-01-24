//メソッドの引数の型の指定
// 車クラス
class Car
{
    int num;
    double gas;

    void setNum(int n)
    {
        num = n;
        System.out.println("ナンバーを" + num + "にしました。");
    }
    void setGas(double g)
    {
        gas = g;
        System.out.println("ガソリン量を" + gas + "にしました。");
    }
    void show()
    {
        System.out.println("車のナンバーは" + num + "です。");
        System.out.println("ガソリン量は" + gas + "です。");
    }
}

class Sample8_4
{
    public static void main(String[] args)
    {
        Car car1 = new Car();   //カークラス型の変数car1は、新しいCarオブジェクトである。

        int number = 1234;
        double gasoline = 20.5;

        car1.setNum(number);
        car1.setGas(gasoline);
    }
}

//メソッド定義時の引数は「仮引数」、メソッド使用時の引数は「実引数」と呼ぶ。
