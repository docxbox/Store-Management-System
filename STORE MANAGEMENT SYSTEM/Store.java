 public class Store{
    // Private instance variables
    private  int storeID;
    private String storeName;
    private String location;
    private String openingHour;
    private double totalSale;
    private double totalDiscount;
    
    //Constructor
    public Store (int storeID,String storeName, String location, String 
    openingHour){
        this.storeID = storeID;
        this.storeName = storeName;
        this.location = location;
        this.openingHour = openingHour;
        this.totalSale = 0;
        this.totalDiscount = 0;
    }

    
    //Accesor method 
    public int getStoreID(){
       return this.storeID;
    }
    public String getStoreName(){
        return this.storeName;
    }
    public String getLocation(){
        return this.location;
    }
    public String getOpeningHour(){
        return this.openingHour;
    }
    public double getTotalSale(){
        return this.totalSale;
    }
    public double getTotalDiscount(){
        return this.totalDiscount;
    }
    
    //Mutator method
    
    public void setTotalSale(double totalSale){
        this.totalSale = totalSale;
    }
    public void setTotalDiscount(double totalDiscount){
        this.totalDiscount = totalDiscount;
    }
    //Method to display information of store class
    public void display(){
        System.out.println("STORE ID: "+ getStoreID());
        System.out.println("STORE NAME: "+ getStoreName());
        System.out.println("STORE LOCATION: "+ getLocation());
        System.out.println("STORE OPENINGHOUR: " + getOpeningHour());
        // conditional statements
        if (totalSale == 0 & totalDiscount == 0)
        {
            System.out.println("THEIR IS NO TOTAL SALE OR DISCOUNT");
        }
        else{
            System.out.println("TOTAL SALE: " + getTotalSale());
            
            System.out.println("TOTAL DISCOUNT: " + getTotalDiscount()); 
        }
        
        
    }
}
    
