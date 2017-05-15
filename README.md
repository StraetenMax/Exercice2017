# Exercice2017
Veuillez trouver ci dessous le TP a rendre avant fin juin et qui entrera pour 2 points dans la note finale. A me renvoyer par mail sous forme fichiers.java ou dans un doc type word à mon adresse : stephane.gauquier@decathlon.com

1. Créer un package nommé ExoNoteCnam

2. Créer la classe Forme qui aura
- comme propriétés
surface de type int
couleur de type String
- comme méthodes :
afficher (fonction qui affichera dans la console ("Forme affichée")
masquer (fonction qui affichera dans la console ("Forme masquée")
description (fonction qui affichera dans la console ("La forme de surface xxxxxx est de couleur xxx " ou xxxxxx est la surface et yyy la couleur)

3. Créer la classe Quadrilatere héritant de la classe Forme qui aura en plus :
- comme propriété
type de type String(qui contient « convexe », « concave » ou « croisé »)
- comme méthodes :
afficher qui redéfinie celle de la classe mère : (fonction qui affichera dans la console ("Quadrilatere affiche")
description qui reprends la description héritée et ajoute en plus " qui est de type zzzzzzz" ou zzzzzz est le type

4. Créer la classe Carré héritant de la classe Quadrilatere qui aura en plus :
- comme propriétés :
tailleCote de type int
grand de type booléen qui dépends de la variable tailleCote (créer un mutateur qui l'alimente selon la règle (si tailleCote > 10 alors grand = true sinon grand =false)
- comme méthode :
estPlusGrandQue : méthode qui a un objet de type Carré en entrée et qui renvoi un booléen à True si l'objet appelant à un tailleCote > tailleCote de l'objet passé en paramètre. On le mets à false sinon
description qui reprends la description héritée et ajoute en plus " dont le coté mesure aaa cm" ou aaa est tailleCote

5. Créer la classe Rectangle héritant de la classe Quadriletere qui aura en plus :
- comme propriété :
aire de type int
- comme méthodes :
estDeMemeCouleurQue : méthode qui a un objet de type Reclangle en entrée et qui renvoi un booléen à True si l'objet appelant à une couleur = couleur de l'objet passé en paramètre. On le mets à false sinon
description qui reprends la description héritée et ajoute en plus " qui a une aire de aaa" ou aaa est aire

6. Créer une classe main qui va :

Instancier la classe forme en F1 avec une surface de 123 et une couleur à « blanc »

Instancier la classe Quadrilatere en Q1 avec une surface de 145, une couleur « Bleu » et un type « concave »
Instancier la classe Carré en C1 avec une surface de 127, une couleur « Vert », un type « convexe » et un coté de 4
Instancier la classe Carré en C2 avec une surface de 169, une couleur « Rouge », un type « croisé » et un coté de 6

Instancier la classe Rectangle en R1 avec une surface de 115, une couleur « Bleu », un type « convexe » et une aire de 18
Instancier la classe Rectangle en R2 avec une surface de 189, une couleur « Gris », un type « concave » et une aire de 22

Appeler la méthode description de F1
Appeler la méthode description de Q1
Appeler la méthode description de R1


Appeler la méthode estPlusGrandQue de C1 pour le comparer à C2
Appeler la méthode estDeMemeCouleurQue de R1 pour le comparer à R2 
