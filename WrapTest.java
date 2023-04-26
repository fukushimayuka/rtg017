class WrapTest {
    public static void main(String[] args) {

        // int型のラッパーの扱い方
        // int型を渡してInegerクラスのインスタンスを生成
        Integer integer01 = Integer.valueOf(30);

        // この生成方法もあるが、パフォーマンスが悪くなる可能性があるので非推奨
        // Integer integer02 = new Integer(30);

        System.out.println(integer01.intValue());

        // String型のラッパーの扱い方
        // String型はそもそも最初からラッパーというか、参照型変数である。
        String str01 = "aiueo";
        System.out.println(str01);


        // string型からint型への変換
        String str02 = "50";
        int int02 = Integer.parseInt(str02);
        System.out.println(int02);

        // int型からString型への変換
        int int03 = 255;
        String str03 = Integer.valueOf(int03).toString();
        System.out.println(str03);




        // String a = "abc";
        // System.out.println(a.length()); // 3
        // String b = "あいうえお";
        // System.out.println(b.length()); // 5
        // String c = "𩸽";
        // System.out.println(c.length()); // 2


        String x = "abc";
        System.out.println(x.codePointCount(0, x.length()));
        String y = "あいうえお";
        System.out.println(y.codePointCount(0, y.length()));
        String z = "𩸽";
        System.out.println(z.codePointCount(0, z.length()));



        String d = " abc ";
        System.out.println(d.strip()); // 前後の空白を除去
        System.out.println(d.stripLeading()); // 前の空白を除去
        System.out.println(d.stripTrailing()); // 後ろの空白を除去

        //trimメソッドが前後の半角スペースや改行、タブを削除するのに対し、
        //stripメソッドは前後の全角、半角のスペースや改行、タブを削除します。
        //全角スペースを削除したい時にはstripメソッドを使うようにしましょう。



        String engineers = "tanaka,satou,kobayashi,satomi,suzuki,takahashi";
        String[] result = engineers.split(",");
        for(var str: result) {
            System.out.println(str);
        }



        /****** String ********/
        String a = "あいうえお";

        // start,endで処理時間を計測
        long start = System.nanoTime();
        for(int i=0; i < 1000; i++) {
            a += "追加";
        }
        long end = System.nanoTime();
        System.out.println(( (double)(end - start) / 1000000) + "秒");


        /**** StringBuilder *****/
        StringBuilder b = new StringBuilder("あいうえお");

        // start_2, end_2で処理時間を計測
        long start_2 = System.nanoTime();
        for(int i=0; i < 1000; i++) {
            b.append("追加");
        }
        long end_2 = System.nanoTime();
        System.out.println(( (double)(end_2 - start_2) / 1000000) + "秒");

    }
}