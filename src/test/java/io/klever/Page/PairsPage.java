package io.klever.Page;


import org.openqa.selenium.By;



public class PairsPage {


    //*****************************ELEMENTOS ENCAPSULADOS**********************************************//
private By BotaoMenu = By.id("button-menu-icon");
private By elementoMarkets = By.cssSelector("ul.ant-menu-inline:nth-child(1) > li:nth-child(1)");
private By Pesquisar = By.className("ant-input");
//*****************************METODOS PUBLICOS DE ACESSO AOS ELEMENTOS**********************************************//
    public By getBotaoMenu() {
        return BotaoMenu;
    }

    public By getElementoMarkets() {
        return elementoMarkets ;
    }

    public By getPesquisar() {
        return Pesquisar;
    }



}

