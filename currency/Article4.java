package articles;

public class Article4 extends Article {
    
    private static final float TAX = 4;
    
    public Article4(String name, String price) {
        super(name, price);
    }
    
    @Override
    public float getTAX() {
        return Article4.TAX;
    }
}
