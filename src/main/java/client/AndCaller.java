package client;

public class AndCaller {

    public void main(String[] args) {
        // Andクラスのインスタンスを生成
        And and = new And();

        // addメソッドを呼び出す（staticではないのでインスタンス経由）
        int result1 = and.add(1, 2, 3);
        int result2 = and.add(5, 10, 2);
        int result3 = and.add(0, 4, 1);

        System.out.println("結果1: " + result1);
        System.out.println("結果2: " + result2);
        System.out.println("結果3: " + result3);

        // 条件付きの利用例（依存関係を示すループ）
        for (int i = 0; i < 3; i++) {
            int a = i + 1;
            int b = i * 2 + 3;
            int c = 5 - i;
            int res = and.add(a, b, c);
            System.out.println("ループ呼び出し " + i + ": add(" + a + "," + b + "," + c + ") = " + res);
        }
    }
}

