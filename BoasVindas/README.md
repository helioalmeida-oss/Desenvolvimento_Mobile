# Boas Vindos — Atividade prática de Android

Atividade introdutória da disciplina **Desenvolvimento Mobile** (CEUB),
correspondente ao conteúdo da Aula 03/04: Android Studio, Kotlin, estrutura de
um projeto Android, `AndroidManifest.xml`, pasta `res`, layouts, `MainActivity`
e `setContentView(...)`.

## O que a tela faz

1. Mostra o título **Boas Vindos**.
2. Mostra a instrução **Digite Seu Nome**.
3. Oferece um campo de texto para o nome.
4. Oferece o botão **OK**.
5. Ao tocar em OK, exibe abaixo a saudação **Olá NOME!** com o nome digitado.

Exemplo: digitando `Gustavo`, a tela mostra `Olá Gustavo!`.

## Caminho didático

```
activity_main.xml  ->  componentes da interface (TextView, EditText, Button)
        |
MainActivity.kt    ->  setContentView(R.layout.activity_main)
        |
findViewById(...)  ->  liga o código aos componentes do XML
        |
btnOk.setOnClickListener { ... }  ->  lê o EditText e atualiza o TextView
```

## Arquivos principais

| Arquivo | Papel |
|---|---|
| `app/src/main/res/layout/activity_main.xml` | A tela (title, instrução, campo, botão, saudação) |
| `app/src/main/java/com/example/boasvindas/MainActivity.kt` | A lógica do clique |
| `app/src/main/res/values/strings.xml` | Todos os textos da tela |
| `app/src/main/AndroidManifest.xml` | Declara a `MainActivity` como tela inicial |

## Como executar

1. Abra **esta pasta** (`BoasVindas`) no Android Studio — não a raiz do repositório.
2. Aguarde o *Gradle Sync*.
3. Escolha um emulador ou dispositivo e clique em **Run**.

## Configuração

- Android nativo com Kotlin e Views/XML (sem Jetpack Compose)
- `compileSdk` / `targetSdk` 35, `minSdk` 26
- Android Gradle Plugin 8.7.3, Gradle 8.9, Kotlin 2.0.21
- Dependências: apenas `androidx.core:core-ktx` e `androidx.appcompat:appcompat`
