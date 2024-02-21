package alessiapalmieri.U5W3D3.Composite;

public class Page implements CompositeElem {
    private String content;

    public Page(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println(content);
    }

    @Override
    public int getTotalPages() {
        return 1;
    }
}