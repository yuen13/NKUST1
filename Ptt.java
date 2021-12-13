import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Ptt {
    public static void main(String[] args) throws IOException {
        try {
            //抓取ptt熱門看板資料
            Document doc = Jsoup.connect("https://www.ptt.cc/bbs/hotboards.html").get();
            //抓取ptt每個熱門看板網址
            Elements hotClasses = doc.select("#main-container .b-ent a");
            for (Element hotClass : hotClasses) {
                //最後輸出文章分類
                String pttTitle = hotClass.select(".board-name").text();
                //讀取每個熱門看板網址，並抓取資料
                String articleSortDoc = hotClass.absUrl("href").toString();
                Document hotBoardDoc = Jsoup.connect(articleSortDoc).get();
                //抓取每個文章網址
                Elements articleSortClasses = hotBoardDoc.select("#main-container .r-ent .title a");
                for (Element articleSortClass : articleSortClasses) {
                    //最後輸出文章標題
                    String articleTitle = articleSortClass.text();
                    //讀取每個文章網址，並抓取資料
                    String articleDoc = articleSortClass.absUrl("href").toString();
                    Document articleClasses = Jsoup.connect(articleDoc).get();
                    //確認是否有留言
                    if (!articleClasses.select(".push").isEmpty()) {
                        //有的話則，抓出每個文章第一個留言資料
                        Element firstPush = articleClasses.select("#main-container #main-content .push").get(0);
                        String commitName = firstPush.select("span").get(1).text();
                        String firstCommit = firstPush.select("span").get(2).text();
                        //輸出結果
                        System.out.println("Board: " + pttTitle);
                        System.out.println("Article title: " + articleTitle);
                        System.out.println("commit: " + commitName + firstCommit);
                    }
                    else{
                        //沒有的話則，commit為null，並結果輸出
                        System.out.println("Board: " + pttTitle);
                        System.out.println("Article title: " + articleTitle);
                        System.out.println("commit: null");
                    }
                    System.out.println("==================================");
                }
            }
        } catch (Exception e) {
            System.out.println("error:" + e);
        }
    }
}