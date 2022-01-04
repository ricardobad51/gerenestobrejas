package br.com.belemburitiricardo.gerenestobrejas.mapper;

import br.com.belemburitiricardo.gerenestobrejas.dto.BeerDTO;
import br.com.belemburitiricardo.gerenestobrejas.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface BeerMapper {
    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
