package articles;

public class Principal {

    public static void main(String[] args) {
        
        Article4 art1 = new Article4("Harina", "0.5");
        Article7 art2 = new Article7("Lentillas", "50");
        Article16 art3 = new Article16("Armario", "300");
        
        System.out.println(art1);
        System.out.println(art2);
        System.out.println(art3);
        
        Article[] articles = new Article[3];
        articles[0] = art1;
        articles[1] = art2;
        articles[2] = art3;
        
        for (Article article : articles) {
            System.out.println(article.toString());
        }
    }
    
}
