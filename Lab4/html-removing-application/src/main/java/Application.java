public class Application {

    public static void main(String[] args) {

        System.out.println(StringHtmlCleaner.Clear(PageDownloadingUtility.download(args[0])));
    }
}