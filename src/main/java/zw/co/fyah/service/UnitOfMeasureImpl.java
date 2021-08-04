package zw.co.fyah.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.fyah.domain.UnitOfMeasure;
import zw.co.fyah.repository.UnitOfMeasureRepository;

import java.util.Optional;
@Service
public class UnitOfMeasureImpl implements UnitOfMeasureService{

    private final UnitOfMeasureRepository unitOfMeasureRepository;

    @Autowired
    public UnitOfMeasureImpl(UnitOfMeasureRepository unitOfMeasureRepository) {
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }


    @Override
    public Optional<UnitOfMeasure> findByDescription(String description) {
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription(description);
        return unitOfMeasureOptional;
    }


}
