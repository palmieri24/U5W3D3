package alessiapalmieri.U5W3D3.Composite;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Book implements CompositeElem {
    private List<CompositeElem> elements;
    private List<String> authors;
    private double price;

    public Book() {
        this.elements = new ArrayList<>();
        this.authors = new ArrayList<>();
    }

    public void addElement(CompositeElem element) {
        elements.add(element);
    }

    public void addAuthor(String author) {
        authors.add(author);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("Book Information:");
        System.out.println("Authors: " + authors);
        System.out.println("Price: " + price);
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
