package br.com.belemburitiricardo.gerenestobrejas.mapper;

import br.com.belemburitiricardo.gerenestobrejas.dto.BeerDTO;
import br.com.belemburitiricardo.gerenestobrejas.dto.BeerDTO.BeerDTOBuilder;
import br.com.belemburitiricardo.gerenestobrejas.entity.Beer;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-04T00:29:09-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Azul Systems, Inc.)"
)
public class BeerMapperImpl implements BeerMapper {

    @Override
    public Beer toModel(BeerDTO beerDTO) {
        if ( beerDTO == null ) {
            return null;
        }

        Beer beer = new Beer();

        beer.setId( beerDTO.getId() );
        beer.setName( beerDTO.getName() );
        beer.setBrand( beerDTO.getBrand() );
        if ( beerDTO.getMax() != null ) {
            beer.setMax( beerDTO.getMax() );
        }
        if ( beerDTO.getQuantity() != null ) {
            beer.setQuantity( beerDTO.getQuantity() );
        }
        beer.setType( beerDTO.getType() );

        return beer;
    }

    @Override
    public BeerDTO toDTO(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDTOBuilder beerDTO = BeerDTO.builder();

        beerDTO.id( beer.getId() );
        beerDTO.name( beer.getName() );
        beerDTO.brand( beer.getBrand() );
        beerDTO.max( beer.getMax() );
        beerDTO.quantity( beer.getQuantity() );
        beerDTO.type( beer.getType() );

        return beerDTO.build();
    }
}
