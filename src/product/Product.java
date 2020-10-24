package product;

/**
 *
 * @author Pasan Yasara
 */
public class Product {
    private int id;
    private String name;
    private double price;
    private String addDate;
    private byte[] picture;
    
    public Product (int pid, String pname, float pprice, String pAddDate, byte[] pimg)
    {
        this.id = pid;
        this.name=pname;
        this.price=pprice;
        this.addDate=pAddDate;
        this.picture=pimg;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public String getAddDate()
    {
        return addDate;
    }
    
    public byte[] getImage()
    {
        return picture;
    }
}
