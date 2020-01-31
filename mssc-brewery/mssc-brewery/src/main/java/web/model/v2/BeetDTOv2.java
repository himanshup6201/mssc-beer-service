package web.model.v2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeetDTOv2 {
    private UUID ID;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private long upc;
}
