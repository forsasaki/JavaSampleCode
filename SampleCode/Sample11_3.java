//protected　メンバーの使用。   
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
    public void newShow()
    {
        System.out.println("レーシングカーのナンバーは" + num + "です。");
        System.out.println("ガソリン量は" + gas + "です。");
        System.out.println("コース番号は" + course + "です。");
    }
}
class Sample11_3
{
    public static void main(String[] args)
    {
        RacingCar rccar1;
        rccar1 = new RacingCar();

        rccar1.newShow();
    }
}