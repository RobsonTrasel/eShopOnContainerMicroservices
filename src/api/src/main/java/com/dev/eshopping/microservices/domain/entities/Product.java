package com.dev.eshopping.microservices.domain.entities;

import jakarta.persistence.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;
    private LocalDateTime registerDate;
    @ManyToOne
    private Category category;
    private byte[] image;
    private int stockQty;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Comments> comments;

    public Product(
            String name,
            String description,
            Double price,
            Category category
    ) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.registerDate = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public LocalDateTime getDate() {
        return registerDate;
    }

    public void setImage(MultipartFile image) throws IOException {
        this.image = image.getBytes();
    }

    public byte[] getImage() {
        return image;
    }

    public int getStockQty() {
        return stockQty;
    }
    public void setStockQty(int stockQty) {
        this.stockQty = stockQty;
    }

    public boolean addToCart(int qty) {
        if (qty <= stockQty) {
            stockQty -= qty;
            return true;
        }
        return false;
    }

    public boolean removeFromCart(int qty) {
        stockQty += qty;
        return true;
    }

    public List<Comments> getComments() {
        return comments;
    }
    public void setComments(List<Comments> comments) {
        this.comments = comments;
    }

    public void addComments(Comments comments) {
        this.comments.add(comments);
    }

    public void removeComments(Comments comments) {
        this.comments.add(comments);
    }

    @Override
    public String toString() {
        return "Produto [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
    }
}
