package com.pweb.tiendaonline.repositories;

import com.pweb.tiendaonline.entities.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {

    // Buscar items pedido por Pedido Id
    List<ItemPedido> findByPedidoId(Long pedidoId);

    // Buscar items pedido por Producto Id
    List<ItemPedido> findByProductoId(Long productoId);

    // Calcular la suma del total de ventas para un producto
    @Query("SELECT SUM(ip.cantidad * ip.precioUnitario) FROM ItemPedido ip WHERE ip.producto.id = ?1")
    Double getTotalVentasByProductId(Long productId);

}
