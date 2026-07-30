# Prison Inmate Management System (PIMS)

An academic/coursework project for managing prison inmate records, staff roles, and
(planned) biometric identification, built as a three-part system: a Java Spring Boot
backend, a lightweight web frontend, and a C++ "hardware bridge" intended to connect
biometric scanning hardware to the backend.

## Tech stack

- **Backend:** Java 17, Spring Boot 3.2 (Web, Data JPA, Security), Maven
- **Database:** MySQL, with schema versioning via Flyway
- **Frontend:** Static HTML/CSS/JavaScript (no framework), calling the backend REST API
- **Hardware bridge:** C++ (CMake build), for interfacing with biometric capture devices

## Project structure

```
backend/           Spring Boot application (Maven project)
  src/main/resources/application.properties   MySQL connection + JPA/Flyway config
  src/main/resources/db/migration/            Flyway SQL migrations (schema)
frontend/           Static web client (HTML/CSS/JS)
hardware-bridge/    C++ CMake project for biometric hardware integration
```

## Data model

The initial Flyway migration (`V1__init_schema.sql`) defines:

- `roles` — named user roles
- `users` — system users with a role and a clearance level
- `inmates` — inmate records, including an inmate number, name, status, and fields
  reserved for biometric data (`fingerprint_template`, `facial_data_hash`)

## Current status

This is an in-progress student/academic project. On the `main` branch, the backend
currently contains its Maven configuration, database schema, and
`application.properties`, but the Java source (Spring Boot application class,
`Inmate` entity, repository/service/controller classes) is still being developed on
feature branches and has not yet been merged in. The `frontend` and `hardware-bridge`
directories are scaffolded but currently contain placeholder/empty files.

## Getting started (backend)

Prerequisites: JDK 17, Maven, and a running MySQL server.

1. Create/update MySQL credentials in
   `backend/src/main/resources/application.properties` (default expects a local
   MySQL instance on `localhost:3306`; the `prison_db` database is created
   automatically if it doesn't exist).
2. From the `backend` directory, build and run the application:
   ```
   mvn spring-boot:run
   ```
3. Flyway will apply the migrations in `src/main/resources/db/migration` on startup.

## Getting started (hardware bridge)

The `hardware-bridge` module is a CMake project:
```
cd hardware-bridge
cmake -B build
cmake --build build
```

## Frontend

`frontend/index.html` is a static entry point intended to talk to the backend API via
`frontend/services/api.js`. No build step is required.
