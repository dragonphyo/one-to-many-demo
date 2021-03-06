package com.example.onetomanytest.services;

import com.example.onetomanytest.domain.Category;
import com.example.onetomanytest.domain.Product;
import com.example.onetomanytest.repository.CategoryRepository;
import com.example.onetomanytest.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class IDatabaseImp implements IDatabase{
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public IDatabaseImp(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    @Transactional
    public void CreateDatabase(){
    Category c1=new Category();
        c1.setName("Fruits");

    Category c2=new Category();
        c2.setName("Meats");

    Product p1=new Product("Apple",23,2000);
    Product p2=new Product("Orange",23,1000);
    Product p3=new Product("Chicken",23,10000);
    Product p4=new Product("Fish",23,5000);

        c1.addProduct(p1);
        c1.addProduct(p2);

        c2.addProduct(p3);
        c2.addProduct(p4);

        categoryRepository.save(c1);
        categoryRepository.save(c2);

       /* productRepository.save(p1);
        productRepository.save(p2);
        productRepository.save(p3);
        productRepository.save(p4);
        */


}
}
