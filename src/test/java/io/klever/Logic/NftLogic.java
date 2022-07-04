package io.klever.Logic;

import io.klever.Page.NftPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

public class NftLogic {
//*****************************instancias do webdriver**********************************************//

    WebDriver driver;
    WebDriverWait wait;

    //CONSTRUTOR DE CLASSE
    public NftLogic() {

    }
    //*****************************METODOS PARA ABRIR O NAVEGADOR************************************

    public void AbrirNavegador(String descpasso, String appurl, String navegador) {
        try {
            if (navegador == "CHROME" || navegador == "FIREFOX") {
                //NAVEGADOR CHROME CONFIGURAÇÕES
                if (navegador == "CHROME") {
                    System.out.println("------------navegador CHROME aberto com sucesso------------ ");

                    System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
                    driver = new ChromeDriver();
                    driver.get(appurl);
                    driver.manage().window().maximize();
                    System.out.println("Esse é o link da pagina " + driver.getCurrentUrl());
                    System.out.println("esse e´o titulo da pagina" + driver.getTitle());

                } else if (navegador == "FIREFOX") {
                    System.out.println("------------navegador FIREFOX aberto com sucesso------------ ");
                     //NAVEGADOR FIREFOX CONFIGURAÇOES
                    System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver.exe");
                    driver = new FirefoxDriver();
                    driver.get(appurl);
                    driver.manage().window().maximize();
                    System.out.println("Esse é o link da pagina " + driver.getCurrentUrl());
                    System.out.println("esse e´o titulo da pagina" + driver.getTitle());
                }

            } else {
                System.out.println("opção invalida escolha CHROME OU FIREFOX");
            }
            //EXCESSÃO
        } catch (Exception e) {
            System.out.println("---------- erro ao tentar executar passo---------" + descpasso + "" + LocalDateTime.now());
        }
    }


    //*****************************METODO PARA CLICAR NOS ELEMENTOS**********************************************//
        public void ClicarNobotao (String descpasso, By elememto){
        try {
            driver.findElement(elememto).click();
            //EXCESSÃO
        }catch (Exception e){
            System.out.println("---------- erro ao tentar executar passo---------" + descpasso + "" + LocalDateTime.now());
        }


            }
    //*****************************METODOS PARA AGUARDAR O ELEMENTO APARECER NA TELA**********************************************//
            public void EsperaDinamica (String descpasso, By elemento) throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.presenceOfElementLocated(elemento));
            //EXCESSÃO
        }catch (Exception e){
            System.out.println("---------- erro ao tentar executar passo---------" + descpasso + "" + LocalDateTime.now());

        }


            }
    //*****************************METODOS PARA INTERARGIR COMK TECLADO**********************************************//
            public void Apertarteclado (Keys arrows, By elemento, String passo){
        try {
            driver.findElement(elemento).sendKeys(arrows);
            //EXCESSÃO
        }catch (Exception e ){
            System.out.println("---------- erro ao tentar executar passo---------" + passo + "" + LocalDateTime.now());

        }
        }

    //*****************************METODOS PARA VALIDAÇÃO DOM PASSO COM SCREENSHOT**********************************************//
            public void Screenshot (String nome,String descpasso) throws IOException {
        try {
            TakesScreenshot scrshot = ((TakesScreenshot) driver);
            File scrFile = scrshot.getScreenshotAs(OutputType.FILE);
            File desFile = new File("target/Evidencias/" + nome + ".png");
            FileUtils.copyFile(scrFile, desFile);
            //EXCESSÃO
        }catch (Exception E ){
            System.out.println("---------- erro ao tentar executar passo---------" + descpasso + "" + LocalDateTime.now());

        }

            }
    public void encerrarTeste( String descpasso){
        driver.quit();
        System.out.println("o teste foi concluido");

    }
        }