public interface PedidoBuilder {
    void buildItemPrincipal(String ItemPrincipal);
    void buildItemSecundario(String ItemSecundario);
    void buildItemBebida(String Bebida);
    void buildItemBrinquedo(String Brinquedo);

    Pedidos getPedido();


}
