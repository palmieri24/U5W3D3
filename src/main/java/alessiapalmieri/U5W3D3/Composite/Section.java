package alessiapalmieri.U5W3D3.Composite;

import java.util.ArrayList;
import java.util.List;

public class Section implements CompositeElem {
    private String title;
    private List<CompositeElem> elements;

    public Section(String title) {
        this.title = title;
        this.elements = new ArrayList<>();
    }

    public void addElement(CompositeElem element) {
        elements.add(element);
    }

    @Override
    public void print() {
        System.out.println("Section: " + title);
        for (CompositeElem element : elements) {
            element.print();
        }
    }

    @Override
    public int getTotalPages() {
        int totalPages = 0;
        for (CompositeElem element : elements) {
            totalPages += element.getTotalPages();
        }
        return totalPages;
    }
}
