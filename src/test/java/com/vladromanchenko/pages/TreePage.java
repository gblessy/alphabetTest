package com.vladromanchenko.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by gblessy on 3/30/17.
 */
public class TreePage {

    public ElementsCollection treeLetters = $$(".x-grid-cell-inner.x-grid-cell-inner-treecolumn");
    public SelenideElement deleteButton = $(byText("Delete"));

    public void deleteAllLetters() {


        for(int i=1; i < 11; i++){

                treeLetters.get(i).click();
                treeLetters.get(i).contextClick();
                deleteButton.click();
        }
    }
    public void deleteLetter(String letter) {


            treeLetters.filterBy(Condition.cssClass("x-tree-node-text")).get(1).click();
            deleteButton.click();

    }


    public void assertLettersCount(int amountOfLetters) {
        treeLetters.shouldHaveSize(amountOfLetters);

    }
}
