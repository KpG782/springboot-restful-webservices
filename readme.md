# 🚀 Spring Boot RESTful Web Services - Cloud Deployment Project

[![Live Demo](https://img.shields.io/badge/Live-Demo-success)](https://springboot-app.kygozf.easypanel.host)
[![Docker](https://img.shields.io/badge/Docker-Multi--Stage-blue)](https://www.docker.com/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.5-brightgreen)](https://spring.io/projects/spring-boot)
[![Java](https://img.shields.io/badge/Java-21-orange)](https://www.oracle.com/java/)

A production-ready RESTful API application demonstrating modern DevOps practices, containerization, and cloud deployment strategies.

## 🌟 Live Application

**Live URL:** [https://springboot-app.kygozf.easypanel.host](https://springboot-app.kygozf.easypanel.host)

## 📋 Table of Contents

- [Features](#features)
- [Technologies & DevOps Stack](#technologies--devops-stack)
- [Architecture](#architecture)
- [Getting Started](#getting-started)
- [Docker Deployment](#docker-deployment)
- [Cloud Deployment](#cloud-deployment)
- [API Documentation](#api-documentation)
- [Health Monitoring](#health-monitoring)
- [DevOps Skills Demonstrated](#devops-skills-demonstrated)

## ✨ Features

- ✅ Full CRUD REST API operations
- ✅ In-memory H2 database with sample data
- ✅ Modern responsive web UI
- ✅ Docker containerization with multi-stage builds
- ✅ Production-ready health checks
- ✅ Cloud deployment on VPS
- ✅ SSL/HTTPS enabled
- ✅ Automated CI/CD pipeline

## 🛠️ Technologies & DevOps Stack

### Backend & Framework

- **Java 21** - Latest LTS version
- **Spring Boot 3.5.5** - Modern application framework
- **Spring Data JPA** - Data persistence
- **Hibernate** - ORM framework
- **H2 Database** - In-memory database

### DevOps & Cloud

- **Docker** - Containerization with multi-stage builds
- **Maven** - Build automation
- **Git/GitHub** - Version control
- **Easypanel** - Container orchestration platform
- **VPS Deployment** - Self-hosted cloud infrastructure
- **Let's Encrypt** - Automated SSL certificates

### Monitoring & Health

- **Docker HEALTHCHECK** - Container health monitoring
- **Spring Boot Actuator** - Application health endpoints
- **Custom Health Controller** - API status monitoring

## 🏗️ Architecture

```
┌─────────────────────────────────────────────────┐
│           Client (Browser/API)                  │
└────────────────┬────────────────────────────────┘
                 │ HTTPS
                 ▼
┌─────────────────────────────────────────────────┐
│        Easypanel Reverse Proxy (SSL)            │
└────────────────┬────────────────────────────────┘
                 │ HTTP
                 ▼
┌─────────────────────────────────────────────────┐
│         Docker Container                        │
│  ┌──────────────────────────────────────┐      │
│  │   Spring Boot Application            │      │
│  │   ├── REST Controllers               │      │
│  │   ├── Service Layer                  │      │
│  │   ├── JPA Repositories               │      │
│  │   └── H2 Database (In-Memory)        │      │
│  └──────────────────────────────────────┘      │
└─────────────────────────────────────────────────┘
```

## 🚀 Getting Started

### Prerequisites

- Java 21 or higher
- Maven 3.8+
- Docker (for containerization)
- Git

### Local Development

1. **Clone the repository**

   ```bash
   git clone https://github.com/KpG782/springboot-restful-webservices.git
   cd springboot-restful-webservices
   ```

2. **Run with Maven**

   ```bash
   mvn spring-boot:run
   ```

3. **Access the application**
   - UI: http://localhost:8080
   - API: http://localhost:8080/api/users
   - H2 Console: http://localhost:8080/h2-console

## 🐳 Docker Deployment

### Multi-Stage Docker Build

The project uses an optimized multi-stage Dockerfile:

**Stage 1: Build** - Uses Maven and JDK to compile the application
**Stage 2: Runtime** - Uses minimal JRE for smaller production image

### Build & Run with Docker

```bash
# Build the Docker image
docker build -t springboot-restful-webservices .

# Run the container
docker run -p 8080:8080 springboot-restful-webservices
```

### Docker Features Implemented

- ✅ Multi-stage builds (reduced image size)
- ✅ Layer caching optimization
- ✅ Health check integration
- ✅ Dependency caching for faster rebuilds
- ✅ Security best practices (non-root user, minimal base image)

## ☁️ Cloud Deployment

### Deployment Process

1. **Push to GitHub** - Code changes trigger deployment

   ```bash
   git add .
   git commit -m "Deploy updates"
   git push origin main
   ```

2. **Easypanel Auto-Deploy** - Automatically builds and deploys

   - Pulls latest code from GitHub
   - Builds Docker image
   - Health checks container
   - Routes traffic with zero downtime

3. **SSL/HTTPS** - Automatic Let's Encrypt certificate

### Deployment Configuration

- **Platform:** Easypanel on VPS
- **Domain:** springboot-app.kygozf.easypanel.host
- **SSL:** Let's Encrypt (Auto-renewed)
- **Health Checks:** Custom endpoint with 60s startup grace period
- **Restart Policy:** On failure only

## 📚 API Documentation

### Base URL

```
Production: https://springboot-app.kygozf.easypanel.host
Local: http://localhost:8080
```

### Endpoints

#### Get All Users

```http
GET /api/users
```

**Response:** `200 OK`

```json
[
  {
    "id": 1,
    "name": "Alice Johnson",
    "email": "alice@example.com"
  }
]
```

#### Get User by ID

```http
GET /api/users/{id}
```

**Response:** `200 OK`

#### Create User

```http
POST /api/users
Content-Type: application/json

{
  "name": "John Doe",
  "email": "john@example.com"
}
```

**Response:** `201 Created`

#### Update User

```http
PUT /api/users/{id}
Content-Type: application/json

{
  "name": "John Updated",
  "email": "john.updated@example.com"
}
```

**Response:** `200 OK`

#### Delete User

```http
DELETE /api/users/{id}
```

**Response:** `200 OK`

## 🏥 Health Monitoring

### Health Check Endpoint

```http
GET /health
```

**Response:** `OK`

### Docker Health Check

```dockerfile
HEALTHCHECK --interval=30s --timeout=5s --start-period=60s --retries=3 \
  CMD curl -f http://localhost:8080/health || exit 1
```

### Monitoring Features

- ✅ Container health monitoring
- ✅ Automatic restart on failure
- ✅ Startup grace period (60 seconds)
- ✅ Health status logging

## 💼 DevOps Skills Demonstrated

### 1. **Containerization**

- Multi-stage Docker builds
- Image optimization techniques
- Container health checks
- Docker best practices

### 2. **CI/CD Pipeline**

- Git version control
- Automated builds from GitHub
- Container orchestration
- Zero-downtime deployments

### 3. **Cloud Infrastructure**

- VPS deployment and management
- SSL/TLS certificate management
- Reverse proxy configuration
- Domain and DNS management

### 4. **Application Architecture**

- RESTful API design
- Layered architecture (Controller → Service → Repository)
- Database management
- Health monitoring implementation

### 5. **Build & Dependency Management**

- Maven multi-module projects
- Dependency optimization
- Build automation
- Artifact management

### 6. **Security**

- HTTPS/SSL encryption
- Secure container configuration
- Environment variable management
- Database security

### 7. **Monitoring & Troubleshooting**

- Health check implementation
- Log analysis
- Container debugging
- Performance optimization

## 🐛 Troubleshooting

### Common Issues

**Container Restarts**

- Check health endpoint: `/health`
- Verify startup grace period (60s)
- Review logs for errors

**404 Errors**

- Verify domain configuration
- Check routing rules
- Confirm container is running

**Build Failures**

- Ensure Java 21 compatibility
- Check Maven dependencies
- Verify Dockerfile syntax

## 📝 Sample Data

The application loads 5 sample users on startup:

1. Alice Johnson (alice@example.com)
2. Bob Smith (bob@example.com)
3. Charlie Brown (charlie@example.com)
4. Diana Prince (diana@example.com)
5. Eve Anderson (eve@example.com)

## 🤝 Contributing

Feel free to fork this project and submit pull requests for any improvements!

## 📧 Contact

**Developer:** Ken
**GitHub:** [@KpG782](https://github.com/KpG782)
**Project:** [springboot-restful-webservices](https://github.com/KpG782/springboot-restful-webservices)

## 📄 License

This project is open source and available for educational purposes.

---

**Built with ❤️ using Spring Boot, Docker, and modern DevOps practices**
