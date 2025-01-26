//例外の送出
//自分で例外クラスを作る
//Trowableクラスのサブクラスを拡張して例外クラスを宣言する

/*
class CarException extends Exception
{
    System.out.println("Exceptionクラスを拡張して新しいCarExceptionクラスを作成しました。");
}
*/

class CarException extends Exception{
}
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
    public void setCar (int n, double g) throws CarException //投げる例外クラスを指定
    {
        if(g<0){
            CarException e = new CarException();
            throw e;
        }
        else{
            num = n;
            gas = g;
            System.out.println("車のナンバーは" + num + "にガソリン量は" + gas + "にしました。");
        }
    }
        public void show()
        {
            System.out.println("車のナンバー : " + num );
            System.out.println("ガソリン量 : " + gas );
        }
}

class Sample14_5
{
    public static void main(String[] args)
    {
        Car car1 = new Car();
        try{
            car1.setCar(1234, -29);
        }
        catch(CarException e){
            System.out.println(e + "が送出されました。");
        }
        car1.show();
    }
}