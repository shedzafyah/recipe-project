package zw.co.fyah.domain;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class UnitOfMeasure extends Base{
    private String unitOfMeasure;

    public UnitOfMeasure() {
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }
}
