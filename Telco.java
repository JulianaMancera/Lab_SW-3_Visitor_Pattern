public class Telco implements TelcoSubscription {

    private String telcoName;
    private double promoPrice;
    private int dataAllowance;
    private boolean unliCallText;

    public Telco(String telcoName, double promoPrice, int dataAllowance, boolean unliCallText){
        
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.dataAllowance = dataAllowance;
        this.unliCallText = unliCallText;
    }

    public void setDataAllowance(int dateAllowance){
        this.dataAllowance = dateAllowance;

    }
    public int getDataAllowance(){
        return dataAllowance;

    }

    public void setUnliCallText(boolean unliCallText){
        this.unliCallText = unliCallText;

    }

    public boolean getUnliCallText(){
        return unliCallText;

    }

    public void setTelcoName(String telcoName){
        this.telcoName = telcoName;

    }
    public String getTelcoName(){
        return telcoName;

    }

    public void setPromoPrice(double promoPrice){
        this.promoPrice = promoPrice;

    }
    public double getPromoPrice(){
        return promoPrice;

    }

    public String accept(UsagePromo promo, double price){
        return "";

    }
    public String accept(UnliCallsTextOffer unliPackage, boolean unliCallText){
        return "";

    }
}
