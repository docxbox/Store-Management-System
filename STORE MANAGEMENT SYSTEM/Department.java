public class Department extends Store {
    // Private instance variables
    private String ProductName;
    private double MarkedPrice;
    private double SellingPrice;
    private boolean isInSales;
    
    //constructor for department 
    public Department(String ProductName, double MarkedPrice, int storeID,String storeName, String location, String 
    openingHour, double totalSale, double totalDiscount){
        // Call superclass constructor
        super( storeID, storeName, location, openingHour);
        super.setTotalSale(totalSale);
        super.setTotalDiscount(totalDiscount);
        this.ProductName = ProductName;
        this.MarkedPrice = MarkedPrice;
        this.SellingPrice = 0.0 ;
        this.isInSales = true ;
        
        
        
    }
    
    //Accesor Method
    public String getProductName()
    {
        return this.ProductName;
    }
    
    public double getMarkedPrice()
    {
        return this.MarkedPrice;
    }
    
    public double getSellingPrice()
    {
        return this.SellingPrice;
    }
    
    public boolean getisInSales()
    {
        return this.isInSales;
    }
    
    // mutator method
    public void setMarkedPrice(double MarkedPrice)
    {
        this.MarkedPrice = MarkedPrice;
    }
    
    // calculating discount and selling price
    public void CalculateDiscountPrice(boolean isInSales, double MarkedPrice)
    {
        isInSales = this.isInSales;
        setMarkedPrice(MarkedPrice);
        double DiscountPercent = 0.0;
        // conditional statements
        if (isInSales)
        {
            if (MarkedPrice >= 5000) 
            {
                DiscountPercent = 0.2;
            }
            else if (MarkedPrice >= 3000 && MarkedPrice < 5000)
            {
                DiscountPercent = 10.0/100.0;
                //discountpercent = 0.01;
                
            }
            else if (MarkedPrice >= 1000 && MarkedPrice < 3000) 
            {
                DiscountPercent = 5.0/100.0; 
                //discountpercent = 0.05 ;
            }
            else 
            {
                }
            this.SellingPrice = MarkedPrice - (MarkedPrice * DiscountPercent);
            super.setTotalDiscount(DiscountPercent * MarkedPrice);
            super.setTotalSale(getTotalSale());
            this.isInSales = false;
            // set isInSales to false after discount
            System.out.println("discount percent :"+DiscountPercent);
            System.out.println("sellingprice of product :"+getSellingPrice());
            System.out.println("total discount="+super.getTotalDiscount());
            System.out.println("total sales"+super.getTotalSale());
            
            
        }
    }
    // Override display method
    @Override
    public void display()
    {
        // Call superclass display method
        super.display();
        //conditional statements
        if (isInSales == true) {
            System.out.println("Product Name: " + getProductName());
            System.out.println("Marked Price: " + getMarkedPrice());
        }
        else {
            System.out.println("Product Name:" +getProductName() );
            System.out.println("Selling Price: " + getSellingPrice());
        }
    }
    
    
    
    
}