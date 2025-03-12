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
@Table(name = "product",
        catalog = "prfinal"
)
public class Product implements java.io.Serializable {

    private int id;
    private String name;
    private String des;
    private String type;
    private int quantity;
    private float price;
    private float greutate;
    private Date dataProducerii;
    private byte[] image;

    public Product() {
    }

    public Product(int id, String name, String des, String type, int quantity, float price, float greutate, Date dataProducerii, byte[] image) {
        this.id = id;
        this.name = name;
        this.des = des;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.greutate = greutate;
        this.dataProducerii = dataProducerii;
        this.image = image;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "id", unique = true, nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "des")
    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "quantity")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Column(name = "price")
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Column(name = "greutate")
    public float getGreutate() {
        return greutate;
    }

    public void setGreutate(float greutate) {
        this.greutate = greutate;
    }
    
    @Column(name = "image")
    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "dataProducerii")
    public Date getDataProducerii() {
        return dataProducerii;
    }

    public void setDataProducerii(Date dataProducerii) {
        this.dataProducerii = dataProducerii;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + this.id;
        hash = 43 * hash + Objects.hashCode(this.name);
        hash = 43 * hash + Objects.hashCode(this.des);
        hash = 43 * hash + Objects.hashCode(this.type);
        hash = 43 * hash + this.quantity;
        hash = 43 * hash + Float.floatToIntBits(this.price);
        hash = 43 * hash + Float.floatToIntBits(this.greutate);
        hash = 43 * hash + Objects.hashCode(this.dataProducerii);
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
        final Product other = (Product) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.quantity != other.quantity) {
            return false;
        }
        if (Float.floatToIntBits(this.price) != Float.floatToIntBits(other.price)) {
            return false;
        }
        if (Float.floatToIntBits(this.greutate) != Float.floatToIntBits(other.greutate)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.des, other.des)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.dataProducerii, other.dataProducerii)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", des=" + des + ", type=" + type + ", quantity=" + quantity + ", price=" + price + ", greutate=" + greutate + ", dataProducerii=" + dataProducerii + '}';
    }

}
