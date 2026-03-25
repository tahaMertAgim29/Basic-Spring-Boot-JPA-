# JAVA SPRINGBOOT BASIC JPA PROJECT 


## Introduction

This is a **trial** project for **Springboot JPA** on **VISUAL STUDIO CODE**.
> [!WARNING]
> Before starting, you should be sure that you will use Visual Studio Code as your platform for Springboot since these steps are for Visual Studio Code

## Features

- Sending Http Requests which are not allowed to be directly sent to Web such as **POST** and **DELETE**.
- Setting database tables relationships set by Springboot without writing on MySQL. 
- Handling globally Exceptions.
- Understanding structure of Repository, Service and Controller.

## Requirements

To execute this project, you will need to have these platforms or packs. Thunder Client is used to execute **POST**, **DELETE** requests in this project but you can use another tools such as **Postman**.

- *Visual Studio Code*
- *Springboot Extension Pack*
- *Java Extension Pack*
- *MYSQL* (Springboot works better when MYSQL is used, I recommended you to download MYSQL)
- *Thunder Client* (Optional to execute such requests as POST and DELETE)

> [!IMPORTANT]
> While you clone this repository, make sure that methods or annotations of these required dependencies are working well. To make sure, you should check pom.xml file where `<dependency>` tags exist.

## MySQL Database Link Set
When you download this project, you should check the application_properties file to ensure your database link where it is at `jpademo/src/main/resources` path in the Springboot Project and you will find these lines:
 
* spring.datasource.url=jdbc:mysql://localhost:3306/YOUR_DATABASE_NAME
* spring.datasource.username=root
* spring.datasource.password=YOUR_PASSWORD

You should write your own database name and your database password instead of `YOUR_DATABASE_NAME` and `YOUR_PASSWORD` words in following order.
>[!WARNING]
> For any possibility, you had better create the database in MYSQL since Spring may not sometimes see the database in MYSQL.

## Link

If you challenge downloading Springboot on Visual Studio Code, you can check this YouTube video. 
This video also includes how to create a new Springboot Project so, it will be a helper to create your own first Springboot Project on Visual Studio Code.
>[!CAUTION]
>While creating a new project, sometimes Spring and Java versions might not support each other. Therefore, you should be careful while selecting the versions of both Java and Springboot.


![Springboot](https://img.shields.io/badge/Springboot-%236DB33F?style=for-the-badge&logo=springboot&logoColor=white)
 ![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=fff) 
![Java](https://img.shields.io/badge/Java-%23C00000?style=for-the-badge&logo=openjdk&logoColor=fff) ![Thunder Client](https://img.shields.io/badge/Thunder%20Client-%23512BD4?style=for-the-badge&logo=thunderclient&logoColor=fff)





[![[Visual Studio Code Springboot and Java Setup Tutorial]](https://img.youtube.com/vi/dq1z9t03mXI/0.jpg)](https://www.youtube.com/watch?v=dq1z9t03mXI)
