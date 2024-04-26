package com.pweb.tiendaonline.mappers;

import com.pweb.tiendaonline.dtos.DetalleEnvio.DetalleEnvioDto;
import com.pweb.tiendaonline.dtos.DetalleEnvio.DetalleEnvioToSaveDto;
import com.pweb.tiendaonline.dtos.DetalleEnvio.DetalleEnvioToShowDto;
import com.pweb.tiendaonline.entities.DetalleEnvio;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface DetalleEnvioMapper {

    DetalleEnvio detalleEnvioDtoToDetalleEnvioEntity(DetalleEnvioDto detalleEnvioDto);

    DetalleEnvioDto detalleEnvioEntityToDetalleEnvioDto(DetalleEnvio detalleEnvio);

    @Mapping(target = "id", ignore = true)
    DetalleEnvio detalleEnvioToSaveDtoToDetalleEnvioEntity(DetalleEnvioToSaveDto detalleEnvioToSaveDto);

    DetalleEnvioToSaveDto detalleEnvioEntityToDetalleEnvioToSaveDto(DetalleEnvio detalleEnvio);

    @Mapping( target = "pedido", ignore = true)
    DetalleEnvio detalleEnvioToShowDtoToDetalleEnvioEntity(DetalleEnvioToShowDto detalleEnvioToShowDto);

    DetalleEnvioToShowDto detalleEnvioEntityToDetalleEnvioToShowDto(DetalleEnvio detalleEnvio);

}
