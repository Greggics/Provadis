package aufgabe53;

public class ArticleTest {
    public static void main(String[] args) {
        Article article = new Article(123, "Klopapier", 1000000);
        System.out.println(article.toString());
        article.setPrice(999999999);
        System.out.println(article.toString());
    }

}
