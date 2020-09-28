public class Pedido1Builder implements PedidoBuilder{

    private String ItemPrincipal ;
    private String ItemSecundario ;
    private String ItemBebida ;
    private String ItemBrinquedo ;

    public void buildItemPrincipal(String ItemPrincipal) {
        this.ItemPrincipal = ItemPrincipal ;
    }

    public void buildItemSecundario(String ItemSecundario ) {
        this.ItemSecundario = ItemSecundario ;
    }

    public void buildItemBebida(String ItemBebida) {
        this.ItemBebida = ItemBebida ;
    }

    public void buildItemBrinquedo(String ItemBrinquedo ) {
        this.ItemBrinquedo = ItemBrinquedo;
    }

    public Pedidos getPedido() {
        return new PPPedido(ItemPrincipal , ItemSecundario , ItemBebida , ItemBrinquedo) ;
    }

}
