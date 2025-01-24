//メソッドのオーバーロード（同じクラス内に同じ名前のメソッドを複数定義すること。）  
class Car
{
    private int num;
    private double gas;

    public void setCar(int n)
    {
        num = n;
        System.out.println("ナンバーを" + num + "にしました。");
    }
    public void setCar(double g)
    {
        gas = g;
        System.out.println("ガソリン量を" + gas + "にしました。");
    }
    public void setCar(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
    }
    public void show()
    {
        System.out.println("ナンバーは" + num + "です。");
        System.out.println("ガソリン量は" + gas + "です。");   
    }
}

class Sample9_3
{
    public static void main(String[] args) 
    {
     Car car1 = new Car();
     
     car1.setCar(1234, 20.5);
     car1.show();

     System.out.println("車のナンバーだけ変更します。");
     car1.setCar(2345);
     car1.show();

     System.out.println("ガソリン量だけ変更します。");
     car1.setCar(30.5);
     car1.show();
    }
}

//「setCar()」という名前のメソッドは全部で3つあるが、引数の型と個数が異なるので、実引数の入れ方によって異なるsetCar()メソッドが呼び出される。
//オーバーロードが機能する状態を「多態性(polymorphism)」と呼ぶ。