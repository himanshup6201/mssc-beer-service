package web.services.v2;

import web.model.v2.BeetDTOv2;

import java.util.UUID;

public interface BeerServicev2 {
    BeetDTOv2 getBeerById(UUID beerId);

    BeetDTOv2 saveNewBeer(BeetDTOv2 beerDTO);

    void updateBeer(UUID beerId, BeetDTOv2 beerDTO);

    void deleteById(UUID beerId);
}
