package articles;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public abstract class Article {
    
    private String name;
    private BigDecimal basePrice;
    
    public Article(String name, String price) {
        this.name = name;
        this.basePrice = new BigDecimal(price).setScale(2, RoundingMode.HALF_UP);
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getBasePrice() {
        return this.basePrice.doubleValue();
    }
    
    public double getPriceWithTax() {
        BigDecimal priceWithTax = this.basePrice.add(
                new BigDecimal(String.valueOf(this.getPriceTAX())));
        return priceWithTax.doubleValue();
    }
    
    public void setPrice(String price) {
        this.basePrice = new BigDecimal(price).setScale(2, RoundingMode.HALF_UP);
    }
    
    public abstract float getTAX();
    
    public double getPriceTAX() {
        BigDecimal priceTax = this.basePrice.multiply(
                new BigDecimal(String.valueOf(this.getTAX() / 100)));
        return priceTax.doubleValue();
    }
    
    @Override
    public String toString() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("es", "ES"));
        String basePrice = formatter.format(this.basePrice.doubleValue());
        String priceTax = formatter.format(this.getPriceTAX());
        String priceWithTax = formatter.format(this.getPriceWithTax());
        
        return "Name: " + this.name 
                + "\nPrecio base: " + basePrice
                + "\nPrice Tax: " + priceTax + "\n"
                + "Price with TAX: " + priceWithTax + "\n";
    }
}
