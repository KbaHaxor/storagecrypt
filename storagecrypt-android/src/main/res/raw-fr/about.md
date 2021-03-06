# StorageCrypt #
## À propos ##

### Description ###

StorageCrypt vous permet de chiffrer vos fichiers avant de les sauvegarder dans le cloud.

  * Open source : [https://github.com/petrus-dev/storagecrypt](https://github.com/petrus-dev/storagecrypt) et [https://github.com/petrus-dev/filepickerlib](https://github.com/petrus-dev/filepickerlib)
  * Compatible avec android 4.4+
  * Chiffrement fort : AES 256
  * Les clés de chiffrement sont stockées dans un keystore protégé par mot de passe
  * Vous seul pouvez déchiffrer vos fichiers, à moins de partager vos clés
  * Les fichiers chiffrés sont stockés localement, avec possibilité de synchronisation sur Google Drive, Dropbox, Box, HubiC ou OneDrive
  * Vous pouvez utiliser différentes clés pour chiffrer différents fichiers
  * Importez/exportez vos clés pour pouvoir déchiffrer vos fichiers sur plusieurs appareils
  
### Version ###

* 0.23.0

### Changelog ###

* 0.23.0
  * Déverrouillage de la base de données en arrière-plan, et affichage d'un dialgue de progression
  * Déplacement des fichiers dans un service en arrière-plan, et affichage d'un dialgue de progression
  * Correction de bugs mineurs

* 0.22.0
  * Correction de bug : une erreur se produisait lors de l'ajout d'un document comportant une apostrophe dans son nom.
  * Les documents peuvent maintenant être déplacés vers un autre dossier ou même sur un autre compte.
  * Amélioration du dialogue de choix des fichiers à écraser : ajout d'icones pour montrer le type d'élément.
  * Nouveau bouton dans les dialogues de déverrouillage et de création de keystore, permettant de quitter l'application sans saisir son mot de passe.

* 0.21.3
  * Mise à jour des bibliothèques à la dernière version

* 0.21.2
  * Meilleure implémentation des opérations cryptographiques.
  * Amélioration du processus de synchronisation des modifications.

* 0.21.1
  * Correction de bug : les dossiers distants n'étaient pas correctement créés

* 0.21.0
  * Lors du chiffrement, il est maintenant possible de choisir quels fichiers existants écraser.
  * Correction de bug : l'état du bouton de synchronisation n'était pas correctement mis à jour dans certains cas.
  * Correction d'un bug : le chiffrement depuis d'autres applications ne fonctionnait pas dans certains cas

* 0.20.0
  * Amélioration de la stabilité
  * Fermeture de l'application : arrêt propre des tâches en cours, et suppression des fichiers temporaires.
  * Synchronisation des documents : suppression des fichiers locaux lorsque les fichiers distants sont supprimés 

* 0.19.0
  * Correction de bug : certains changements distants n'étaient pas correctement pris en compte
  * Sortie du mode sélection en pressant sur le bouton "retour"
  * Correction de bug : évite le lancement de la synchronisation lors de la rotation de l'écran
  * Correction de bug : l'état de boutons de synchronisation et des dialogues de progression n'était pas conservé lors de la rotation de l'écran

* 0.18.2
  * Correction de bugs
  * Amélioration de la stabilité

* 0.18.1
  * Dialogues de progression plus clairs
  * Correction de bug : les résultats affichés après une annulation étaient faux
  * Correction de bug : plantages lors de la perte de connexion avec les stockages distants

* 0.18.0
  * Sélection multiple de documents

* 0.17.4
  * Amélioration du style des images dans la page d'aide.

* 0.17.3
  * Nouvelles icones material design

* 0.17.2
  * Mise à jour de toutes les bibliothèques à la dernière version

* 0.17.1
  * Corrections de la page d'aide pour se conformer aux modifications de l'interface
  * Dialogue de progression lors du déverrouillage de la base de données

* 0.17.0
  * Nouvelle manière d'afficher le dossier courant et de naviguer parmi les dossiers parents.
  * Amélioration du style material design pour Android 5.0 et supérieur.
  * Support d'Android 7.0 (Nougat)

* 0.16.0
  * Correction de bug : désactivation de certaines opérations non supportées pour Android < 5.0
  * Nouvelles couleurs pour l'application.
  * Refonte des dialogues.
  * Icones plus nettes pour les hautes résolutions.

* 0.15.0
  * Correction dans le compte des erreurs de synchronisation des documents.

* 0.14.0
  * Simplifications dans la manière dont le progression de la synchronisation des documents est affichée.
  * Correction de bug : lors d'un changement de la liste des clés alors que le menu contextuel est affiché, l'action était lancée sur le mauvais document.
  * Correction de bug : duplication de fichier lors de la synchronisation de compte en même temps qu'un upload (la v0.13.0 ne réglait pas complètement le problème).
  * Ajout d'une barre de progression dans le dialogue de progression pour l'ajout d'un nouveau compte.
  * Amélioration de la sélection multiple de fichiers.

* 0.13.0
  * Correction de bug : duplication de fichier lors de la synchronisation de compte en même temps qu'un upload.
  * Correction de bug : lors d'un changement de la liste de documents alors que le menu contextuel est affiché, l'action était lancée sur le mauvais document.
  * Ajout d'un compte : barre de progression avec valeur indéterminée.

* 0.12.0
  * Fin des tests de la beta : publication officielle de l'application pour tout le monde. Pas encore en 1.0 mais on s'en approche.
  * Ajout d'un dialogue pour créer une première clé ou en importer une après la création d'un keystore pour laisser le choix à l'utilisateur de créer une clé ou d'en importer une.

* 0.11.2
  * HubiC : nouvelle méthode pour mettre à jour le quota

* 0.11.1 :
  * Correction de bug : les dossiers n'étaient pas bien recréés lors d'un envoi après avoir supprimé les dossiers distants.

* 0.11.0 :
  * Correction du crash au démarrage des services de chiffrement et déchiffrement
  * Suppression de l'apparition aléatoire de l'icone de synchronisation dans la liste de documents

* 0.10.0 :
  * Correction de divers bugs
  * Restructuration du code pour une meilleure stabilité
  * Amélioration du chiffrement, incompatible avec les versions précédentes