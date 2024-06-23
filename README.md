# Cricker-App

# Cricket Score App Documentation

# Overview

This document provides an overview and details of the Cricket Score App developed using Java Spring Boot, Jsoup for web scraping, and HTML, CSS, and JavaScript for the frontend UI. The application runs on the default port localhost:8080.

# Table of Contents

1. Introduction
2. Technologies Used
3. Setup and Installation
4. Project Structure
5. Endpoints
6. Future Enhancements

# Introduction

The Cricket Score App is designed to fetch and display live cricket scores. The backend of the application is built using Java Spring Boot, and it uses Jsoup for web scraping to fetch the latest cricket scores from a specified website. The frontend is created using HTML, CSS, and JavaScript to provide a user-friendly interface.

# Technologies Used

1. Java Spring Boot: For creating the RESTful web services.
2. Jsoup: For web scraping to fetch live cricket scores.
3. HTML/CSS/JavaScript: For the frontend UI.

# Setup and Installation

Prerequisites

1. Java Development Kit (JDK) 8 or higher
2. Maven
3. An IDE (e.g., IntelliJ IDEA, Eclipse)
4. Internet connection

# Project Structure

cricket-score-app
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── cricketapp
│   │   │               ├── CricketAppApplication.java
│   │   │               ├── controller
│   │   │               │   └── ScoreController.java
│   │   │               ├── service
│   │   │               │   └── ScoreService.java
│   │   │               └── model
│   │   │                   └── Score.java
│   │   ├── resources
│   │   │   └── application.properties
│   │   └── webapp
│   │       └── index.html
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── cricketapp
│                       └── CricketAppApplicationTests.java
├── pom.xml
└── README.md


# Running the Application

1. Ensure all dependencies are installed and the project is built.
2. Run the Spring Boot application.
3. Open a web browser and navigate to http://localhost:8080 to view the live cricket scores.

# Endpoints
GET /api/scores: Fetches the live cricket scores.

# Future Enhancements

1. Add authentication and authorization.
2. Enhance the UI with frameworks like React or Angular.
3. Implement a caching mechanism to reduce load on the web scraping service.
4. Schedule periodic updates to fetch scores at regular intervals.
