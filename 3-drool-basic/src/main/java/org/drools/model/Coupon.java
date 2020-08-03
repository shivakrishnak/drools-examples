package org.drools.model;

import java.util.Date;

public class Coupon {

    public enum CouponType {
        DISCOUNT, TWOFORONE, POINTS
    };

    private Customer customer;
    private Order order;
    private CouponType type;
    private Date validFrom;
    private Date validUntil;

    public Coupon() {
    }

    public Coupon(Customer customer, Order order, CouponType type) {
        this.customer = customer;
        this.order = order;
        this.type = type;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public CouponType getType() {
        return type;
    }

    public void setType(CouponType type) {
        this.type = type;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(Date validUntil) {
        this.validUntil = validUntil;
    }

    @Override
    public String toString() {
        return "Coupon{" + "customer=" + customer + ", order=" + order + ", type=" + type + ", validFrom=" + validFrom + ", validUntil=" + validUntil + '}';
    }

}