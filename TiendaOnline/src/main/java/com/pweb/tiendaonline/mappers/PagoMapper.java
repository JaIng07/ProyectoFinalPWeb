package com.pweb.tiendaonline.mappers;

import com.pweb.tiendaonline.dtos.pago.PagoDto;
import com.pweb.tiendaonline.dtos.pago.PagoToSaveDto;
import com.pweb.tiendaonline.dtos.pago.PagoToShowDto;
import com.pweb.tiendaonline.entities.Pago;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PagoMapper {

    Pago pagoDtoToPagoEntity(PagoDto pagoDto);

    PagoDto pagoEntityToPagoDto(Pago pago);

    Pago pagoToSaveDtoToPagoEntity(PagoToSaveDto pagoToSaveDto);

    PagoToSaveDto pagoEntityToPagoToSaveDto(Pago pago);

    Pago pagoToShowDtoToPagoEntity(PagoToShowDto pagoToShowDto);

    PagoToShowDto pagoEntityToPagoToShowDto(Pago pago);

}
