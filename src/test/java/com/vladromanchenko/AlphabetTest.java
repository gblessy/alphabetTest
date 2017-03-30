package com.vladromanchenko;

import com.codeborne.selenide.Configuration;
import com.vladromanchenko.pages.GridPage;
import com.vladromanchenko.pages.TreePage;
import com.vladromanchenko.testConfigs.BaseTest;
import org.junit.Test;


import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

/**
 * Created by gblessy on 3/30/17.
 */
public class AlphabetTest extends BaseTest{



    TreePage tree = new TreePage();
    GridPage grid = new GridPage();

    @Test
    public void smokeTest(){
    open("https://gblessy.github.io/Alphabet/");
//    tree.deleteAllLetters();
//       // tree.deleteLetter("A");
//    tree.assertLettersCount(0);
//    grid.drugLetter();
    grid.assertLettersCount(16);
//    tree.assertLettersCount(1);
//    tree.addLetter("H");
//    tree.assertLettersCount(2);
//    tree.deleteLetter("H");
//    tree.assertLettersCount(1);
//    tree.drugLetter();
//    grid.assertLettersCount(16);
//      grid.deleteAllLetters();
      grid.deleteLetter("a");
//    grid.assertLettersCount(0);
      //grid.addLetter("K");
//    grid.assertLettersCount(1);
    }
}
