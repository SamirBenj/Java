public class Message {


    private String value;
    public Message() {
        value = "" ;
    }
    public Message( String msg ) {
        this.value = msg ;
    }
    public void set( String msg ) {
        this.value = msg ;
    }
    public String get() {
        return this.value ;
    }

}
