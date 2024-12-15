docker stop todoapp-springboot-app-1;
docker stop todoapp-postgres-1;

docker rm todoapp-springboot-app-1;
docker rm todoapp-postgres-1;

docker image rm todoapp-springboot-app;

cd ToDoAppServer/;
mvn clean install;
cd ..;
docker compose up -d --build;




