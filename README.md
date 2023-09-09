
# 1.- Compilar proyectos:
    PS C:\Cursos\Programacion\CursoJavaSpringKafkaMongo\demo-cqrs-kafka\demo-command> ./mvnw clean package -DskipTests
    PS C:\Cursos\Programacion\CursoJavaSpringKafkaMongo\demo-cqrs-kafka\demo-query> ./mvnw clean package -DskipTests

# 2.-Subir las BD mongo a docker:
    -Borrar todas las imagenes y contenedores (para que se refresque todo)
	docker-compose up -d
	
# 3.-Levantar los api:
	cd C:\Cursos\Programacion\CursoJavaSpringKafkaMongo\demo-cqrs-kafka\
	java -jar demo-command/target/demo-command-0.0.1-SNAPSHOT.jar  -->8081
	java -jar demo-query/target/demo-query-0.0.1-SNAPSHOT.jar --> 8082
		
# 4.-Revisar Mongo, ir a compas:
	mongodb://localhost:30000  user:root pass:secret	
	mongodb://localhost:30001  user:root pass:secret
		
# 5.-Revisar Kafka
	localhost:29092
	-instalar
	docker run -d -p 80:8080 -e bootstrapServers="kafka1:29092" -e kouncil.auth.active-provider="inmemory" consdata/kouncil:latest
	-entrar con: admin admin
	http://localhost/login
	
	
# 6.- En postman:
	http://localhost:8081/phone  --> POST
	
	{
    "name": "iphone13",
    "model": "11fghfhfhfh",
    "color": "red",
    "price": 800.99
	}
	
	http://localhost:8082/phone/iphone13 --> GET
