# Magic Trade Scanner para Android

Aplicativo Android para facilitar a avaliação e gerenciamento de trocas de cartas Magic: The Gathering, utilizando reconhecimento óptico de caracteres (OCR) para identificar cartas e consultar preços automaticamente.

## Objetivo

Permitir que jogadores digitalizem cartas de Magic usando a câmera do dispositivo, obtenham preços atualizados e organizem visualmente suas trocas, eliminando a necessidade de digitar manualmente o nome de cada carta.

## Funcionalidades

- **Reconhecimento OCR** do nome da carta via câmera.
- **Consulta automática** de preços (mínimo, médio e máximo) na TCGPlayer.
- **Organização visual** das cartas em pilhas com valores para facilitar a visualização da troca.
- **Download de preços via Wi-Fi** para evitar consumo excessivo de dados móveis.
- **Ferramentas para jogadores**, incluindo:
  - Contador de vida para partidas.
  - Exportação de coleções para arquivos `.DEK`.
  - Possível integração com TappedOut.
- **Gerenciamento de Pucatrade**, para acompanhar seu binder de trocas.

## Como usar

1. Abra o aplicativo no seu dispositivo Android.
2. Utilize a câmera para escanear a carta desejada.
3. Aguarde o reconhecimento e a consulta automática dos preços.
4. Organize suas cartas em pilhas para facilitar a negociação.
5. Utilize as ferramentas adicionais conforme necessário.

## Como compilar

Este projeto utiliza o **Gradle** para build.

1. Clone o repositório (após inicializar um novo Git, pois o antigo foi removido).
2. Abra o projeto no **Android Studio**.
3. Sincronize as dependências via Gradle.
4. Conecte um dispositivo Android ou utilize um emulador.
5. Compile e execute o aplicativo.

## Dependências principais

- **Android SDK**
- **Biblioteca Gson** para manipulação JSON (`app/libs/gson-2.2.4.jar`)
- **Bibliotecas OCR** (não detalhadas aqui, verificar código para integrações específicas)
- **Conexão com TCGPlayer API**

## Observações

- O projeto foi limpo do repositório Git anterior.
- Recomenda-se configurar um novo repositório Git para controle de versão.
- Variáveis sensíveis e configurações específicas devem ser mantidas em arquivos `.env` (não incluídos).
