package com.vladromanchenko.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by gblessy on 3/30/17.
 */
public class GridPage {
    public ElementsCollection gridRows = $$("#gridview-1021-body tr");
    public SelenideElement addButton = $(By.linkText("Add"));




    public void assertLettersCount(int amountOfLetters) {
        gridRows.shouldHaveSize(amountOfLetters);

    }


    public void addLetter(String letterToAdd) {

    }

    public void deleteAllLetters() {

    }

    public void deleteLetter(String letterToDelete) {
        gridRows.findBy(Condition.cssClass("x-grid-row-checker")).click();
    }

}
