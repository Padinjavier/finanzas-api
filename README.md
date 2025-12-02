# 📊 API de Gestión Financiera Personal

## 🎯 Descripción
API REST para gestionar ingresos y gastos personales con autenticación JWT, categorización de gastos y reportes analíticos.

## ✨ Características Principales
- ✅ Autenticación y autorización con JWT
- ✅ CRUD completo de ingresos/gastos
- ✅ Categorización de transacciones
- ✅ Dashboard con análisis financiero
- ✅ Generación de reportes (CSV/PDF)
- ✅ Validaciones robustas
- ✅ Documentación Swagger

## 🛠️ Stack Tecnológico
- **Backend:** Java 21+ / Spring Boot 3.x
- **Autenticación:** Spring Security + JWT
- **Base de Datos:** PostgreSQL
- **ORM:** JPA/Hibernate
- **Utilidades:** Lombok, MapStruct
- **API Docs:** Swagger/OpenAPI
- **Contenedorización:** Docker (opcional)

## 📋 Requisitos Previos
✅ Visual Studio Code  
✅ JDK 21+  
✅ HeidiSQL (ya tienes)  
❌ **Falta:** Maven o Gradle, Postman/Insomnia, Git

## 🚀 Crear el Proyecto
```bash
# Spring Boot CLI (recomendado)
spring boot new --from https://start.spring.io finanzas-api --build maven

# O descarga desde https://start.spring.io con:
# - Project: Maven
# - Language: Java
# - Spring Boot: 3.x
# - Dependencies: Web, Security, JPA, PostgreSQL, Lombok, Validation
```

## 📁 Estructura Base
```
finanzas-api/
├── src/main/java/com/finanzas
│   ├── config/
│   ├── controller/
│   ├── service/
│   ├── repository/
│   ├── entity/
│   ├── dto/
│   └── exception/
├── pom.xml
├── docker-compose.yml
└── README.md
```

## 🔧 Instalación
```bash
git clone <tu-repo>
cd finanzas-api
mvn clean install
mvn spring-boot:run
```
