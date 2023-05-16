import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class StringHtmlCleaner {
    public static String Clear (String myStringToClean) {
        String textToClean = myStringToClean;
        Document document = Jsoup.parse(textToClean);
        String textWithoutHtml = document.text();
        return textWithoutHtml;
    }
}

