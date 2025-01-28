//画像を表示する

import java.awt.*;
import java.awt.event.*;

public class Sample16_5 extends Frame   //Frameクラスを拡張したクラスSample16_5を作成
{
    Image im;   //Image class object "im" defined.

    public static void main(String[] args)
    {
        Sample16_5 sm = new Sample16_5();   //Sample16_5の新しいオブジェクト"sm"を作成
    }
    public Sample16_5() //Sample16_5のコンストラクタを定義
    {
        super("サンプル");

        Toolkit tk = getToolkit();  //getToolkit()メソッドを使用して、Toolkitクラスのオブジェクトtkを取得(代入)する.
        im = tk.getImage("neko1.jpg");  //imオブジェクトに、tkオブジェクトにgetImage()メソッドを使用して得た値(Image.jpg)を代入する.
        
        addWindowListener(new SampleWindowListener());  //  SampleWindowListenerのイベント処理を受け取るWindowListenerを追加する.
        
        setSize(250, 200);
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        g.drawImage(im, 100, 100, this);    //
    }

    class sampleWindowListener extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
    }
}