import java.util.List;

public class Main {
    public static void main(String[] args) {
        //課題4
        //文字列結合と数値計算結果の結合をして
        //自分の名前　+　自分の年齢　+　"歳です。"が出力されるようにする。

        String myName = "古田慧介";
        int age = 29;

        System.out.println(myName + "は" + age + "歳です。");

        List<String> names = List.of("yamada","tanaka","yasui","suzuki","iida");
        List<String> result = names.stream().filter(name ->name.contains("a")).toList();
        System.out.println(result);
        }
    }
