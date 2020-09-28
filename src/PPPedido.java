public class PPPedido implements Pedidos{
    private String ItemPrincipal ;
    private String ItemSecundario ;
    private String ItemBebida ;
    private String ItemBrinquedo ;

    public PPPedido ( String ItemPrincipal , String ItemSecundario , String ItemBebida , String ItemBrinquedo) {
        this.ItemPrincipal = ItemPrincipal ;
        this.ItemSecundario = ItemSecundario ;
        this.ItemBebida = ItemBebida ;
        this.ItemBrinquedo = ItemBrinquedo ;

    }

    public String getItemPrincipal () {
        return this.ItemPrincipal ;
    }

    public String getItemSecundario () {
        return this.ItemSecundario ;
    }

    public String getItemBebida () {
        return this.ItemBebida ;
    }

    public String getItemBrinquedo () {
        return this.ItemBrinquedo ;
    }

    public String toString () {
        StringBuilder stringBuilder = new StringBuilder() ;
        stringBuilder.append (" Pedido PP") ;
        stringBuilder.append ("\n") ;

        stringBuilder.append (" ItemPrincipal:" + this.ItemPrincipal) ;
        stringBuilder.append ("\n") ;

        stringBuilder.append (" ItemSecundario:" + this.ItemSecundario) ;
        stringBuilder.append ("\n") ;

        stringBuilder.append (" ItemBebida:" + this.ItemBebida) ;
        stringBuilder.append ("\n") ;

        stringBuilder.append (" ItemBrinquedo:" + this.ItemBrinquedo) ;
        stringBuilder.append ("\n") ;

        return stringBuilder.toString () ;
    }
}
