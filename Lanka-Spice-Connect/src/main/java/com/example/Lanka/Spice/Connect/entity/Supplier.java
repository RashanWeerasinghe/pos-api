package com.example.Lanka.Spice.Connect.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "suplier")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long suplierId;
    private String suplierArea;
    private String cinnamonType;
    private double buyPrice;
    private String quantity;
    private double sellPrice;

    @OneToMany(mappedBy = "suplier")
    private Set<cinnamonandsupplier> cinnamonandsupliers;


    public Long getSuplierId() {
        return suplierId;
    }

    public void setSuplierId(Long suplierId) {
        this.suplierId = suplierId;
    }

    public String getSuplierArea() {
        return suplierArea;
    }

    public void setSuplierArea(String suplierArea) {
        this.suplierArea = suplierArea;
    }

    public String getCinnamonType() {
        return cinnamonType;
    }

    public void setCinnamonType(String cinnamonType) {
        this.cinnamonType = cinnamonType;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }
}
