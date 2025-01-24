package com.webautomation.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage {
    WebDriver driver;

    private By productList = By.className("inventory_item");
    private By addToCartButton = By.cssSelector(".btn_inventory");
    private By cartLink = By.id("shopping_cart_container");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addProductToCart(String productName) {
        List<WebElement> products = driver.findElements(productList);
        for (WebElement product : products) {
            String name = product.findElement(By.className("inventory_item_name")).getText();
            if (name.equals(productName)) {
                product.findElement(addToCartButton).click();
                break;
            }
        }
    }

    public void goToCart() {
        driver.findElement(cartLink).click();
    }
}
