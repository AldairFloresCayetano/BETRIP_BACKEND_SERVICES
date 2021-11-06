package betrip.services.betrip_backend_services.betripapp.domain.travelers.service;

import betrip.services.betrip_backend_services.betripapp.domain.travelers.model.entity.Traveler;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TravelerService {
    List<Traveler>getAll();
    Page<Traveler> getAll(Pageable pageable);
    Traveler getById(Long travelerId);
    Traveler create(Traveler traveler);
    Traveler update(Long travelerId,Traveler request);
    ResponseEntity<?> delete(Long travelerId);
}