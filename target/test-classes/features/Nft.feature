@NFT
  Feature: Realizar busca de nnft atrvés de filtros
    eu como usuario ndo site quero filtrar nft e realizar uma busca
@NFT-1
    Scenario: Verificar retorno após aplicar filtro Agility Affinity

      Given : que qu esteja na pagina principal https://klever.io/
      And :clicar no campo NFT
      When :selecionar opção filter
      And : selecionar a opção Agility Affinity
      And :move o slide até 3
      When :clico em apply
      Then : valide a busca das nfts vom o filtro Agility Affinity
    @NFT-2
    Scenario: Verificar retorno após aplicar filtro Agility Attribute

      Given : que qu esteja na pagina principal https://klever.io/
      And :clicar no campo NFT
      When :selecionar opção filter
      And : selecionar a opção Agility Attribute
      And :mover o slide até 9 até 11
      When :clico em apply
      Then : valide a busca das nfts vom o filtro Agility Attribute

