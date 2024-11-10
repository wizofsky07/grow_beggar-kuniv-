package source.repository;

import java.util.List;

import source.model.product.Product;

public interface Repository <T extends Product> {
    public List<T> read();
}
