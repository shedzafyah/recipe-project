package zw.co.fyah.service;

import zw.co.fyah.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureService {
    Optional<UnitOfMeasure> findByDescription(String description);
}
