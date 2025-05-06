
# 🎯 MyApplication – Guess the Number

## 📱 Sobre o App
**MyApplication** é um aplicativo simples e interativo desenvolvido como exercício educacional com **Jetpack Compose**, onde o jogador tenta adivinhar um número aleatório entre **1 e 10**.

O app informa se o número inserido é **muito baixo**, **muito alto**, ou se o jogador **acertou**. Ao acertar, o número de tentativas é registrado e o jogador é redirecionado automaticamente para a tela de **Ranking**.

## 🛠️ Tecnologias Utilizadas
- [Kotlin](https://kotlinlang.org/)
- [Jetpack Compose](https://developer.android.com/jetpack/compose)
- [Android Studio](https://developer.android.com/studio)

## 🎓 Propósito Educacional
Este projeto foi criado com fins didáticos, como parte da introdução ao desenvolvimento de interfaces com Jetpack Compose, abordando conceitos fundamentais como:

- `@Composable`
- `remember` e `mutableStateOf` para gerenciamento de estado
- Navegação manual entre telas com variáveis de estado
- Componentes da UI como:
  - `Text`, `TextField`, `Button`
  - `Column`, `Row`, `LazyColumn`
- Estruturas condicionais e manipulação da entrada do usuário

## 💡 Funcionalidades
✅ Geração aleatória de número secreto (entre 1 e 10)  
✅ Entrada de nome do jogador antes do jogo iniciar  
✅ Validação da entrada do usuário (somente números entre 1 e 10)  
✅ Feedback visual se o palpite é alto, baixo ou correto  
✅ Contador de tentativas exibido ao final  
✅ Ranking com os melhores resultados (ordenado pelo menor número de tentativas)  
✅ Reinício do jogo sem sair da tela atual  
✅ Navegação entre **Início**, **Jogo** e **Ranking**

## 📸 Captura de Tela *(Exemplo visual do app)*
>![image](https://github.com/user-attachments/assets/a1cc0fd2-bd87-478d-8ae2-f7ff6136b0f0)
  

## 🚀 Como Executar
1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/MyApplication.git
