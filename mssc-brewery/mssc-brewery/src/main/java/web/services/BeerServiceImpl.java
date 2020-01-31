package web.services;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import web.model.BeerDTO;

import java.util.UUID;
@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDTO saveNewBeer(BeerDTO beerDTO) {
        return BeerDTO.builder().ID(UUID.randomUUID()).build();
    }

    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return BeerDTO.builder().ID(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDTO beerDTO) {
    }

    @Override
    public void deleteById(UUID beerId) {
     log.debug("Deleting a beer");
    }
}
