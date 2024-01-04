package search;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SearchTests extends BaseTests {

    @Test()
    public void testSearch(){
        homePage.clickLupaButton();
        homePage.setInputSearch("teste");
        homePage.clickSearchButton();

        assertEquals(homePage.getTextSearchResult(),"Resultados da busca por: teste",
                "Retornou resultado incorreto.");
    }

    @Test
    public void testNoResultSearch(){
        homePage.clickLupaButton();
        homePage.setInputSearch("dsjdheudheudhjsdhwusjd");
        homePage.clickSearchButton();

        assertEquals(homePage.getTextSearchResult(),"Nenhum resultado",
                "Retornou resultado incorreto.");
    }


}
