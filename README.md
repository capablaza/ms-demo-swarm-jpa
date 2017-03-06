
# Microservice Template.

## 1 Overview
This project contains the Microservice Template. It uses docker in development, build and production.

## 2 Developing locally 
Local development is done via a development docker image. As a minimum requirement, you need docker installed and a local clone of this repository.

> For information about install docker in your machine follow the next link :
> https://docs.docker.com/engine/installation/

> Note, for run this MicroService is necessary up postgres docker image. Here the link to pull and run:
> postgres docker image :  https://github.com/capablaza/postgresdb.git

### 2.1 Creating and running your docker development environment

#### 2.1.1 Using Docker Compose

The most simple way to build & run the MicroService is using Docker Composer, to this run the next command in the current folder **(repository root)**:

```docker-compose up```

#### 2.1.2 Manual Method

First, you need to build your docker image. To do so, run a similar command from your **repository root**:     

```docker build -f dev/Dockerfile.dev -t microservice-demo .```

Once your image is built, you need to run it. Run the following command from your **repository root**:  

```docker run --name microservice-demo -p 8080:8080 -it --net postgres_default --link postgresdb:postgres ms-demo-swarm```

Finally you can view the application at ```http://localhost:8080```  


#### Docker Cheat Sheet Helper Reference

```https://github.com/wsargent/docker-cheat-sheet```