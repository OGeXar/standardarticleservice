package com.ba.articleservice.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Article")
public class Article {

    @Id
    private String id;
    private String name;
    private long barcodethingy;
    private long quantity;
    private long packagingQuantity;
    private Category category;

    public Article(){
    }
    public Article(String name, long barcodethingy, long quantity, long packagingQuantity, Category category){
        this.name = name;
        this.barcodethingy = barcodethingy;
        this.quantity = quantity;
        this.packagingQuantity = packagingQuantity;
        this.category = category;
    }
    /* 
    public void setId(long id) {
        this.id = id;
    } */
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getBarcodethingy() {
        return barcodethingy;
    }
    public void setBarcodethingy(long barcodethingy) {
        this.barcodethingy = barcodethingy;
    }
    public long getQuantity() {
        return quantity;
    }
    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }
    public long getPackagingQuantity() {
        return packagingQuantity;
    }
    public void setPackagingQuantity(long packagingQuantity) {
        this.packagingQuantity = packagingQuantity;
    }
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
}
