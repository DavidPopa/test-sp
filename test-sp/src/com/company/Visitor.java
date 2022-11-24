package com.company;

public interface Visitor {
    void visitPizza(Pizza pizza);

    void visitSalad(Salad salad);

	void visitPasta(Pizza pizza);

	void visitPizza(Pasta pasta);
}