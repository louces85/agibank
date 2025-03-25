# README - Testes Automatizados com JUnit e Selenium

## Descrição
Este projeto realiza testes automatizados utilizando JUnit e Selenium WebDriver para validar funcionalidades do blog do Agibank.

## Tecnologias Utilizadas
- **Java** 
- **JUnit 5** 
- **Selenium WebDriver** 
- **WebDriver Manager** 
- **Maven** 

## Configuração do Ambiente
1. Certifique-se de ter o **Java 8+** instalado.
2. Instale o **Maven** (caso ainda não tenha).
3. Clone este repositório:
   ```sh
   git clone https://github.com/louces85/agibank
   ```
4. Acesse a pasta do projeto:
   ```sh
   cd agibank
   ```
5. Execute os testes com o Maven:
   ```sh
   mvn test
   ```

## Casos de Teste

### Teste 1 - Verificação do Título da Página Inicial
- **Cenário:** Acessar a página [Agi Blog](https://blog.agibank.com.br/) e validar se o título da página é "Agi Blog | Tudo sobre empréstimo e educação financeira".
- **Passos:**
  1. Abrir o navegador e acessar `https://blog.agibank.com.br/`.
  2. Capturar o título da página.
  3. Comparar com o título esperado.
- **Resultado Esperado:** O título da página deve corresponder ao esperado.

### Teste 2 - Pesquisa no Blog
- **Cenário:** Realizar uma pesquisa no blog e validar se os resultados contêm a palavra-chave pesquisada.
- **Passos:**
  1. Acessar `https://blog.agibank.com.br/`.
  2. Localizar a pupa e inserir um termo de busca.
  3. Submeter a pesquisa.
  4. Verificar se os resultados exibidos contêm o termo pesquisado.
- **Resultado Esperado:** Os resultados da pesquisa devem conter a palavra-chave utilizada na busca.

## Dependências do Projeto (POM.xml)
O projeto está configurado para utilizar as seguintes dependências:

```xml
<dependencies>
    <!-- JUnit 5 -->
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <version>5.9.2</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-engine</artifactId>
        <version>5.9.2</version>
        <scope>test</scope>
    </dependency>
    
    <!-- Selenium WebDriver -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.10.0</version>
    </dependency>
    
    <!-- WebDriver Manager -->
    <dependency>
        <groupId>io.github.bonigarcia</groupId>
        <artifactId>webdrivermanager</artifactId>
        <version>5.6.3</version>
    </dependency>
</dependencies>
```

## Executando os Testes
Para rodar os testes, utilize o comando:
```sh
mvn test
```

Os resultados serão exibidos no console e nos relatórios gerados pelo JUnit.

![image](https://github.com/user-attachments/assets/511f7f81-9a3c-4977-a459-2551f101a9ad)


---

**Autor:** Fabiano Louzada Cesario 
**Data:** 25/03/2025

