package articles;

public class Article7 extends Article {
    
    private static final float TAX = 7;
    
    public Article7(String name, String price) {
        super(name, price);
    }
    
    @Override
    public float getTAX() {
        return Article7.TAX;
    }
}
