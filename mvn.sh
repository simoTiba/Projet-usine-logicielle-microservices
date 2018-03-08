	#!/bin/bash
	clear
	echo ------------------------------ Compile Config ----------------------------
	cd a-config-service/
	mvn clean install
	sleep 3

	echo ------------------------------ Compile Eureka ----------------------------
	cd ../a-eureka-service/
	mvn clean install
	sleep 3

	echo ------------------------------ Compile Diplome ----------------------------
	cd ../a-diplome-service
	mvn clean install
	sleep 3

	echo ------------------------------ Compile Enseignant ----------------------------
	cd ../a-enseignant-service
	mvn clean install
	sleep 3

	echo ------------------------------ Compile Services ----------------------------
	cd ../a-service-service
	mvn clean install
	sleep 3

	echo ------------------------------ Compile Proxy ----------------------------
	cd ../a-proxy-service
	mvn clean install
	sleep 3
	docker rmi -f config-service eureka-service diplome-service services-service enseignant-service proxy-service

	cd ..
