package zw.co.fyah.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zw.co.fyah.domain.Category;
import zw.co.fyah.domain.Recipe;
import zw.co.fyah.domain.UnitOfMeasure;
import zw.co.fyah.repository.CategoryRepository;
import zw.co.fyah.repository.UnitOfMeasureRepository;
import zw.co.fyah.service.RecipeService;

import java.util.Optional;

/***
 * created by Shelton 03/08/21
 */

@Controller
@RequestMapping
public class IndexController {

    /*
    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    @Autowired
    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

     */

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping({"","/","index"})
    public String home(Model model){
      // Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
     //  Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("cup");
        model.addAttribute("recipe",recipeService.getRecipes());

        return "index";
    }
}
