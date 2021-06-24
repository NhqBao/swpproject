/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author msi-pc
 */
public class Food {

    private int foodID;
    private String image;
    private String foodName;
    private int foodPrice;
    private int categoryID;

    @Override
    public String toString() {
        return "Food{" + "foodID=" + foodID + ", image=" + image + ", foodName=" + foodName + ", foodPrice=" + foodPrice + ", categoryID=" + categoryID + '}';
    }

    public int getFoodID() {
        return foodID;
    }

    public void setFoodID(int foodID) {
        this.foodID = foodID;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(int foodPrice) {
        this.foodPrice = foodPrice;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public Food(int foodID, String image, String foodName, int foodPrice, int categoryID) {
        this.foodID = foodID;
        this.image = image;
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.categoryID = categoryID;
    }
   


}
