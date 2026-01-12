CREATE TABLE roles (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    clearance_level INT DEFAULT 1,
    role_id BIGINT,
    FOREIGN KEY (role_id) REFERENCES roles(id)
);

CREATE TABLE inmates (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    inmate_number VARCHAR(50) NOT NULL UNIQUE,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    date_of_birth DATE,
    gender VARCHAR(20),
    fingerprint_template TEXT,
    facial_data_hash TEXT,
    status VARCHAR(50) DEFAULT 'ADMITTED',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);