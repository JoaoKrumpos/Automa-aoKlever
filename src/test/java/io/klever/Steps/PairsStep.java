package io.klever.Steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.klever.Logic.PairsLogic;
import io.klever.Page.PairsPage;


import java.io.IOException;

public class PairsStep {

    //CONSTRUTOR DE CLASSE
public PairsStep(){

}
//*****************************INSTANCIAS DAS CLASSES LOGIC,PAGE**********************************************//
PairsLogic metodos = new PairsLogic();
PairsPage el = new PairsPage();
//*******************************************************************************************************************//
    @Given("que eu esteja na tela principal https:\\/\\/klever.io\\/")
    public void que_eu_esteja_na_tela_principal_https_klever_io() throws InterruptedException, IOException {
        metodos.AbrirNavegador("Acessando a pagina ","https://klever.io/","CHROME");
        metodos.EsperaDinamica("Aguardando elemento menu ficar visivel",el.getBotaoMenu());
        metodos.ClicarNobotao(" Clicando no elemento",el.getBotaoMenu());
        metodos.EsperaDinamica("Aguradando elemento Markets ficar visivel",el.getElementoMarkets());
        metodos.ClicarNobotao("Clicando no elemento Markets",el.getElementoMarkets());
    }

    @When("realizar a busca por uma pair KLV\\/BTC")
    public void realizar_a_busca_por_uma_pair_klv_btc() throws InterruptedException {
        metodos.EsperaDinamica("Aguardando elemento de pesquisar",el.getPesquisar());
        metodos.Escrever(el.getPesquisar(),"KLV" + "\uE027" + "BTC","escrevendo pair ");



    }

    @Then("valide se a pair KLV\\/BTC foi buscada")
    public void valide_se_a_pair_klv_btc_foi_buscada() throws InterruptedException, IOException {
        metodos.Screenshot("pair_KLVBTC","Tirando screenshot");
        metodos.encerrarTeste("Teste encerrado");
    }

    @When("realizar a busca por uma pair BTC\\/USDT")
    public void realizar_a_busca_por_uma_pair_btc_usdt() throws InterruptedException {
        metodos.EsperaDinamica("aguaradando elemento de pesquisar",el.getPesquisar());
        metodos.Escrever(el.getPesquisar(),"BTC"+ "\uE027"+"USDT","pesquisando por pair");
    }

    @Then("valide se a pair foi BTC\\/USDT buscada")
    public void valide_se_a_pair_foi_btc_usdt_buscada() throws IOException {
      metodos.Screenshot("pair_BTCUSD","Tirando screenshot");
        metodos.encerrarTeste("Teste encerrado");
    }

    @When("realizar a busca por uma pair KFI\\/KLV")
    public void realizar_a_busca_por_uma_pair_kfi_klv() throws InterruptedException {
        metodos.EsperaDinamica("aguaradando elemento de pesquisar",el.getPesquisar());
        metodos.Escrever(el.getPesquisar(),"KFI"+ "\uE027"+"KLV","pesquisando por pair");

    }

    @Then("valide se a pair  KFI\\/KLV foi buscada")
    public void valide_se_a_pair_kfi_klv_foi_buscada() throws IOException {
       metodos.Screenshot("pair_KFIKLVT","validando");
        metodos.encerrarTeste("Teste encerrado");
    }

    }





