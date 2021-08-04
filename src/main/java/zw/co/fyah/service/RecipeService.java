package zw.co.fyah.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.fyah.domain.Recipe;
import zw.co.fyah.repository.RecipeRepository;

import java.util.List;
import java.util.Set;

public interface RecipeService {
   Set<Recipe> getRecipes();
}
