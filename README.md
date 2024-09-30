**Tondeuse Automatique Libon - Spring Boot**

Implémentation d'une API REST en Spring Boot pour simuler le déplacement de tondeuses automatiue sur une pelouse représentée sous forme de grille.
Input -> Instruction via un payload JSON

**Technologie utilisées**

- Java 17
- Spring Boot
- Maven

**Installation**

Cloner le dépôt Git
- https://github.com/DorianMenard/Tondeuse_Libon.git
- cd Tondeuse_Libon

**Lancer l'appli Spring boot**

- mvn spring-boot:run


**API Endpoint**

Endpoint : POST /api/v0/tondeuse

Example requête Postman :
Faire une nouvelle requête POST avec l'url "http://localhost:8080/api/v0/tondeuse"

Ajouter le payload JSON :
"{
    "pelouseMaxX": 5,
    "pelouseMaxY": 5,
    "tondeuses": [
        {
            "id": "1",
            "x": 1,
            "y": 2,
            "orientation": "N",
            "actions": ["G", "A", "G", "A", "G", "A", "G", "A", "A"]
        },
        {
            "id": "2",
            "x": 3,
            "y": 3,
            "orientation": "E",
            "actions": ["A", "A", "D", "A", "A", "D", "A", "D", "D", "A"]
        }
    ]
}"


Résultat :
"{
    "results": [
        "1 :  x: 1 , y: 2 / N",
        "2 :  x: 3 , y: 3 / E"
    ]
}"



**Idée d'amélioration**

- Ajouter une partie front avec les tondeuses en temps réel sur une interface web
- Refactoriser mon code pour mettre tout en Anglais : Mower ect
- Ajout de log pour le débogage avec Logback
- Ajout de nouvelle forme pour les pelouse ( Actuellement que rectangle / carré )
- Ajout de test unitaires et d'intégration
