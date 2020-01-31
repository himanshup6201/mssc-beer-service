package web.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web.model.BeerDTO;
import web.services.BeerService;
import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    public @ResponseBody ResponseEntity<BeerDTO> getBeer(@PathVariable("beerId") UUID beerId){
        return  new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity handlePost(@RequestBody BeerDTO beerDTO){
        BeerDTO saveDTO =beerService.saveNewBeer(beerDTO);
        HttpHeaders headers =new HttpHeaders();
        headers.add( "Location","/api/v1/beer"+saveDTO.getID().toString());
        return new ResponseEntity(headers,HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity handleUpdate(@PathVariable("beerId") UUID beerId,@RequestBody BeerDTO beerDTO){
           beerService.updateBeer(beerId,beerDTO);
           return  new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("beerId") UUID beerId){
         beerService.deleteById(beerId);
    }
}
