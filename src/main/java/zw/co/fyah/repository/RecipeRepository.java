package zw.co.fyah.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.co.fyah.domain.Recipe;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe,Long> {

}
