CC = javac
RUN = java
FLAGS = -cp .

.PHONY: dados

all: compile

run:
	${RUN} ${FLAGS} negocio/SistemaMonitoria

compile: dados apresentacao negocio/SistemaMonitoria.java
	${CC} ${FLAGS} negocio/*.java 

dados: 
	${CC} ${FLAGS} dados/*.java

apresentacao:
	${CC} ${FLAGS} apresentação/*.java

clean:
	rm negocio/*.class negocio/*.jar dados/*.class dados/*.jar
