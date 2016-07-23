package articles;

public class Article16 extends Article {
    
    private static final float TAX = 16;
    
    public Article16(String name, String price) {
        super(name, price);
    }
    
    @Override
    public float getTAX() {
        return Article16.TAX;
    }
}
