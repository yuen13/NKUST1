import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import javax.lang.model.util.Elements;
import java.io.IOException;

public class SSU {
    public static void main(String[] args) throws IOException {
        try {
            Document document = Jsoup.connect("http://www.ssu.org.tw/").get();
            Elements news =document.select("");
        } catch (Exception e) {
            System.out.println();
        }
    }
}
