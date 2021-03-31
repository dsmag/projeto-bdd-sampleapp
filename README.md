# <p align="center">Projeto Individual - Accenture QA</p>

<p align="center">
  <a href="#📝-descrição">Descrição</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#🚀-tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#⚙️-como-utilizar">Como utilizar</a>&nbsp;&nbsp;&nbsp;
</p>


## 📝 Descrição
### Criar um projeto em Selenium WebDrive (Java) e Cucumber usando Page objects
<br>

✅ Entrar no site http://sampleapp.tricentis.com/101/app.php;

✅ Preencher o formulário, aba “Enter Vehicle Data” e pressione next;

✅ Preencher o formulário, aba “Enter Insurant Data” e pressione next;

✅ Preencher o formulário, aba “Enter Product Data” e pressione next;

✅ Preencher o formulário, aba “Select Price Option” e pressione next;

✅ Preencher o formulário, aba “Send Quote” e pressione Send;

✅ Verificar a mensagem “Sending e-mail success!” na tela.

<br>
<br>

## 🚀 Tecnologias
<br>


- <b> [Java](https://www.java.com/pt-BR/) </b><br>
Linguagem de programação para desenvolvimento da aplicação <br>

- <b> [Maven](https://maven.apache.org/) </b><br>
Gerenciador de dependências para desenvolvimento da aplicação <br>

- <b> [Cucumber](https://cucumber.io/) </b><br>
Framework responsável por traduzir uma linguagem humana em código Java <br>

- <b> [Selenium](https://www.selenium.dev/) </b><br>
Framework responsável por fazer a integração do código Java com a linguagem Gherkin (Cucumber), abrindo o browser e fazendo o teste de comportamento <br>

<br>

<br>

## ⚙️ Como utilizar
<br>

- Instalar [Java](https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR)
- Instalar [JDK](https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html)
- Verificar se o JAVA_HOME está configurado

- Clone do projeto
```bash
git clone https://github.com/dsmag/projeto-final-accenture-qa
```

- Entrando na pasta do projeto
```bash
cd projeto-final-accenture-qa
```

- Configurando Selenium
    - Download do [Chrome WebDriver](https://chromedriver.chromium.org/downloads)
    - Colocar o arquivo desconpactado dentro da pasta <i> drive </i>, na raiz do projeto



- Limpando e validando Maven com Windows
```bash
./mvnw.cmd clean
```

- Executando teste com Windows
```bash
./test.bat
```