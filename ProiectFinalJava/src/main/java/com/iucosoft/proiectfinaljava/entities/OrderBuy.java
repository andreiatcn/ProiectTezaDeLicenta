/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.proiectfinaljava.entities;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author tacua
 */
@Entity
@Table(name = "order_buy",
         catalog = "prfinal"
)
public class OrderBuy implements java.io.Serializable{
     private int id;
    private int idSeller;
    private int idProduct;
    private float sum;
    private int quantity;
    private String state;
    private Date dataAchizitionarii;

    public OrderBuy() {
    }

    public OrderBuy(int id, int idSeller, int idProduct, float sum, int quantity, String state, Date dataAchizitionarii) {
        this.id = id;
        this.idSeller = idSeller;
        this.idProduct = idProduct;
        this.sum = sum;
        this.quantity = quantity;
        this.state = state;
        this.dataAchizitionarii = dataAchizitionarii;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "id", unique = false, nullable = false)
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "id_seller")
    public int getIdSeller() {
        return idSeller;
    }

    public void setIdSeller(int idSeller) {
        this.idSeller = idSeller;
    }

    @Column(name = "id_product")
    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    
    @Column(name = "sum")
    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    
    @Column(name = "qantity")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
    @Column(name = "state", length = 45)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "data_achizitionarii")
    public Date getDataAchizitionarii() {
        return dataAchizitionarii;
    }

    public void setDataAchizitionarii(Date dataAchizitionarii) {
        this.dataAchizitionarii = dataAchizitionarii;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.id;
        hash = 97 * hash + this.idSeller;
        hash = 97 * hash + this.idProduct;
        hash = 97 * hash + Float.floatToIntBits(this.sum);
        hash = 97 * hash + this.quantity;
        hash = 97 * hash + Objects.hashCode(this.state);
        hash = 97 * hash + Objects.hashCode(this.dataAchizitionarii);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OrderBuy other = (OrderBuy) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.idSeller != other.idSeller) {
            return false;
        }
        if (this.idProduct != other.idProduct) {
            return false;
        }
        if (Float.floatToIntBits(this.sum) != Float.floatToIntBits(other.sum)) {
            return false;
        }
        if (this.quantity != other.quantity) {
            return false;
        }
        if (!Objects.equals(this.state, other.state)) {
            return false;
        }
        if (!Objects.equals(this.dataAchizitionarii, other.dataAchizitionarii)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "OrderBuy{" + "id=" + id + ", idSeller=" + idSeller + ", idProduct=" + idProduct + ", sum=" + sum + ", quantity=" + quantity + ", state=" + state + ", dataAchizitionarii=" + dataAchizitionarii + '}';
    }
    
    

   
    
    
}
