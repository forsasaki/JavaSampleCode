//オブジェクトの配列
class Car
{
    private int num;
    private double gas;

    public Car()
    {
        num = 0;
        gas = 0.0;
        System.out.println("You made a car.");
    }
    public void setCar(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("You set the number of car" + num + "and the quantity of gasoline" + gas);
    }
    public void show()
    {
        System.out.println("the number of car is" + num);
        System.out.println("the amount of gasoline of car is" + gas);
    }
}

class Sample10_9
{
    public static void main(String[] args)
    {
        //クラス型の三要素の配列を定義⇒要素分のオブジェクトを作成して配列に代入
        Car[] cars;             //型　変数 の形を守る。
        cars = new Car[3];      //配列オブジェクトと言えそうなもの。
        
        for(int i=0; i < cars.length; i++)
        {
            cars[i] = new Car();
        }

        cars[0].setCar(1234, 20.5);
        cars[1].setCar(2345, 30.5);
        cars[2].setCar(3456, 40.5);
//cars[0]は配列中の0番目の値であり、一つのオブジェクトであるから、objectName.Methodの形でインスタンスメソッドを適用する。
        for(int i=0; i < cars.length; i++)
        {
            cars[i].show();
        }
    }
}