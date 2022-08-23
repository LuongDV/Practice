package org.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Book implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private double price;

}
