//equalsメソッドを使う。
class Car
{
    protected int num;
    protected double gas;

    public Car()
    {
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました。");
    }
}

class Sample11_8
{
    public static void main(String[] args)
    {
        Car car1 = new Car();
        Car car2 = new Car();

        Car car3;
        car3 = car1;

        boolean bl1 = car1.equals(car2);
        boolean bl2 = car1.equals(car3);

        System.out.println("car1とcar2が同じか調べたところ、" + bl1 + "でした。");
        System.out.println("car1とcar3が同じか調べたところ、" + bl2 + "でした。");
    }
}

//全てのクラスはobjectクラスなので、equals()メソッドを記述しなくても、equals()メソッドを使用することができる。
//Stringクラスにもequals()メソッドは存在し、そこではオブジェクトの同値性ではなく、String str1, String str2
//において、str1 = "こんにちは"、str2 = "こんにちは"であれば同じと見なすようにオーバーライドされている。
//objectクラスの場合は、str1 ≠ str2であるのでfalseとなる。