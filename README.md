# Proyecto Turnos - Aplicacion de Gestion de Turnos

## Descripcion

Este proyecto es una aplicacion web para la gestion de turnos, desarrollada con **Spring Boot** en Java para el backend, y una base de datos **MySQL**. La aplicacion esta containerizada con **Docker** y desplegada en la nube usando una instancia **EC2 de AWS**.

La idea principal es que puedas gestionar turnos para diferentes profesionales o servicios, con un backend robusto y facil de desplegar.

---

## Tecnologias usadas

- Java 17 + Spring Boot
- MySQL 8
- Docker y Docker Compose
- AWS EC2 (tipo de instancia t2.micro)
- Maven (para construccion y dependencias)

---

## Despliegue en la nube

La aplicacion esta desplegada en una instancia EC2 en AWS con direccion IP publica:

[http://18.191.176.209:8080/professionals](http://18.191.176.209:8080/professionals)

Se utilizo Docker Compose para orquestar el contenedor de la base de datos MySQL y la aplicacion Spring Boot.

---

## Como ejecutar localmente con Docker

1. Clonar este repositorio:

```bash
git clone https://github.com/LucasLatessa/Turnos.git
cd Turnos
```

2. Construir y levantar los contenedores con Docker Compose:

```bash
docker-compose up --build -d
```