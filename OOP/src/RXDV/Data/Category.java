package RXDV.Data;

public class Category {

    private String id;
    private boolean expesive;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null) {
            this.id = id;
        }
    }

    public boolean isExpesive() {
        return expesive;
    }

    public void setExpesive(boolean expesive) {
        this.expesive = expesive;

    }
}
