# ☕ Java Bases

Katas Java sur les bases du langage, avant la programmation orientée objet.

## 📝 Description
*Katas réalisés dans le cadre de la formation Concepteur Développeur d'Applications à Ada Tech School (spécialisation full-stack).*

Ce dépôt suit mon apprentissage de Java. Chaque kata est un exercice court qui fait pratiquer une notion précise du langage.

## 📚 Katas

| N° | Kata                 | Notions pratiquées                                                                             |
|----|----------------------|------------------------------------------------------------------------------------------------|
| 01 | Types primitifs      | `int`, `double`, `char`, `boolean`, division entière, modulo, cast                             |


## 🛠️ Technologies et outils
- Java 21
- Maven
- IntelliJ IDEA

## 📂 Structure du projet

```
java-bases/
├── src/main/java/com/ada/spedev/lucille/katas/
│   └── KataXX_Nom.java      ← un fichier par kata
├── pom.xml
└── README.md
```

## 🚀 Lancer un kata

**Prérequis :** JDK 21 ou plus récent.

**Avec IntelliJ IDEA**
1. Cloner le dépôt : `git clone https://github.com/Lucille-R/java-bases.git`
2. Ouvrir le dossier `java-bases` dans IntelliJ (le projet Maven est détecté automatiquement).
3. Ouvrir un kata dans `src/main/java/com/ada/spedev/lucille/katas/` et lancer sa méthode `main`.

**En ligne de commande** (Maven installé)
```bash
mvn compile
java -cp target/classes com.ada.spedev.lucille.katas.Kata01_Types
```

## 👤 Auteure

- **Lucille Richard** · [LinkedIn](https://www.linkedin.com/in/lucille-richard) · Étudiante chez Ada Tech School

## 🎓 Contexte

Projet réalisé dans un cadre pédagogique · Ada Tech School.