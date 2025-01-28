//GUIアプリケーション
//Graphical User Interfaceについて理解する。
//AWT(Abstract Window Toolkit)
//フレームを使う。

import java.awt.*;
import java.awt.event.*;

public class Sample16_1 extends Frame   //Frameクラスを拡張する
{
    public static void main(String[] args)
    {
        Sample16_1 sm = new Sample16_1();
    }
    public  Sample16_1()    //コンストラクタの設定
    {
        super("サンプル");  //windowのタイトル

        addWindowListener(new SampleWindowListener());

        setSize(250, 200);  //windowのサイズ
        setVisible(true);   //windowが表示されるようにする
    }
    class SampleWindowListener extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
    }
}
