package br.com.thymeleaf.config;

import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;

public class PaginationDecoratorRegistry {

    private static final PaginationDecoratorRegistry INSTANCE = new PaginationDecoratorRegistry();
    private final Map<String, PaginationDecorator> availableDecorators;

    private PaginationDecoratorRegistry() {

        final ServiceLoader<PaginationDecorator> loader = ServiceLoader.load(PaginationDecorator.class);
        availableDecorators = new HashMap<>();

        for (PaginationDecorator decorator : loader) {
            availableDecorators.put(decorator.getIdentifier(), decorator);
        }
    }

    public static PaginationDecoratorRegistry getInstance() {
        return INSTANCE;
    }

    public PaginationDecorator getDecorator(String identifier) throws PaginationDecoratorNotFoundException {
        if (!availableDecorators.containsKey(identifier)) {
            throw new PaginationDecoratorNotFoundException("Pagination decorator with identifier: " + identifier + " not found!");
        }
        return availableDecorators.get(identifier);
    }

}
