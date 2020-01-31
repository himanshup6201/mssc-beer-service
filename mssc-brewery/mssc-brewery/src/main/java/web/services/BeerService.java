package web.services;

import web.model.BeerDTO;

import java.util.UUID;

public interface BeerService {
    BeerDTO saveNewBeer(BeerDTO beerDTO);

    BeerDTO getBeerById(UUID beerId);

    void updateBeer(UUID beerId, BeerDTO beerDTO);

    void deleteById(UUID beerId);
}
