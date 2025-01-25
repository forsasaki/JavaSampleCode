//スーパークラスの変数を使ってサブクラスのオブジェクトを定義する。

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