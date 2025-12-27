# MagicTradeScanner

O MagicTradeScanner é um aplicativo Android projetado para agilizar o processo de avaliação e negociação de cartas de Magic: The Gathering. Utilizando Reconhecimento Óptico de Caracteres (OCR), o app permite que os jogadores digitalizem cartas físicas com a câmera do dispositivo para obter preços de mercado atuais instantâneos da TCGPlayer, eliminando a necessidade de digitação manual.

## Funcionalidades Principais

- **Digitalização via OCR**: Identifica automaticamente nomes de cartas diretamente da câmera.
- **Consulta de Preços em Tempo Real**: Busca preços mínimo, médio e máximo da TCGPlayer.
- **Gerenciamento de Trocas**: Organize visualmente cartas em pilhas de negociação com totais calculados.
- **Eficiência de Dados**: Baixa dados de preços via Wi-Fi para economizar seu plano de dados móvel.
- **Ferramentas para Jogadores**:
  - Contador de vida para partidas.
  - Exportação de coleções para o formato `.DEK`.
  - Gerenciamento de binders do Pucatrade.
  - Possível integração com o TappedOut.

## Como Começar

### Pré-requisitos

- Android Studio (versão mais recente recomendada).
- Android SDK instalado.
- Um dispositivo Android ou emulador para testes.

### Instalação e Compilação

1. **Clonar o Repositório**: Como o histórico do Git anterior foi removido, é necessário iniciar um novo repositório.
    bash
    git init
    git remote add origin <url-do-seu-novo-repositorio>
    

2. **Abrir no Android Studio**:
    - Inicie o Android Studio.
    - Selecione "Open an Existing Project" (Abrir Projeto Existente).
    - Navegue até o diretório clonado e clique em "OK".

3. **Sincronizar Dependências**:
    - O Android Studio irá solicitar a sincronização do projeto Gradle.
    - Certifique-se de que a biblioteca `gson-2.2.4.jar` está presente na pasta `app/libs/`.

4. **Configurar API e Dados Sensíveis**:
    - **Importante**: Não commite chaves de API ou configurações sensíveis diretamente no código.
    - Recomenda-se o uso de `local.properties` ou métodos seguros de injeção de variáveis de ambiente.

5. **Executar o Aplicativo**:
    - Conecte seu dispositivo Android via USB (com Opções de Desenvolvedor ativadas) ou inicie um Emulador.
    - Clique no botão "Run" (Botão Verde de Play) no Android Studio.

## Estrutura do Projeto

- **Câmera & OCR**: Lida com a captura de imagem e lógica de reconhecimento de texto.
- **Cliente de API**: Conecta-se à TCGPlayer para buscar preços das cartas.
- **UI/UX**: Gerencia a organização visual das pilhas de trocas e configurações.
- **Ferramentas**: Contém a lógica para o Contador de Vida e recursos de Exportação de Arquivos.

## Contribuindo

1. Faça um Fork do repositório.
2. Crie uma branch para sua feature (`git checkout -b feature/NovaFeature`).
3. Commite suas alterações (`git commit -m 'Adicionando NovaFeature'`).
4. Push para a branch (`git push origin feature/NovaFeature`).
5. Abra um Pull Request.

## Licença

Distribuído sob a licença MIT. Veja o arquivo `LICENSE` para mais informações.
