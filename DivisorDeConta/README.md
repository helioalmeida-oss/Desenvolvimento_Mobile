# Divisor de Conta

Atividade da disciplina **Desenvolvimento Mobile** (CEUB) — Aula 05, trabalho em
grupo. Tema do **Grupo 2: Divisor de Conta** (valor → pessoas → valor individual).

## Objetivo

Aplicativo Android desenvolvido em Kotlin que divide o valor de uma conta pela
quantidade de pessoas informada e mostra o valor individual na mesma tela.

## Funcionalidades

- informar o valor da conta;
- informar a quantidade de pessoas;
- dividir o valor ao tocar no botão;
- validar os dados (não divide por zero nem quebra com campos vazios);
- mostrar o valor individual.

## Como a tela funciona

```
Divisor de Conta

Valor da conta          [ 300 ]
Quantidade de pessoas   [ 4 ]

[ DIVIDIR CONTA ]

Cada pessoa paga: R$ 75,00
```

Se algum campo estiver vazio ou inválido, ou se a quantidade de pessoas não for
maior que zero, a tela mostra `Digite valores válidos.`

## Conteúdos da aula utilizados

| Conteúdo | Onde aparece |
|---|---|
| `MainActivity` / `ComponentActivity` | `MainActivity.kt` |
| `var` e `val` | variáveis da tela e do cálculo |
| `remember` + `mutableStateOf` | `valorConta`, `quantidadePessoas`, `resultado` |
| `TextField` | campos de entrada de dados |
| `Button` | botão **Dividir Conta** |
| Condição lógica (`if / else`) | validação antes de dividir |
| `Text` | exibição do resultado |

## Tecnologias

- Kotlin
- Jetpack Compose
- Android Studio
- Android

## Execução

1. Abrir **esta pasta** (`DivisorDeConta`) no Android Studio — não a raiz do repositório.
2. Aguardar a sincronização do Gradle.
3. Selecionar um emulador Android.
4. Executar o aplicativo.

## Configuração

- Android nativo com Kotlin e Jetpack Compose
- `compileSdk` / `targetSdk` 35, `minSdk` 26
- Android Gradle Plugin 8.7.3, Gradle 8.9, Kotlin 2.0.21

## Arquivo principal

`app/src/main/java/com/example/divisordeconta/MainActivity.kt` — contém a tela e
toda a lógica da divisão.
