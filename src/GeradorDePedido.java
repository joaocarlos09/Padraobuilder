public class GeradorDePedido {
    public static void main(String[] args) {
        PedidoBuilder pedidoBuilder = new Pedido1Builder() ;
        GeradorPedidos geradorPedidos= new GeradorPedidos(pedidoBuilder);
        Pedidos pedidos = geradorPedidos.gerarPedidos();
        System.out.println(pedidos) ;
    }
}
