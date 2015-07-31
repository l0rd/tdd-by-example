## Iteration 00 
C'est ce qu'on donne au stagiaires: un projet maven, une classe de test avec un TODO.md qui contient les liste des 
taches à réaliser.

## Iteration 01 - Concepts : Child test et Fake It 

### Mise a jour de la TODO list
Ajouter une nouvelle ligne *Print an integer*

### RED 
* Créer le premier test `should_print_string_representation_when_passing_an_integer` : on crée un objet `FizzBuzz`, 
on appelle la méthode `print()` avec l'entier 1 comme paramètre et on vérifie qu'elle retourne bien la chaine de 
charactères "1".

### GREEN 
* Fix des problèmes de compilation : création de la classe `FizzBuzz` et la méthode `print()` qui retourne `null`
* Fix du test : la méthode `print()` retourne la chaîne de charactère 1

### REFACTOR
* Eliminiation de la duplication : la méthode `print()` retourne `Integer.toString(i)`

## Iteration 02 - Concepts : Triangulation et Extract Method

### RED
* Créer le deuxième test `should_print_string_representation_when_passing_an_integer` : on crée un objet `Fizzbuzz`, 
on appelle la methode `print()` avec l'entier 3 comme paramètre et on vérifie qu'elle retourne bien "fizz".

### GREEN
* On *fake* comme avant (`if (i == 3)`) pour passer à green

### RED
* On rajoute un nouveau cas avec 6 comme paramètre pour faire de la triangulation

### GREEN
* Maintenant qu'on a deux cas on peut généraliser (`if (i%3 == 0)`) 

### REFACTOR
* Pour rendre plus lisible la méthode `print()` on extrait la methode `isMultipleOfThree()`

## Iterations 03 et 04 - Concepts : Triangulation et Extract Method
* Ces deux itérations se déroulent comme la 02 et on implémente les tests 
`should_print_buzz_when_passing_a_multiple_of_five` et `should_print_fizzbuzz_when_passing_a_multiple_of_three_and_five`

## Iteration 05 - Obvious Implementations et Hide Method

### RED
* Créer le dernier test `should_print_valid_string_when_running_fizzbuzz` : on crée un objet `Fizzbuzz`, 
on appelle la methode `run()` et on vérifie qu'elle retourne bien la chaîne de charactaires attendue.

### GREEN
* Fix des problèmes de compilation : création de la méthode `run()` qui retourne `null`
* Fix du test : on est confiant et on tente une *obvious implementation* pour la méthode `run()`

### REFACTOR
* Il n'y a pas de raison pour exposer la méthode `print()`. On peut donc la rendre `protected`.