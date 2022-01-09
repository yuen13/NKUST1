import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import javax.lang.model.util.Elements;
import java.io.IOException;

public class Constitution {
    public static void main(String[] args) throws IOException {
        try {
            Document doc = Jsoup.connect("https://law.moj.gov.tw/").get();
            Elements news =doc.select("");
        } catch (Exception e) {
            System.out.println();
        }
    }
}
