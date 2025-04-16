# 🚀 DynamicNickGenerator

**DynamicNickGenerator** é uma biblioteca **open-source** em **Java** para gerar nomes (apelidos) dinâmicos e altamente personalizáveis.  
Seja para jogos, redes sociais ou aplicações criativas, esta biblioteca é perfeita para criar apelidos únicos e estilizados! 🎨✨

---

## 🌟 Funcionalidades Principais

### 📌 **Gêneros Suportados**
- `Masculino`
- `Feminino`
- `Unissex`

### 🌍 **Idiomas**
- Suporte para múltiplos idiomas configurados através de `LanguageType.Language`.

### 🔡 **Opções de Formatação (Case)**
- 🟢 **UPPERCASE**: Todo o nome em maiúsculas.
- 🔵 **LOWERCASE**: Todo o nome em minúsculas.
- 🟠 **DEFAULT**: Primeira letra maiúscula, resto minúsculo.
- 🎲 **RANDOM**: Letras alternadas aleatoriamente entre maiúsculas e minúsculas.

### 🛠️ **Caracteres Customizados**
- Adicione manualmente caracteres personalizados entre o prefixo e o sufixo.

### 🧩 **Extensível**
- Facilidade para adicionar novos prefixos e sufixos com `GenderPrefixes` e `GenderSuffixes`.


---

## 🖼️ Interface Gráfica (Opcional)

Se você deseja integrar ou visualizar o DynamicNickGenerator com uma interface gráfica, aqui está um exemplo de como pode ser implementado:

![Interface Gráfica](https://i.imgur.com/L5jOUTf.png)

### Recursos da Interface:
- **Idioma**: Escolha o idioma para os nomes gerados.
- **Formatos**: Selecione o formato do texto (maiúsculas, minúsculas, etc.).
- **Gênero**: Defina o gênero dos nomes.
- **Quantidade**: Número de nomes a serem gerados.
- **Adicional**: Adicione caracteres personalizados.

---

## 🛠️ Estrutura do Projeto

O projeto está organizado por pacotes para facilitar a manutenção e extensibilidade:

### 📂 Pacotes e Classes

- **`DynamicNickGenerator`**:  
  A classe principal que gerencia a geração de nomes.
  
- **Pacote `Gender`**:
  - `Gender`: Enum para definir gêneros (`MALE`, `FEMALE`, `UNISEX`).
  - `GenderPrefixes`: Fornece prefixos baseados no gênero e idioma.
  - `GenderSuffixes`: Fornece sufixos baseados no gênero e idioma.

- **Pacote `Language`**:
  - `LanguageType`: Enum para especificar diferentes idiomas.

- **Pacote `Options`**:
  - `CaseOption`: Enum para definir as opções de formatação (`UPPERCASE`, `LOWERCASE`, `DEFAULT`, `RANDOM`).

---

## 📋 Como Funciona

A geração de nomes segue três etapas principais:  
1️⃣ **Prefixo**: Escolhido aleatoriamente com base no gênero e idioma.  
2️⃣ **Caracteres Customizados**: Inseridos entre o prefixo e o sufixo, se fornecidos.  
3️⃣ **Sufixo**: Escolhido aleatoriamente com base no gênero e idioma.  

Por fim, o nome é formatado de acordo com a opção de formatação escolhida.

---

## 💻 Exemplo de Uso

```java
import com.Github.JohnnyPlayy.NickGenerator.DynamicNickGenerator;
import com.Github.JohnnyPlayy.NickGenerator.Gender.Gender;
import com.Github.JohnnyPlayy.NickGenerator.Language.LanguageType;
import com.Github.JohnnyPlayy.NickGenerator.Options.CaseOption;

public class Main {
    public static void main(String[] args) {

        String generatedName = DynamicNickGenerator.generateRandomName(

            CaseOption.Option.UPPERCASE,

            LanguageType.Language.ENGLISH,

            " ",

            Gender.UNISEX
        );

        System.out.println("Nome Gerado: " + generatedName);
    }
}
```

### 🖨️ Saída Exemplo
```
Nome Gerado: ALEXYX
```

---

## 🛠️ Avaliação de Código

Se você deseja garantir que o código siga as melhores práticas, você pode utilizar ferramentas de análise de código estático, como Checkstyle, PMD ou SpotBugs, para revisar o código do projeto.  
Além disso, siga as diretrizes abaixo para contribuir:

1. **Manutenção do Código**:
   - Certifique-se de que os métodos sejam curtos e realizem apenas uma tarefa.
   - Utilize nomes descritivos para variáveis e métodos.

2. **Cobertura de Testes**:
   - Adicione testes unitários para qualquer alteração feita.
   - Garanta cobertura de testes para novos casos de uso.

3. **Boas Práticas**:
   - Siga o padrão de codificação da comunidade Java, como o guia de estilo do Google.
   - Evite códigos duplicados e otimize loops e operações.

---

## 🚀 Instalação

1. **Clone o Repositório**:  
   ```bash
   git clone https://github.com/JohnnyPlayy/DynamicNickGenerator.git
   ```

2. **Importe no Seu Projeto**:  
   - Adicione os arquivos `.java` diretamente ao seu projeto ou configure como uma biblioteca.

3. **Compile o Código**:  
   ```bash
   javac -d bin src/com/Github/JohnnyPlayy/NickGenerator/*.java
   ```

4. **Execute o Programa**:  
   ```bash
   java -cp bin Main
   ```

---

## 🤝 Contribuindo

Contribuições são **super bem-vindas**! 💡✨  
Se você deseja ajudar a melhorar este projeto, siga os passos abaixo:

1. Faça um **fork** do repositório.  
2. Crie uma **branch** para a sua feature:  
   ```bash
   git checkout -b minha-feature
   ```
3. Faça suas alterações e adicione commits.  
4. Envie um **pull request** para revisão.

---

## 📜 Licença

Este projeto está licenciado sob a **MIT License**.  
Veja o arquivo [LICENSE](./LICENSE) para mais detalhes.

---

## 📬 Contato

[![](https://dcbadge.limes.pink/api/server/YSy4deHbfk)](https://discord.gg/YSy4deHbfk)

---
