class Car extends Thread
{
    private String name;

    public Car(String nm)
    {
        name = nm;
    }
    public void run()
    {
        for(int i=0; i<5; i++)
        {
            try{
                sleep(1000); // when this sentence processed, thread stops for one sec.
                System.out.println(name + "の処理をしています。");
            }
            catch(InterruptedException e){} //sleep()メソッドから送出される可能性のある例外
        }
    }
}

class Sample15_3
{
    public static void main(String[] args)
    {
        Car car1 = new Car("1号車");
        car1.start();

        for(int i=0; i<5; i++)
        {
            System.out.println("mainの処理をしています。");
        }
    }
}