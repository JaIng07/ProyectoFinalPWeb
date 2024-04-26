package com.pweb.tiendaonline.mappers;

import com.pweb.tiendaonline.dtos.pedido.PedidoDto;
import com.pweb.tiendaonline.dtos.pedido.PedidoToSaveDto;
import com.pweb.tiendaonline.dtos.pedido.PedidoToShowDto;
import com.pweb.tiendaonline.entities.Pedido;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PedidoMapper {

    Pedido pedidoDtoToPedidoEntity(PedidoDto pedidoDto);

    @Mapping(target = "cliente", ignore = true)
    PedidoDto pedidoEntityToPedidoDto(Pedido pedido);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "pago", ignore = true)
    @Mapping(target = "detalleEnvio",  ignore = true)
    @Mapping(target = "itemsPedido", expression = "java(new ArrayList<ItemPedido>())")
    @Mapping(target = "cliente.pedidos", expression = "java(new ArrayList<Pedido>())" )
    Pedido pedidoToSaveDtoToPedido(PedidoToSaveDto pedidoToSaveDto);

    PedidoToSaveDto pedidoEntityToPedidoToSaveDto(Pedido pedido);

    @Mapping(target = "pago", ignore = true)
    @Mapping(target = "detalleEnvio",  ignore = true)
    @Mapping(target = "itemsPedido",  ignore = true)
    @Mapping(target = "cliente.pedidos",  ignore = true)
    Pedido pedidoToShowDtoToPedidoEntity(PedidoToShowDto pedidoToShowDto);

    PedidoToShowDto pedidoEntityToPedidoToShow(Pedido pedido);

}
