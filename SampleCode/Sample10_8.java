//メソッドの引数として使う。
class Car{
    private int num;
    private double gas;
    private String name;

    public Car()
    {
        num = 0;
        gas = 0.0;
        name = "名無し";
        System.out.println("車を作成しました。");
    }
    public void setCar(int n, double g)
    {
        num = n;
        gas = g;        //numとgasを新しく定義する必要はない。カプセル化したフィールドが既にある。
        System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
    }

    public void setName(String nm)
    {
        name = nm;                              //Question:右辺に左辺の値を代入するが、name="名無し"=nmという関係が成り立ち、nameはnmという文字列にならないのは、仮引数の特性なのか。
        System.out.println("名前を" + name + "にしました。");
    }
    public void show()
    {
        System.out.println("ナンバーは" + num + "です。");
        System.out.println("ガソリン量は" + gas + "です。");
        System.out.println("名前は" + name + "です。");
    }
}

class Sample10_8
{
    public static void main(String[] args)
    {
        Car car1;
        car1 = new Car();
        car1.show();

        int number = 1234;
        double gasoline = 20.5;
        String str = "1号車";

        car1.setCar(number, gasoline);
        car1.setName(str);

        car1.show();
    }
}