//コンストラクタのオーバーロード(複数の同じ名前のコンストラクタを定義する。ただし、メソッドのオーバーロードと同様に、引数の型と個数で区別される。)
//車クラス
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

class Sample9_5
{
    public static void main(String[] args)
    {
        Car car1 = new Car();
        car1.show();

        Car car2 = new Car(1234, 20.5);
        car2.show();
    }
}

//引数ナシのコンストラクタと引数二つのコンストラクタがあり、それぞれ異なるオブジェクトに適用した結果、異なる結果が出力されている。
//複数のコンストラクタを定義しておけば、条件に応じた初期値を持つオブジェクトを生成できる。