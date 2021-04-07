CC = javac
RUN = java
FLAGS = -cp .

.PHONY: dados

all: compile

run:
	${RUN} ${FLAGS} apresentação/main

compile: dados apresentacao negocio/SistemaMonitoria.java
	${CC} ${FLAGS} negocio/*.java 

dados: 
	${CC} ${FLAGS} dados/*.java

apresentacao:
	${CC} ${FLAGS} apresentação/*.java

clean:
	rm negocio/*.class dados/*.class apresentação/*.class;
	truncate -s 0 armazenamento/*.txt
