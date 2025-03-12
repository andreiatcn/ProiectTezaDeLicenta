/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.proiectfinaljava.entities;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author tacua
 */
public class OrderSell {

    private int id;
    private int idUser;
    private int idProduct;
    private float sum;
    private int quantity;
    private String state;
    private LocalDate dataAchizitionarii;

    public OrderSell() {
    }

    public OrderSell(int id, int idUser, int idProduct, float sum, int quantity, String state, LocalDate dataAchizitionarii) {
        this.id = id;
        this.idUser = idUser;
        this.idProduct = idProduct;
        this.sum = sum;
        this.quantity = quantity;
        this.state = state;
        this.dataAchizitionarii = dataAchizitionarii;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public LocalDate getDataAchizitionarii() {
        return dataAchizitionarii;
    }

    public void setDataAchizitionarii(LocalDate dataAchizitionarii) {
        this.dataAchizitionarii = dataAchizitionarii;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.id;
        hash = 23 * hash + this.idUser;
        hash = 23 * hash + this.idProduct;
        hash = 23 * hash + Float.floatToIntBits(this.sum);
        hash = 23 * hash + this.quantity;
        hash = 23 * hash + Objects.hashCode(this.state);
        hash = 23 * hash + Objects.hashCode(this.dataAchizitionarii);
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
        final OrderSell other = (OrderSell) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.idUser != other.idUser) {
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
        return "OrderSell{" + "id=" + id + ", idUser=" + idUser + ", idProduct=" + idProduct + ", sum=" + sum + ", quantity=" + quantity + ", state=" + state + ", dataAchizitionarii=" + dataAchizitionarii + '}';
    }

}
