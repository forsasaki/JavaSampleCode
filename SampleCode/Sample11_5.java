//スーパークラスの変数を使ってサブクラスのオブジェクトを定義する。

class Sample11_5
{
    public static void main(String[] args)
    {
        Car car1;
        car1 = new RacingCar();
        //setCourse は機能するのか？⇒しない。
        car1.setCar(1234, 20.5);
        car1.show();
    }
}

//show()メソッドをcallすると、コース番号まで出力されるが、変数の型がCarクラスであるため、numとgasしか引数として指定することはできない。
//しかし、RacingCar();オブジェクトではあるため、コース番号0の初期値が与えられる。//スーパークラスの変数を使ってサブクラスのオブジェクトを定義する。

class Sample11_5
{
    public static void main(String[] args)
    {
        Car car1;
        car1 = new RacingCar();
        //setCourse は機能するのか？
        car1.setCar(1234, 20.5);

        car1.show();
    }
}