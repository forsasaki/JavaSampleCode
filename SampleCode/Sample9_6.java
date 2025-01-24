//別のコンストラクタを呼び出す。
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
        this();
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

class Sample9_6
{
    public static void main(String[] args)
    {
        Car car1 = new Car();
        car1.show();

        Car car2 = new Car(1234, 20.5);
        car2.show();
    }
}

//this();の部分で、引数ナシのコンストラクタの処理が呼び出される。
//コンストラクタを定義しないと、引数ナシのコンストラクタが定義される。これを、デフォルトコンストラクタ（default constructor）という。
//コンストラクタにも、private や publicなどの修飾子（modifier）を付けることができる。
//例えば、引数ナシのコンストラクタを「private Car()」としておくと、オブジェクトを作成する際に引数ナシのコンストラクタを呼び出せない。