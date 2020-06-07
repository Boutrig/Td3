 
#![image](https://user-images.githubusercontent.com/63153452/83965364-8445ca00-a8b3-11ea-98d6-4dff9c6deb66.png)

Présentation

Cette application a pour but de simuler le pokedex de Kanto.
Pas besoin de le remplir l'API "pokeAPI" le fait pour vous!

#Fonctionnement

Tout d'abord une liste a été créée sur la page d'accueil de l'application à l'aide d'une Recyclerview.
La RecyclerView le successeur de la ListView/GridView - Gain de performance + animations (ajout/suppression d'éléments) - 
Elle permet de gerer les listes d'element verticales et horizontales (LayoutManager) - (Optionel) Disponible en librairie de support



Ensuite, des fonctions API ont été utilisées pour lancer des requetes sur le serveur pokeapi.co
Une fois que l'on a eu des réponses a ces requêtes nous pouvons remplir la liste précédemment créée.

L'application peut égalemment marcher sans faire appel a l'API, lorsque l'application appelle pour la 1ere fois l'API le smartphone met en cache les données reçues graçe a API rest.
Une  fois ces données mises en cache l'application ne fera plus de requete a l'API sauf si le cache est vidé.

Une fois terminer l'application a été modifié afin de respecter le modèle MVC ( Modèle-vue-contrôleur ).
Le motif est composé de trois types de modules ayant trois responsabilités différentes : les modèles, les vues et les contrôleurs.

Un modèle (Model) contient les données à afficher.
Une vue (View) contient la présentation de l'interface graphique.
Un contrôleur (Controller) contient la logique concernant les actions effectuées par l'utilisateur.

Les principes SOLID ont été respecter ils sont destinés à rendre les conceptions de logiciels plus compréhensibles.

Responsabilité unique (Single responsibility principle)
une classe, une fonction ou une méthode doit avoir une et une seule responsabilité

Ouvert/fermé (Open/closed principle)
une entité applicative (class, fonction, module ...) doit être ouverte à l'extension, mais fermée à la modification

Substitution de Liskov (Liskov substitution principle)
une instance de type T doit pouvoir être remplacée par une instance de type G, tel que G sous-type de T, sans que cela ne modifie la cohérence du programme

Ségrégation des interfaces (Interface segregation principle)
préférer plusieurs interfaces spécifiques pour chaque client plutôt qu'une seule interface générale

Inversion des dépendances (Dependency inversion principle)
il faut dépendre des abstractions, pas des implémentations



#Rendu
Voici a quoi ressemble le pokdex une fois rempli.
![application](https://user-images.githubusercontent.com/63153452/83965329-3af57a80-a8b3-11ea-9674-305c8cb8e220.PNG)




