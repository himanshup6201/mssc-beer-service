package web.controller.v2;

import org.springframework.stereotype.Service;
import web.model.v2.BeetDTOv2;
import web.services.v2.BeerServicev2;

import java.util.UUID;
@Service
public class BeerServicev2Impl implements BeerServicev2 {
    @Override
    public BeetDTOv2 getBeerById(UUID beerId) {
        return null;
    }

    @Override
    public BeetDTOv2 saveNewBeer(BeetDTOv2 beerDTO) {
        return null;
    }

    @Override
    public void updateBeer(UUID beerId, BeetDTOv2 beerDTO) {

    }

    @Override
    public void deleteById(UUID beerId) {

    }
}
