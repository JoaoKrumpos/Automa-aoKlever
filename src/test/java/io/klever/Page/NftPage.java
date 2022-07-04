package io.klever.Page;

import org.openqa.selenium.By;


public class NftPage {

    private By BotaoMenu = By.id("button-menu-icon");
    private By BotaoNft = By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/ul[2]/li[1]");
    private By BotaoFilter = By.xpath("/html/body/div/section/main/div[3]/div/div/div[1]/div[3]/div/button");
    private By BotaoagilityAffinity= By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/ul/div[1]/div/div[1]/div[2]");
    private By BotaoSlider=By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/ul/div[1]/div/div[2]/div/div/div[5]");
    private By BotaoApply= By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[3]/div/div/button[2]");
    private By BotaoAgilityattribute=By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/ul/div[2]/div/div[1]");
    private By BotaosliderAtributte=By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/ul/div[2]/div/div[2]/div/div/div[5]");


    public By getBotaoMenu() {
        return this.BotaoMenu = BotaoMenu;


    }

    public By getBotaoNft() {
        return BotaoNft;
    }

    public By getBotaoFilter() {

        return BotaoFilter;
    }

    public By getBotaoagilityAffinity() {

        return BotaoagilityAffinity;
    }

    public By getBotaoSlider() {
        return BotaoSlider;
    }

    public By getBotaoApply() {
        return BotaoApply;
    }

    public By getBotaoAgilityattribute() {
        return BotaoAgilityattribute;
    }

    public By getBotaosliderAtributte() {
        return BotaosliderAtributte;
    }
}
