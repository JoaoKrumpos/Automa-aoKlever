 Automação de testes klever

## 🚀 Começando

Automação de testes web , cujo o objetivo testar e analisar duas funcionalidades da aplicação web de criptomoedas Klever

Essas instruções permitirão que você obtenha uma cópia do projeto em operação na sua máquina local para fins de desenvolvimento e teste.

### 📋 Pré-requisitos

-  intellij idea instalado na maquina  

-  plugin do cucumber instalado no intellij idea
- Arquivo dos nvegadores baixados (Google Chrome driver e Geckodriver)
- Uma pasta para direcionar os arquivos de navegador
- Gerenciador de dependências Apache Maven





### 🔧 Instalação

*Instalação dos navegadores para rodar os testes* 

Passo 1:A cessar o link https://chromedriver.storage.googleapis.com/index.html?path=103.0.5060.53/ e realizar o download do Chromedriver. Em seguida acesse esse outro link https://github.com/mozilla/geckodriver/releases e realize o dowload do Geckodriver na aba"Assets" e realize o dowload

*Direcionamento dos arquivos do navegador para somente uma pasta do sistema*

Passo 1: Com os navegadores baixados ,crie uma pasta chamada Drives no Disco local C:

![image-20220704141925776](C:\Users\joao.krumpos\AppData\Roaming\Typora\typora-user-images\image-20220704141925776.png)

Passo 2:Mova os arquivos dos navegadores para essa pasta ,ficando assim:

![image-20220704142306497](C:\Users\joao.krumpos\AppData\Roaming\Typora\typora-user-images\image-20220704142306497.png)







*Instalação Gerenciador de dependências Apache Maven*

Passo 1:Acessar o site e realizar o download do arquivo https://maven.apache.org/download.cgi



Passo 2:Selecionar o arquivo para dowload e efetuar a instalação

![image-20220704145648531](C:\Users\joao.krumpos\AppData\Roaming\Typora\typora-user-images\image-20220704145648531.png)



*Instalação do Intellij idea*



Passo 1: Entrar no site  do intelij Idea https://www.jetbrains.com/pt-br/idea/ e realizar o donwload,na aba BAIXAR selecione a opção Community

Passo 2: Com o intellij idea instalado e aberto,selecione a aba "Open"

 



![image-20220704135211605](C:\Users\joao.krumpos\AppData\Roaming\Typora\typora-user-images\image-20220704135211605.png)

Passo 3: Selecione a pasta dos projetos e clique em "OK" e aguarde até abrir

![image-20220704150712511](C:\Users\joao.krumpos\AppData\Roaming\Typora\typora-user-images\image-20220704150712511.png)

Passo 4:Selecione " File" / "Settings"/Maven / 

![image-20220704151256091](C:\Users\joao.krumpos\AppData\Roaming\Typora\typora-user-images\image-20220704151256091.png)

Passo 5: Selecione (..) e aponte para o apache C:\Users\Seu usuario.\m2\wrapper\dists\apache-maven-3.5.2-bin.

Passo 6: Clique em "Apply"

*Instalando o plugin do cucumber*

Passo 1: Como i intelij IDEA aberto vá em >Open>Settings>Plugins e procure por Cucumber e Gherkin

![image-20220704165648012](C:\Users\joao.krumpos\AppData\Roaming\Typora\typora-user-images\image-20220704165648012.png)

Passo2: Clique no "Checkbox " aguarde a instalação e reinicie a IDe

## ⚙️ Executando os testes

Para execução dos testes ao abrir o código ,precisamos apontar a pastas que estão os navegadores para os testes serem executados 

*Configurando o teste*

Passo 1:Vá na aba project e localize as seguintes classes Logic , ondé contém toda logica da automação 

![image-20220704152854406](C:\Users\joao.krumpos\AppData\Roaming\Typora\typora-user-images\image-20220704152854406.png)

Passo 2: Vá no código em configurações de navegador , e verifique o caminho dos navegadores que baixamos o chromedriver e o geckodriver

![image-20220704153312975](C:\Users\joao.krumpos\AppData\Roaming\Typora\typora-user-images\image-20220704153312975.png)

![image-20220704153450182](C:\Users\joao.krumpos\AppData\Roaming\Typora\typora-user-images\image-20220704153450182.png)

Obs: Verificar as duas classes

*Configuração de execução dos testes*

Na classe Runner , classe de execução dos nossos testes , existe um campo "Tags" onde vamos colocar a tag do teste que queremos rodar 

![image-20220704155348061](C:\Users\joao.krumpos\AppData\Roaming\Typora\typora-user-images\image-20220704155348061.png)

Na  classe "Steps" é possivel configurar o navegador em que vai ser executado a automação

![image-20220704160531792](C:\Users\joao.krumpos\AppData\Roaming\Typora\typora-user-images\image-20220704160531792.png)

No arquivo ".feature "tem os cenarios e testes que podemos rodar por exemplo

![image-20220704162433570](C:\Users\joao.krumpos\AppData\Roaming\Typora\typora-user-images\image-20220704162433570.png)



Para rodar um teste escolha uma Tag , se quiser rodar a suite toda , coloque a prmeira 

como por exemplo para rodar essa feature toda , vamos colocar a tag dela na nossa classe de execução

![image-20220704162843484](C:\Users\joao.krumpos\AppData\Roaming\Typora\typora-user-images\image-20220704162843484.png)

🔩 Analise os testes de ponta a ponta

​	Na aba "TAGS" contém evidências dos testes realizados, e se atentar ao console , pois o projeto contém tratamento de erros com excessões , dizendo o pq não funcionou

![image-20220704163622127](C:\Users\joao.krumpos\AppData\Roaming\Typora\typora-user-images\image-20220704163622127.png)



## 🛠️ Construído com

Mencione as ferramentas que você usou para criar seu projeto

* Selenium Webdriver- Framework de automação
* Maven- Gerente de Dependência
* Cucumber - Para criação de cenários
* Java - Linguagem de programação de alta 

## ✒️ Autores

Mencione todos aqueles que ajudaram a levantar o projeto desde o seu início

* * **Joao Victor Krumpos**- *Documentação* ,*codificação* 



















































