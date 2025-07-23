public class Retailer extends Store{
    //Attirbutes
    private int VATinclusivePrice;
    private int LoyaltyPoint;
    private boolean isPaymentOnline;
    private String PurchasedYear;
    
    // Constructor
    public Retailer(int storeID, String storeName,String location, String openingHour,double TotalSales, 
    double TotalDiscount,int VATinclusivePrice,boolean isPaymentOnline,String PurchasedYear)
    {
      // Call superclass constructor
      super(storeID,storeName,location,openingHour);
      super.setTotalSale(TotalSales);
      super.setTotalDiscount(TotalDiscount);
      this.VATinclusivePrice=VATinclusivePrice;
      this.isPaymentOnline=isPaymentOnline;
      this.PurchasedYear=PurchasedYear;
      this.LoyaltyPoint=0; // Initialize to zero
      
      
    }
    //accesor methods
    public int getVATInclusivePrice()
    {
        return this.VATinclusivePrice;
    }
    public int getLoyaltyPoint()
    {
        return this.LoyaltyPoint;
    }
    public boolean getisPaymentOnline()
    {
        return this.isPaymentOnline;
    }
    public String getPurchasedYear()
    {
        return this.PurchasedYear;
    }
    //mutator method
    public void setisPaymentOnline(boolean isPaymentOnline)
    {
        this.isPaymentOnline=isPaymentOnline;
    }
     // Method to set loyalty points
    public void setLoyaltyPoint(boolean newIsPaymentOnline, int VATInclusivePrice)
    {
        if (newIsPaymentOnline==true) 
        {
            this.LoyaltyPoint = (int)(0.01* VATInclusivePrice);
            System.out.println("the loyalty point ="+getLoyaltyPoint());
        }
    }     
    // Method to remove product
    public void removeProduct(){
        if(this.LoyaltyPoint== 0 && getPurchasedYear().equals("2021")||getPurchasedYear()=="2022" ||getPurchasedYear()=="2020")
        {
            this.VATinclusivePrice = 0;
            this.LoyaltyPoint = 0;
            setisPaymentOnline(false);
            
        }
    }
    // Override display method
    @Override
    public void display()
    {
        
        if (VATinclusivePrice != 0)
        {
            // Call superclass display 
            super.display();
            System.out.println("VAT Inclusive Price is: " + getVATInclusivePrice());
            System.out.println("Loyalty Point: " + getLoyaltyPoint());
            System.out.println("Purchased Year: " + getPurchasedYear());
        }
        else if (VATinclusivePrice == 0)
        {

            System.out.println("This product has been removed.");
        }                
    

     }
}