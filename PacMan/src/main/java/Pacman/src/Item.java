public class Item extends GameObject{
    private boolean isVizivel;

    public boolean isVizivel() {
        return isVizivel;
    }

    public void setVizivel(boolean isVizivel) {
        this.isVizivel = isVizivel;
    }

    public Item() {
    }

    public Item(int X, int Y, boolean isVizivel) {
        super(X, Y);
        this.isVizivel = isVizivel;
    }
}
