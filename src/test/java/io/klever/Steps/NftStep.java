package io.klever.Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.klever.Logic.NftLogic;
import io.klever.Page.NftPage;
import org.openqa.selenium.Keys;

import java.io.IOException;

public class NftStep {

    //CONSTRUTOR DE CLASSE
public NftStep (){

}
//*****************************INSTANCIAS DAS CLASSES LOGIC,PAGE**********************************************//

    NftLogic metodos = new NftLogic();
    NftPage el= new NftPage();

//*******************************************************************************************************************//

    @Given(": que qu esteja na pagina principal https:\\/\\/klever.io\\/")
    public void que_qu_esteja_na_pagina_principal_https_klever_io() throws InterruptedException, IOException {
        metodos.AbrirNavegador("Acessando navegador","https://klever.io/","FIREFOX");
        metodos.EsperaDinamica("Aguardando elemento MENU",el.getBotaoMenu());
        metodos.ClicarNobotao("Clicando no botao MENU",el.getBotaoMenu());
        metodos.Screenshot("acessandopagina","validando ");
    }



    @Given(":clicar no campo NFT")
    public void clicar_no_campo_nft() throws InterruptedException, IOException {
        metodos.EsperaDinamica("Aguardando elemento NFT",el.getBotaoNft());
        metodos.ClicarNobotao("Clicando no botao NFT",el.getBotaoNft());
        metodos.Screenshot("clicandoNFT","validando");
    }


    @When(":selecionar opção filter")
    public void selecionar_opção_filter() throws InterruptedException, IOException {
        metodos.EsperaDinamica("Aguaradando elemento FILTER",el.getBotaoFilter());
        metodos.ClicarNobotao("Clicando no botao FILTER",el.getBotaoFilter());
        metodos.Screenshot("clicandofilter","validando");
    }

    @When(": selecionar a opção Agility Affinity")
    public void selecionar_a_opção_agility_affinity() throws InterruptedException, IOException {
        metodos.EsperaDinamica("Aguardando elemento AGILITY",el.getBotaoagilityAffinity());
        metodos.ClicarNobotao("Clicando no elemento AGILITY",el.getBotaoagilityAffinity());
        metodos.Screenshot("clocandonaopçãoAGILITY","validando ");
    }

    @When(":move o slide até {int}")
    public void move_o_slide_até(Integer int1) throws InterruptedException, IOException {
        metodos.EsperaDinamica("Aguardar elemento",el.getBotaoSlider());
        metodos.ClicarNobotao("Clicando no slide",el.getBotaoSlider());
        metodos.Apertarteclado(Keys.ARROW_RIGHT,el.getBotaoSlider(),"apertar para o lado ");
        metodos.ClicarNobotao("Clicando no slide",el.getBotaoSlider());
        metodos.Apertarteclado(Keys.ARROW_RIGHT,el.getBotaoSlider(),"apertar para o lado ");
        metodos.Screenshot("arrastandoslide","validando");
    }

    @When(":clico em apply")
    public void clico_em_apply() throws IOException {
        metodos.ClicarNobotao("Clicando no APPLY",el.getBotaoApply());
        metodos.Screenshot("clicandoaPPLY","validando");
    }

    @Then(": valide a busca das nfts vom o filtro Agility Affinity")
    public void valide_a_busca_das_nfts_com_o_filtro_Agility_Affinity_selecionado() throws IOException {
        metodos.Screenshot("VALIDACAOFINALAFFINITY","validando ");
        metodos.encerrarTeste("teste encerrado ");

    }

    @When(": selecionar a opção Agility Attribute")
    public void selecionar_a_opção_agility_attribute() throws InterruptedException {
        metodos.EsperaDinamica("Aguardando elemento atribute",el.getBotaoAgilityattribute());
        metodos.ClicarNobotao("Clicando no botao" , el.getBotaoAgilityattribute());
    }

    @When(":mover o slide até {int} até {int}")
    public void mover_o_slide_até_até(Integer int1, Integer int2) {
        metodos.ClicarNobotao("Clicando no slide Atribbute",el.getBotaosliderAtributte());
        metodos.Apertarteclado(Keys.ARROW_RIGHT,el.getBotaosliderAtributte(),"apertar para o lado ");
        metodos.ClicarNobotao("Clicando no slide atributte",el.getBotaosliderAtributte());
        metodos.Apertarteclado(Keys.ARROW_RIGHT,el.getBotaosliderAtributte(),"apertar para o lado ");
    }


    @Then(": valide a busca das nfts vom o filtro Agility Attribute")
    public void valideABuscaDasNftsVomOFiltroAgilityAttribute() throws IOException {
        metodos.Screenshot("VALIDAÇÃOFINALATTRIBUTE","validando");
        metodos.encerrarTeste("teste encerrado ");

    }




    }






