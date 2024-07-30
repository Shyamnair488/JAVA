
public class Product

{

    //Attributes

    private int productId;

    private String productName;

    private float price;

    private char category;

    

    //Write the setter

    public int getProductId(){

        return productId;

    }

    

    public void setProductId(int productId){

        this.productId=productId;

    

    }

    

    public void setProductName(String productName){

        this.productName=productName;

        

    }
    public String getProductName(){

        return productName;

    }

    

    public float getPrice(){

        return price;

    }

    

    public void setPrice(float price){

        this.price=price;

    }

    

    public char getCategory(){

        return category;

    }

    

    public void setCategory(char category){

        this.category=category;

    }

    

}



public class UserInterface

{

    public static void main(String args[])

    {

        Product pdtObj=new Product();

        

        pdtObj.setProductId(12);

        pdtObj.setProductName("Kayal");

        pdtObj.setPrice(450);

        pdtObj.setCategory('H');

        

        System.out.println(pdtObj.getProductId());

        System.out.println(pdtObj.getProductName());

        System.out.println(pdtObj.getPrice());

        System.out.println(pdtObj.getCategory());

    }

}