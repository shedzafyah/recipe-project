package zw.co.fyah.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;
import java.util.Set;

@Entity
public class Category extends Base{
    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;
    private String description;

    public Category(String description) {
        this.description = description;
    }

    public Category() {
    }

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
