## **README**

```markdown
# Gerenciador de Links Úteis

Um sistema simples em Java para gerenciar links úteis com base em **tema** e **linkURL**, utilizando arquivos de texto para persistência de dados.

## Funcionalidades

- Adicionar links úteis com um tema e um linkURL.
- Editar links existentes.
- Excluir links do sistema.
- Listar todos os links armazenados.

## Como usar

1. Certifique-se de que você tenha o Java instalado no seu computador.
2. Clone este repositório ou copie o arquivo `GerenciadorLinks.java`.
3. Compile o arquivo com o seguinte comando:
   ```bash
   javac GerenciadorLinks.java
   ```
4. Execute o programa:
   ```bash
   java GerenciadorLinks
   ```

## Estrutura do Arquivo

Os links são armazenados no arquivo `links.txt`, no seguinte formato:
```
***Tema***
Tema do link
***LinkURL***
URL do link
```

## Menu do Sistema

Ao executar o programa, você verá o seguinte menu:

```
Menu:
1. Adicionar link
2. Editar link
3. Excluir link
4. Listar links
5. Sair
Escolha uma opção:
```

- **1. Adicionar link:** Permite inserir um novo link informando tema e linkURL.
- **2. Editar link:** Altere o tema ou linkURL de um link existente.
- **3. Excluir link:** Remove um link selecionado.
- **4. Listar links:** Exibe todos os links salvos.
- **5. Sair:** Encerra o programa e salva as alterações.

## Melhorias Futuras

- Validação de entrada para evitar erros do usuário.
- Funcionalidade de busca por tema.
- Adição de categorias aos links.
- Interface gráfica para facilitar o uso.

---


## **Backlog**

### **1. Versão 1.0.0 - Funcionalidades básicas** (Concluída ✅)
- [x] Criar um sistema CRUD para gerenciar links úteis.

### **2. Versão 1.1.0 - Melhorias e usabilidade** (Concluída ✅)
- [x] Salvar e carregar links de/para um arquivo texto (`links.txt`)

### **3. Versão 2.0.0 - Funcionalidades avançadas** (Concluída ✅)
- [x] Adicionar a funcionalidade para:
  - [x] Inserir novos links (tema e linkURL).
  - [x] Editar links existentes.
  - [x] Excluir links.
  - [x] Listar links.

---