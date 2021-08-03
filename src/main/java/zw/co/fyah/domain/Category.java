package zw.co.fyah.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;
import java.util.Set;

@Entity
public class Category extends Base{
    private String name;
    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}
