package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Product {
@Id
private Integer prodId;
private String prodCode;
private Double prodCost;
}
