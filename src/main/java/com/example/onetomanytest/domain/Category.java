package com.example.onetomanytest.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @JoinColumn(name = "category_id_fk")
    @OneToMany(cascade = CascadeType.PERSIST)
    List<Product> products = new ArrayList<>();
    public void addProduct(Product product){
        products.add(product);
    }

}
