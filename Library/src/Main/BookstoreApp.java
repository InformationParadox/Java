package Main;

import Book.Novel;
import Inventory.BookInventory;

class MysteryNovel extends Novel 
{
    @Override
    public void read() 
    {
        System.out.println("Reading a Mystery Novel.");
    }
}

class Bookstore extends BookInventory 
{
    public Bookstore(int stockQuantity) 
    {
        super(stockQuantity);
    }

    @Override
    public int getStockQuantity() 
    {
        return super.getStockQuantity();
    }
}

public class BookstoreApp 
{
    public static void main(String[] args) 
    {
        MysteryNovel mysteryNovel = new MysteryNovel();
        Bookstore bookstore = new Bookstore(100);

        mysteryNovel.read();
        System.out.println("Available Stock Quantity of the book: " + bookstore.getStockQuantity());
    }
}
