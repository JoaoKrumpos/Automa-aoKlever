@pairs
Feature:Busca de pairs pelo campo de pesquisa

  Eu como usuario do site gostaria de buscar algumas pairs
@pairs1
  Scenario: Verificar se a pair KLV/BTC está sendo buscada pelo campo de pesquisa

    Given que eu esteja na tela principal https://klever.io/
    When realizar a busca por uma pair KLV/BTC
    Then valide se a pair KLV/BTC foi buscada

@pairs2
  Scenario:Verificar se a pair BTC/USDT está sendo buscada pelo campo de pesquisa

    Given que eu esteja na tela principal https://klever.io/
    When realizar a busca por uma pair BTC/USDT
    Then valide se a pair foi BTC/USDT buscada

@pairs3
  Scenario:Verificar se a pair KFI/KLV está sendo buscada pelo campo de pesquisa
    Given que eu esteja na tela principal https://klever.io/
    When realizar a busca por uma pair KFI/KLV
    Then valide se a pair  KFI/KLV foi buscada