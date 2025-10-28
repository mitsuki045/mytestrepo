package client;

public class AndCaller {

    public static void main(String[] args) {
        // Andクラスのaddメソッドを呼び出す
        int result1 = And.add(1, 2, 3);
        int result2 = And.add(5, 10, 2);
        int result3 = And.add(0, 4, 1);

        System.out.println("結果1: " + result1);
        System.out.println("結果2: " + result2);
        System.out.println("結果3: " + result3);

        // 条件付きの利用例（少し複雑にして依存関係を示す）
        for (int i = 0; i < 3; i++) {
            int a = i + 1;
            int b = i * 2 + 3;
            int c = 5 - i;
            int res = And.add(a, b, c);
            System.out.println("ループ呼び出し " + i + ": add(" + a + "," + b + "," + c + ") = " + res);
        }
    }
}
