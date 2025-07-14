# METEO

Applicazione web meteo realizzata con Spring Boot e Docker.

## Funzionalità
- Visualizzazione meteo per Milano, Roma e Torino
- Interfaccia grafica moderna con animazioni
- Immagini personalizzate
- Deploy tramite Docker

## Avvio con Docker

1. Costruisci l'immagine:
   ```sh
   docker build -t meteo .
   ```
2. Avvia il container:
   ```sh
   docker run -p 8080:8080 meteo
   ```
3. Apri il browser su [http://localhost:8080](http://localhost:8080)

## Struttura progetto
- `src/main/java` - Codice Java (Spring Boot)
- `src/main/resources/templates` - Pagine HTML
- `src/main/resources/static/immagini` - Immagini
- `Dockerfile` - Configurazione Docker
- `pom.xml` - Configurazione Maven

## Autore
Jacopo Parlacino


