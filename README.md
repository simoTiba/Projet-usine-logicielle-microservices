# Projet-usine-logicielle-microservices

![usinelogiciel](https://user-images.githubusercontent.com/32774607/37176841-d62d3c40-231d-11e8-856a-e5c6484407dd.png)

1) On a créé un scipt mvn.sh qui compile tout les services: *./mvn.sh*
2) Ensuite on lance les services par la commande *docker-compose up* :

La liste des URL des services:

  *  EUREKA-SERVICE: http://localhost:8761/
  *  DIPLOME-SERVICE	http://localhost:3333/
  *  ENSEIGNANT-SERVICE: http://localhost:2222/
  *  SERVICES-SERVICE: http://localhost:1111/
  *  PROXY-SERVICE: http://localhost:9999/	
  
  *  FRONT ANGULAR: http://localhost:4200	

## Listes des Mapping sur Swagger de Proxy ##

![screenshot from 2018-03-09 00 26 03](https://user-images.githubusercontent.com/32774607/37182726-eacfa47a-2332-11e8-8c30-2b2297c30aba.png)

La liste des URL de SWAGGER des services:

  *  DIPLOME-SERVICE	http://localhost:3333/swagger-ui.html
  *  ENSEIGNANT-SERVICE: http://localhost:2222/swagger-ui.html
  *  SERVICES-SERVICE: http://localhost:1111/swagger-ui.html
  *  PROXY-SERVICE: http://localhost:9999/swagger-ui.html

Affichage du FRONT:

![screenshot from 2018-03-09 10 54 04](https://user-images.githubusercontent.com/32774607/37201531-406f9a52-2388-11e8-8ab1-4b9a651ed3aa.png)
