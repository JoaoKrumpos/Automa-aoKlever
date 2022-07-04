package io.klever.Logic;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

public class PairsLogic {
//*****************************instancias do webdriver**********************************************//
    private WebDriver driver;
    WebDriverWait wait;

    //CONSTRUTOR DE CLASSE
    public PairsLogic() {

    }

    //*****************************METODOS PARA ABRIR O NAVEGADOR**********************************************//

    public void AbrirNavegador(String descpasso, String appurl,String navegador) {
        try {
            if(navegador == "CHROME"|| navegador == "FIREFOX" ){
                //NAVEGADOR CHROME CONFIGURAÇÕES
                if (navegador == "CHROME") {
                    System.out.println("--------------- Navegador  CHROME aberto com sucesso-----------------");

                    System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
                    driver = new ChromeDriver();
                    driver.get(appurl);
                    driver.manage().window().maximize();
                    System.out.println("Esee é o link da pagina " + driver.getCurrentUrl());
                    System.out.println("esse e´o titulo da pagina" + driver.getTitle());

                }else if (navegador == "FIREFOX") {
                    System.out.println("--------------- Navegador  FIREFOX aberto com sucesso-----------------");
                    //NAVEGADOR FIREFOX CONFIGURAÇOES

                    System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver.exe");
                    driver = new FirefoxDriver();
                    driver.get(appurl);
                    driver.manage().window().maximize();
                    System.out.println("Esee é o link da pagina " + driver.getCurrentUrl());
                    System.out.println("esse e´o titulo da pagina" + driver.getTitle());
                }



                }

            else{
                System.out.println("opção invalida escolha CHROME OU FIREFOX");
            }
            //EXCESSÃO
            }catch (Exception e){
            System.out.println("---------- erro ao tentar executar passo---------" + descpasso + "" + LocalDateTime.now());
        }
    }
    //*****************************METODO PARA CLICAR NOS ELEMENTOS**********************************************//
        public void ClicarNobotao(String descpasso, By elememto) {
        try {
            driver.findElement(elememto).click();
            //EXCESSÃO
        }catch (Exception e){
            System.out.println("-------------- erro ao tentar executar passo--------" + descpasso +"" + LocalDateTime.now());
        }



    }
    //*****************************METODOS PARA AGUARDAR O ELEMENTO APARECER NA TELA**********************************************//
    public void EsperaDinamica(String descpasso, By elemento) throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.presenceOfElementLocated(elemento));
            //EXCESSÃO
        }catch (Exception e){
            System.out.println("-------------- erro ao tentar executar passo--------" + descpasso +"" + LocalDateTime.now());
        }


    }
    public void Validacao(By elemento,String textoesperado ,String descpasso){
  Assert.assertEquals(textoesperado, driver.findElement(elemento).getText());

    }
    //*****************************METODO PARA ESCREVER TEXTO**********************************************//
    public void Escrever (By elemento, String tesxto ,String descpasso) {
        try {
            driver.findElement(elemento).sendKeys(tesxto);
            //EXCESSÃO
        } catch (Exception e) {
            System.out.println("-------------- erro ao tentar executar passo--------" + descpasso + "" + LocalDateTime.now());

        }
    }
    //*****************************METODOS PARA VALIDAÇÃO DOM PASSO COM SCREENSHOT**********************************************//
    public void Screenshot(String nome,String descpasso) throws IOException {
        try {
            TakesScreenshot scrshot = ((TakesScreenshot) driver);
            File scrFile = scrshot.getScreenshotAs(OutputType.FILE);
            File desFile = new File("target/Evidencias/" + nome + ".png");
            FileUtils.copyFile(scrFile, desFile);
         //EXCESSÃO
        }catch (Exception e){
            System.out.println("-------------- erro ao tentar executar passo--------" + descpasso +"" + LocalDateTime.now());
        }


    }

    public void encerrarTeste( String descpasso){
       driver.quit();
        System.out.println("o teste foi concluido");

    }
}



