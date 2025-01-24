//インスタンス変数・インスタンスメソッドを記述する。
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
    public void setCar(int n, double g)
    {
        System.out.println("ナンバーを" + num + "ガソリン量を" + gas + "にしました。");
    }
    public void show()
    {
        System.out.println("車のナンバーは" + num + "です。");
        System.out.println("ガソリン量は" + gas + "です。");
    }
}

class Sample9_7
{
    public static void main(String[] args)
    {
        Car car1 = new Car();
        car1.setCar(1234, 20.5);
        car1.show();

        Car car2 = new Car();
        car2.setCar(4567, 50.5);
        car2.show();
    }
}
//オブジェクトごとに「異なる」フィールドの値を持つ。object_name.variable や object_name.method
//の形であれば、それは「オブジェクトに関連付けられている」といえる。
//オブジェクトに関連付けられている変数をインスタンス変数、メソッドをインスタンスメソッドという。
//Question:クラス内に定義された変数・メソッド自体は「インスタンスメソッド」とは呼ばないのか。つまり、オブジェクトを作成した時点で、識別子が付いた段階で、初めてインスタンス変数（メソッド）という名前を冠するのか。