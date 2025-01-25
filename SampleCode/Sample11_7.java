//super classからsub classを作り、sub class からさらにsub classを作成できる。
//しかし、複数のスーパークラスを継承したサブクラスを柵栄することはできない。
//複数のスーパークラスから継承したクラスを疑似的に作るには、interferceを用いる。
//全てのクラスは、スーパークラスを指定しなければ、スーパークラスとしてobjectクラスを持つ。

//objectクラスは、以下のメソッドを持つ。
//boolean equals(object obj)
//Class getClass()
//String toStirng()

// 車クラス
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

    public void setCar(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
    }
    //ようやく何の矛盾もなく、setCarメソッドの仕組みと記述を理解した。

    public String toString()
    {
        String str = "ナンバー : " + num + " ガソリン量 : " + gas;
        return str;     //return value の表記を守る。
    }
}
class Sample11_7
{
    public static void main(String[] args)
    {
        Car car1;
        car1 = new Car();
        car1.setCar(1234,20.5);

        System.out.println(car1);
    }
}

//オブジェクトを文字列で表したものを戻り値として返す。
//オブジェクトの情報を文字列で表すように設計し、
//System.out.println(car1)のように記述することで、car1の文字列としての情報を表示することができる。
//この表示内容を自分で設定できるので、オブジェクト名をオーバーライドしておくと便利。
