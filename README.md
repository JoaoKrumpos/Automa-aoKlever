





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

![image 1](https://user-images.githubusercontent.com/92833477/177235748-c6d620d4-f4ba-4f0f-8ce0-8b71eaecaa61.png)

Passo 2:Mova os arquivos dos navegadores para essa pasta ,ficando assim:

![image 2](https://user-images.githubusercontent.com/92833477/177235749-888d9c71-39a1-4256-804b-8a8c6c465955.png)






*Instalação Gerenciador de dependências Apache Maven*

Passo 1:Acessar o site e realizar o download do arquivo https://maven.apache.org/download.cgi



Passo 2:Selecionar o arquivo para dowload e efetuar a instalação


![image 3](https://user-images.githubusercontent.com/92833477/177235751-5174b208-293b-47c1-98f0-dd2cdc0b6047.png)


*Instalação do Intellij idea*



Passo 1: Entrar no site  do intelij Idea https://www.jetbrains.com/pt-br/idea/ e realizar o donwload,na aba BAIXAR selecione a opção Community

Passo 2: Com o intellij idea instalado e aberto,selecione a aba "Open"

 


![image 4](https://user-images.githubusercontent.com/92833477/177235752-0d89bfa7-f1de-4a06-9f83-76d1ece87a33.png)

Passo 3: Selecione a pasta dos projetos e clique em "OK" e aguarde até abrir

![image 5](https://user-images.githubusercontent.com/92833477/177235754-e2b0366e-903c-4d9d-bc77-6fb4c7ed4952.png)

Passo 4:Selecione " File" / "Settings"/Maven / 

![image 6](https://user-images.githubusercontent.com/92833477/177235755-06dc8617-f7ea-48a6-b314-b1378266c0f3.png)

Passo 5: Selecione (..) e aponte para o apache C:\Users\Seu usuario.\m2\wrapper\dists\apache-maven-3.5.2-bin.

Passo 6: Clique em "Apply"

*Instalando o plugin do cucumber*

Passo 1: Como i intelij IDEA aberto vá em >Open>Settings>Plugins e procure por Cucumber e Gherkin

![image 7](https://user-images.githubusercontent.com/92833477/177235756-245d6783-432c-4566-b691-b1fe53dc606e.png)

Passo2: Clique no "Checkbox " aguarde a instalação e reinicie a IDe

## ⚙️ Executando os testes

Para execução dos testes ao abrir o código ,precisamos apontar a pastas que estão os navegadores para os testes serem executados 

*Configurando o teste*

Passo 1:Vá na aba project e localize as seguintes classes Logic , ondé contém toda logica da automação 

![image class](https://user-images.githubusercontent.com/92833477/177238479-4d1b946b-71af-48e7-8c32-b0951671c7b6.png)

Passo 2: Vá no código em configurações de navegador , e verifique o caminho dos navegadores que baixamos o chromedriver e o geckodriver

![image 9](https://user-images.githubusercontent.com/92833477/177235758-ff156437-ba4c-4191-a037-b949739260c7.png)

![image 10](https://user-images.githubusercontent.com/92833477/177235759-7d954729-d26b-48e6-9a17-4d945b636ba0.png)

Obs: Verificar as duas classes

*Configuração de execução dos testes*

Na classe Runner , classe de execução dos nossos testes , existe um campo "Tags" onde vamos colocar a tag do teste que queremos rodar 

![image-runn](https://user-images.githubusercontent.com/92833477/177238728-37485d18-7fb0-4c7f-932b-e94c8aefdcf1.png)

Na  classe "Steps" é possivel configurar o navegador em que vai ser executado a automação

![img steps](https://user-images.githubusercontent.com/92833477/177238883-0fea76f5-250a-47ad-8791-6a8529a772be.png)

No arquivo ".feature "tem os cenarios e testes que podemos rodar por exemplo

![image 13](https://user-images.githubusercontent.com/92833477/177235763-ba3835c0-478a-4aa2-bdbe-50b3a98dc0a9.png)


Para rodar um teste escolha uma Tag , se quiser rodar a suite toda , coloque a prmeira 

como por exemplo para rodar essa feature toda , vamos colocar a tag dela na nossa classe de execução

![image 14](https://user-images.githubusercontent.com/92833477/177235764-e0d49770-d2fd-4df1-95db-b98e503086b2.png)


🔩 Analise os testes de ponta a ponta

​	Na aba "TAGS" contém evidências dos testes realizados, e se atentar ao console , pois o projeto contém tratamento de erros com excessões , dizendo o pq não funcionou

![image 16](https://user-images.githubusercontent.com/92833477/177235766-a850ffa1-fa55-476e-b8f4-f0be9dfeb0a2.png)


## 🛠️ Construído com

Mencione as ferramentas que você usou para criar seu projeto

* Selenium Webdriver- Framework de automação
* Maven- Gerente de Dependência
* Cucumber - Para criação de cenários
* Java - Linguagem de programação de alta 

## ✒️ Autores

Mencione todos aqueles que ajudaram a levantar o projeto desde o seu início

* * **Joao Victor Krumpos**- *Documentação* ,*codificação* 
