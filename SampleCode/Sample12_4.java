//多重継承
//プログラムの作成過程では、数多くのクラスやインターフェイスを組み合わせていく。
//二つ以上のクラスを継承したサブクラスを使いたい場合、「多重継承(multiple inheritance)」を行う。
//Java では、二つ以上のスーパークラスを持つサブクラスを認めていない。
//そこで、インターフェイスを用いて疑似的にそのような実装を行う。

//のりものインターフェイス
interface iVehicle
{
    void vshow();   //iVehicle の抽象メソッド
}
//材料インターフェイス
interface iMaterial
{
    void mshow();   //iMaterial の抽象メソッド
}
//車クラス
class Car implements iVehicle, iMaterial
{
    private int num;
    private double gas;

    public Car(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
    }
    public void vshow()
    {
     System.out.println("車のナンバーは" + num + "です。");
     System.out.println("ガソリン量は"  + gas + "です。");   
    }
    public void mshow()
    {
        System.out.println("車の材質は鉄です。");
    }
}
//抽象メソッドのオーバライドまで完了。
class Sample12_4
{
    public static void main(String[] args)
    {
        Car car1 = new Car(1234, 20.5);
        car1.vshow();
        car1.mshow();
    }
}
//二つのインターフェイスを実装することで、メソッドの名前を多重継承（iVehicle:vshow(), iMaterial:mshow()）している。