# REPONSES - TP Git & GitHub

## PARTIE 1

### Q1
L'option --global enregistre la configuration dans le fichier .gitconfig du dossier personnel. Elle s'applique à tous les dépôts de l'utilisateur. Sans --global, la configuration est enregistrée dans .git/config et concerne uniquement le dépôt actuel.

### Q2
L'email doit correspondre à celui du compte GitHub pour que GitHub puisse associer les commits au bon profil.

## PARTIE 2

### Q3
Le dossier .git contient les informations du dépôt, l'historique des commits, les branches et la configuration. Si on le supprime, on perd l'historique Git du projet.

### Q4
git diff affiche les modifications qui ne sont pas encore indexées. git diff --staged affiche les modifications déjà indexées avec git add.

### Q5
La suite de caractères représente l'identifiant unique du commit, appelé hash.

## PARTIE 3

### Q6
Le fichier Main.class est généré automatiquement lors de la compilation. On ne le versionne pas car il peut être recréé à partir du fichier Main.java. Le fichier .gitignore permet d'éviter de suivre automatiquement les fichiers inutiles. Ainsi, git add . n'ajoute pas les fichiers ignorés.

### Q7
git revert annule un commit en créant un nouveau commit. git reset revient en arrière en déplaçant la référence de la branche. Sur une branche déjà partagée, on préfère git revert car il conserve l'historique.

### Q8
HEAD~1 désigne le commit parent du commit actuel. Detached HEAD signifie que l'on consulte directement un commit sans être positionné sur une branche.

## PARTIE 4

### Q9
La multiplication est absente parce que la branche main n'a pas encore récupéré les modifications de la branche multiplication.

### Q10
Une fusion fast-forward déplace simplement le pointeur de la branche principale vers un commit plus récent. La fusion de l'étape 4.4 crée un commit de fusion parce que les deux branches ont évolué séparément.

### Q11
<<<<<<< HEAD indique le début de la version actuelle. ======= sépare les deux versions. >>>>>>> titre indique la fin de l'autre version. Git ne peut pas fusionner seul lorsque deux modifications incompatibles concernent la même partie d'un fichier.

## PARTIE 5

### Q12
origin est le nom donné au dépôt distant principal. L'option -u permet de mémoriser la relation entre la branche locale et la branche distante.

### Q13
git fetch télécharge les modifications du dépôt distant sans les fusionner. git pull télécharge les modifications puis les fusionne.

### Q14
Le push a été refusé parce que le dépôt distant contenait des modifications absentes du dépôt local. Il faut d'abord faire git pull, résoudre les éventuels conflits, puis refaire git push.

## PARTIE 6

### Q15
Un fork est une copie d'un dépôt sur GitHub. Un clone est une copie du dépôt sur l'ordinateur. Une branche est une ligne de développement indépendante.

### Q16
Une branche dédiée permet de travailler séparément sans modifier directement main. La pull request permet ensuite de faire vérifier les modifications avant leur fusion.

### Q17
origin désigne le dépôt distant personnel. upstream désigne le dépôt original dont le fork est issu.

## PARTIE 7

### Q18
À compléter après avoir réalisé les trois niveaux sur LearnGitBranching.

Niveau 1 :
Commandes utilisées :
Score :

Niveau 2 :
Commandes utilisées :
Score :

Niveau 3 :
Commandes utilisées :
Score :

## BILAN

### 1
Les trois zones sont le répertoire de travail, l'index et le dépôt local. git add fait passer les modifications dans l'index et git commit les enregistre dans le dépôt.

### 2
git log --oneline --graph --all

### 3
git restore --staged secret.txt

### 4
git revert suivi de l'identifiant du commit.

### 5
git switch -c dev crée une branche et se positionne dessus. git branch dev crée seulement la branche.

### 6
Le push peut être refusé si le dépôt distant possède des commits absents du dépôt local. Il faut faire git pull, résoudre les conflits éventuels et refaire git push.

### 7
.gitignore sert à ignorer certains fichiers. Pour ignorer tous les fichiers .log, on écrit *.log.

### 8
Git est un logiciel de gestion de versions. GitHub est une plateforme en ligne qui héberge les dépôts Git et facilite la collaboration.