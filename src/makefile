CC = javac
RUN = java
FLAGS = -cp .

.PHONY: dados

all: compile

run:
	${RUN} ${FLAGS} negocio/SistemaMonitoria

compile: dados negocio/SistemaMonitoria.java
	${CC} ${FLAGS} negocio/SistemaMonitoria.java 

dados: 
	${CC} ${FLAGS} dados/*.java

clean:
	rm negocio/*.class negocio/*.jar dados/*.class dados/*.jar
