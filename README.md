# Myaddress

A aplicação foi feita para realizar uma consulta a um api externa e retornar essas informaçẽos por meio de uma api. Para simular o retorno da integração, foi utilizado o container do mockoon.

## Sumário
- [Tecnologias](#tecnologias)
- [Features](#features)
- [Rodar Local](#rodar-local)
- [Como usar GitHub Copilot no IntelliJ](#como-usar-github-copilot-no-intellij)

## Tecnologias

- **Java 17**
- **Spring Boot**
- **Maven**
- **MySQL**
- **Docker**

## Features

- **Pesquisar endereço pelo cep:** O usuário passando o cep, consegue consultar as informações do endereço.
- **Consultar histórico de utilização**: O usuário consegue verificar quais consultas foram feitas e quais dados consultados.

## Rodar Local

**Pré-Requisito:** Docker e JAVA 17

Faça um clone do Projeto

```bash
  git clone  https://github.com/LUANSENA10/myaddress.git
```

Importe o projeto na sua idea de preferência

Execute a classe MyAddressApplication

Abaixo collections :

curl do endpoint de consultar endereço

```bash
  http GET http://localhost:8080/01001-000
```

curl do endpoint de histórico de pesquisa
```bash
  http GET http://localhost:8080/history
```

## Como usar GitHub Copilot no IntelliJ

O GitHub Copilot é um assistente de IA que ajuda a escrever código mais rapidamente. Aqui está como configurá-lo no IntelliJ IDEA para este projeto Spring Boot.

### Pré-requisitos

- IntelliJ IDEA (Community ou Ultimate)
- Conta GitHub com acesso ao GitHub Copilot
- Subscription ativa do GitHub Copilot

### Instalação e Configuração

#### 1. Instalar o Plugin GitHub Copilot

1. Abra o IntelliJ IDEA
2. Vá em **File** > **Settings** (ou **IntelliJ IDEA** > **Preferences** no macOS)
3. Navegue para **Plugins**
4. Clique na aba **Marketplace**
5. Pesquise por "GitHub Copilot"
6. Clique em **Install** no plugin oficial da GitHub
7. Reinicie o IntelliJ quando solicitado

#### 2. Autenticar com GitHub

1. Após reiniciar, vá em **File** > **Settings** > **Tools** > **GitHub Copilot**
2. Clique em **Sign in to GitHub**
3. Siga as instruções para autenticar com sua conta GitHub
4. Autorize o acesso do plugin

#### 3. Configurar Preferências

1. Em **Settings** > **Tools** > **GitHub Copilot**, você pode:
   - Ativar/desativar sugestões automáticas
   - Configurar teclas de atalho
   - Escolher linguagens específicas

### Uso no Projeto MyAddress

#### Para desenvolvimento Spring Boot/Java:

1. **Criando Controllers:**
   ```java
   // Digite um comentário descrevendo o que você quer
   // GET endpoint para buscar endereço por CEP
   // O Copilot irá sugerir a implementação completa
   ```

2. **Implementando Services:**
   ```java
   // Método para validar formato de CEP brasileiro
   // O Copilot entende padrões brasileiros
   ```

3. **Escrevendo Testes:**
   ```java
   // Teste unitário para validação de CEP
   // O Copilot pode gerar casos de teste completos
   ```

### Teclas de Atalho Úteis

- **Tab**: Aceitar sugestão atual
- **Esc**: Rejeitar sugestão
- **Alt + ]**: Próxima sugestão
- **Alt + [**: Sugestão anterior
- **Ctrl + Enter**: Abrir painel de sugestões

### Dicas para Melhor Uso

1. **Escreva comentários claros** descrevendo o que você quer implementar
2. **Use nomes descritivos** para variáveis e métodos
3. **Mantenha contexto** - o Copilot entende melhor com código relacionado aberto
4. **Para APIs REST**, descreva os endpoints em comentários
5. **Para Spring Boot**, mencione anotações como @RestController, @Service

### Exemplo Prático

```java
/**
 * Controller para gerenciar operações relacionadas a endereços
 * Endpoint para buscar endereço por CEP usando integração externa
 */
@RestController
@RequestMapping("/api/v1/address")
public class AddressController {
    
    // O Copilot irá sugerir a implementação baseada no contexto do projeto
}
```

### Troubleshooting

- **Sugestões não aparecem**: Verifique se está logado e com subscription ativa
- **Sugestões inadequadas**: Use comentários mais específicos
- **Performance lenta**: Verifique conexão com internet

Para mais informações, consulte a [documentação oficial do GitHub Copilot](https://docs.github.com/en/copilot).
