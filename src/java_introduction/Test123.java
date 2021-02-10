package java_introduction;

import java.time.*;

public class Test123 {
    public static void main(String[] args) {
        String content = "\"buyDate\":\"2019-04-09T13:21:00.866Z\"";
        String result = content.replaceAll("\"buyDate\":\".*?\"", "\"buyDate\":\""
                + LocalDateTime.now().toString() + "Z" + "\"");
        System.out.println(result);
    }
}
