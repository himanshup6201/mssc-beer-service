package web.controller.v2;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web.model.BeerDTO;
import web.model.v2.BeetDTOv2;
import web.services.BeerService;
import web.services.v2.BeerServicev2;

import java.util.UUID;

@RequestMapping("/api/v2/beer")
@RestController
public class BeerControllerv2 {
    private final BeerServicev2 beerServicev2;

    public BeerControllerv2(BeerServicev2 beerServicev2) {
        this.beerServicev2 = beerServicev2;
    }

    @GetMapping("/{beerId}")
    public @ResponseBody ResponseEntity<BeetDTOv2> getBeer(@PathVariable("beerId") UUID beerId){

        return  new ResponseEntity<>(beerServicev2.getBeerById(beerId),HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity handlePost(@RequestBody BeetDTOv2 beerDTO){
        BeetDTOv2 saveDTO =beerServicev2.saveNewBeer(beerDTO);
        HttpHeaders headers =new HttpHeaders();
        headers.add( "Location","/api/v1/beer"+saveDTO.getID().toString());
        return new ResponseEntity(headers,HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity handleUpdate(@PathVariable("beerId") UUID beerId,@RequestBody BeetDTOv2 beerDTO){
        beerServicev2.updateBeer(beerId,beerDTO);
        return  new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("beerId") UUID beerId){
        beerServicev2.deleteById(beerId);
    }
}
