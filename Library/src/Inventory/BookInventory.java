package Inventory;

public class BookInventory implements Stockable 
{
    private int stockQuantity;

    public BookInventory(int stockQuantity) 
    {
        this.stockQuantity = stockQuantity;
    }

    @Override
    public int getStockQuantity() 
    {
        return stockQuantity;
    }
}
