public class GeradorPedidos {
    private PedidoBuilder pedidoBuilder;

    public GeradorPedidos ( PedidoBuilder pedidoBuilder ) {
        this.pedidoBuilder = pedidoBuilder ;
    }

    public Pedidos gerarPedidos() {
        this.pedidoBuilder.buildItemPrincipal("hambúrguer") ;

        this.pedidoBuilder.buildItemSecundario("Batata Frita") ;

        this.pedidoBuilder.buildItemBebida("Coca");

        this.pedidoBuilder.buildItemBrinquedo("Dinossaruo");

        Pedidos pedido = pedidoBuilder.getPedido();

        return pedido ;
    }


}
