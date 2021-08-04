package zw.co.fyah.domain;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class UnitOfMeasure extends Base{
    private String description;

    public UnitOfMeasure(String description) {

        this.description = description;
    }

    public UnitOfMeasure() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
