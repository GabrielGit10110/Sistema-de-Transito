# Sistema de Gerenciamento de Tráfego

Este projeto é um sistema em Java para gerenciamento de dados de acidentes de trânsito. Ele foi desenvolvido como parte de um projeto acadêmico para demonstrar habilidades em manipulação de arquivos e estruturação de dados.

## Funcionalidades

O sistema permite:
* Registrar novos acidentes de trânsito, coletando informações como local, tipo de veículo, e gravidade.
* Gerar estatísticas detalhadas sobre os acidentes, como número total de ocorrências, acidentes por região, e tipos de veículos envolvidos.
* Persistência de dados: todas as informações são salvas em arquivos JSON, permitindo que os dados sejam carregados e utilizados em futuras execuções do programa.

## Tecnologias Utilizadas
* **Linguagem:** Java
* **Persistência de Dados:** JSON (para salvar e carregar as informações)
* **Interface:** Interface de linha de comando (CLI)

## Como Usar

### Pré-requisitos
* Java Development Kit (JDK) 8 ou superior instalado.

### Executando o Projeto
1. Clone o repositório para a sua máquina local:
   ```bash
   git clone [https://github.com/GabrielGit10110/Sistema-de-Transito.git](https://github.com/GabrielGit10110/Sistema-de-Transito.git)
2. Navegue até o diretório do projeto:

```bash
    cd Sistema-de-Transito
``` 
3. Compile os arquivos .java a partir da pasta src:

```bash
    javac -d build/classes src/transito/*.java
```

4. Execute o programa a partir da classe principal (Main):

```bash
   java -cp build/classes transito.Main
```

Nota: Se você preferir, pode criar um arquivo .jar executável. Consulte a documentação do javac e jar para mais detalhes.

Estrutura do Projeto
A estrutura de diretórios do projeto é a seguinte:

```
Sistema-de-transito/
├── src/
│   └── transito/
│       ├── Estatistica.java       # Classe para representar os acidentes.
│       ├── Principal.java           # Classe principal do programa.
│       └── ...                 # Outros arquivos do projeto.
├── data/
│   └── dados.txt          # Arquivo TXT para persistência dos dados.
├── README.md               # Este arquivo.
```

**Contribuição**
Contribuições são bem-vindas! Se você encontrar um bug ou tiver uma sugestão de melhoria, sinta-se à vontade para abrir uma issue ou enviar um pull request.

**Licença**
Este projeto está sob a licença MIT. Para mais detalhes, veja o arquivo LICENSE no repositório.

### Autor: Gabriel O. L. Silva
