import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.Objects;

public class Constitution {
    public static void main(String[] args) throws IOException {
        try {
            String URL_1 = "https://law.moj.gov.tw";
            String URL_2 = "";
            String URL_3 = "";
            String URL_4 = "";
            Document index_1 = Jsoup.connect(URL_1).get();
            Document index_2 = new Document("");
            Document index_3 = new Document(""); 

            Elements headline = index_1.select("#FunNavbar div.container ul li a");
            System.out.println(index_1.title());
            for (Element x : headline) {
                if (Objects.equals(x.text(), "中央法規")) {
                    System.out.println(URL_1 + x.attr("href"));
                    URL_2 = x.attr("href");
                    index_2 = Jsoup.connect(URL_1 + URL_2).get();
                    break;
                }
            }
            System.out.println(index_2.title());
            Elements headline2 = index_2.select("#plRightList");
            Element table = headline2.select("table").last();
            Element tbody = table.select("tbody").first();
            Elements td = tbody.select("td a");
            Elements span = tbody.select("span a");
            for (Element x : span) {
                URL_4 = x.attr("href").replace('E', ' ').replace('N', ' ')
                        .replace('G', ' ').replaceAll("\\s", "").substring(23);
                System.out.println(URL_1 + URL_4);
                index_3 = Jsoup.connect(URL_1 + URL_4).get();
                break;
            }
            for (Element x : td) {
                if (Objects.equals(x.text(), "中華民國憲法")) {
                    URL_3 = x.attr("href").replace('.', ' ');
                    System.out.printf(URL_1 + "%s ", URL_3.replaceAll("\\s+", "") + "===>錯誤網址");
                }
            }
            System.out.println();
            System.out.println();
            System.out.println("<="+index_3.title()+"=>");
            System.out.println("================================");
            Element headline3 = index_3.select("#pnLawFla div.law-reg-content").first();
            Elements cont = headline3.select("div[class~=^law-article]");
            Elements comp_main = headline3.select("div[class~=^h3 char-2]");
            int num = 0;
            if (num == 0) {
                for (Element x : cont) {
                    x = cont.first();
                    System.out.println(x.text());
                    break;
                }
                for (int j = 0; j < 1; j++) {
                    System.out.println();
                    System.out.println("<<<<<<<" + comp_main.get(j).text() + ">>>>>>>");
                    ;
                    for (int i = 1; i < 7; i++) {
                        System.out.printf("%s ", cont.get(i).text());
                    }
                    break;
                }
                for (int j = 1; j < 2; j++) {
                    System.out.println("================================");
                    System.out.printf("<<<<<<<" + "%s ", comp_main.get(j).text() + ">>>>>>>");
                    System.out.println();
                    for (int i = 7; i < 25; i++) {
                        System.out.printf("%s ", cont.get(i).text());
                        System.out.println();
                    }
                    break;
                }
                for (int j = 2; j < 3; j++) {
                    System.out.println("================================");
                    System.out.printf("<<<<<<<" + "%s ", comp_main.get(j).text() + ">>>>>>>");
                    System.out.println();
                    for (int i = 25; i < 35; i++) {
                        System.out.printf("%s ", cont.get(i).text());
                        System.out.println();
                    }
                    break;
                }
                for (int j = 3; j < 4; j++) {
                    System.out.println("================================");
                    System.out.printf("<<<<<<<" + "%s ", comp_main.get(j).text() + ">>>>>>>");
                    System.out.println();
                    for (int i = 35; i < 53; i++) {
                        System.out.printf("%s ", cont.get(i).text());
                        System.out.println();
                    }
                    break;
                }    
                for (int j = 4; j < 5; j++) {
                    System.out.println("================================");
                    System.out.printf("<<<<<<<" + "%s ", comp_main.get(j).text() + ">>>>>>>");
                    System.out.println();
                    for (int i = 53; i < 62; i++) {
                        System.out.printf("%s ", cont.get(i).text());
                        System.out.println();
                    }
                    break;
                }
                for (int j = 5; j < 6; j++) {
                    System.out.println("================================");
                    System.out.printf("<<<<<<<" + "%s ", comp_main.get(j).text() + ">>>>>>>");
                    System.out.println();
                    for (int i = 62; i < 71; i++) {
                        System.out.printf("%s ", cont.get(i).text());
                        System.out.println();
                    }
                    break;
                }
                for (int j = 6; j < 7; j++) {
                    System.out.println("================================");
                    System.out.printf("<<<<<<<" + "%s ", comp_main.get(j).text() + ">>>>>>>");
                    System.out.println();
                    for (int i = 71; i < 86; i++) {
                        System.out.printf("%s ", cont.get(i).text());
                        System.out.println();
                    }
                    break;
                }
                for (int j = 7; j < 8; j++) {
                    System.out.println("================================");
                    System.out.printf("<<<<<<<" + "%s ", comp_main.get(j).text() + ">>>>>>>");
                    System.out.println();
                    for (int i = 86; i < 92; i++) {
                        System.out.printf("%s ", cont.get(i).text());
                        System.out.println();
                    }
                    break;
                }
                for (int j = 8; j < 9; j++) {
                    System.out.println("================================");
                    System.out.printf("<<<<<<<" + "%s ", comp_main.get(j).text() + ">>>>>>>");
                    System.out.println();
                    for (int i = 92; i < 100; i++) {
                        System.out.printf("%s ", cont.get(i).text());
                        System.out.println();
                    }
                    break;
                }
                for (int j = 9; j < 10; j++) {
                    System.out.println("================================");
                    System.out.printf("<<<<<<<" + "%s ", comp_main.get(j).text() + ">>>>>>>");
                    System.out.println();
                    for (int i = 100; i < 117; i++) {
                        System.out.printf("%s ", cont.get(i).text());
                        System.out.println();
                    }
                    break;
                }
                for (int j = 10; j < 11; j++) {
                    System.out.println("================================");
                    System.out.printf("<<<<<<<" + "%s ", comp_main.get(j).text() + ">>>>>>>");
                    System.out.println();
                    for (int i = 117; i < 122; i++) {
                        System.out.printf("%s ", cont.get(i).text());
                        System.out.println();
                    }
                    break;
                }
                for (int j = 11; j < 13; j++) {
                    System.out.println("================================");
                    System.out.printf("<<<<<<<" + "%s ", comp_main.get(j).text() + ">>>>>>>");
                    System.out.println();
                    for (int i = 122; i < 131; i++) {
                        System.out.printf("%s ", cont.get(i).text());
                        System.out.println();
                    }
                    break;
                }
                for (int j = 13; j < 14; j++) {
                    System.out.println("================================");
                    System.out.printf("<<<<<<<" + "%s ", comp_main.get(j).text() + ">>>>>>>");
                    System.out.println();
                    for (int i = 131; i < 139; i++) {
                        System.out.printf("%s ", cont.get(i).text());
                        System.out.println();
                    }
                    break;
                }
                for (int j = 14; j < 15; j++) {
                    System.out.println("================================");
                    System.out.printf("<<<<<<<" + "%s ", comp_main.get(j).text() + ">>>>>>>");
                    System.out.println();
                    for (int i = 139; i < 147; i++) {
                        System.out.printf("%s ", cont.get(i).text());
                        System.out.println();
                    }
                    break;
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
