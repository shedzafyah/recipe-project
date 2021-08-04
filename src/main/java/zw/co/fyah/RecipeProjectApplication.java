package zw.co.fyah;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import zw.co.fyah.domain.*;
import zw.co.fyah.repository.CategoryRepository;
import zw.co.fyah.repository.RecipeRepository;
import zw.co.fyah.repository.UnitOfMeasureRepository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class RecipeProjectApplication {

    private CategoryRepository categoryRepository;
    private RecipeRepository recipeRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    @Autowired
    public RecipeProjectApplication(CategoryRepository categoryRepository, RecipeRepository recipeRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.recipeRepository = recipeRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(RecipeProjectApplication.class, args);
    }

    @Bean
     CommandLineRunner runner() {
        return args -> {


         };
     }

}
