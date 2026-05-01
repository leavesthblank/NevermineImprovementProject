# Nevermine Improvement Project

An improvement project of Nevermine(Advent of Ascension)

## Changes to original mod
```
  Linux: ./gradlew setupDecompWorkspace
Windows: ./gradlew.bat setupDecompWorkspace
```

Make sure to refresh the IDE Gradle model after setting up the workspace for the first time, otherwise it might not find the Minecraft and Forge classes.

## Compiling
```
  Linux: ./gradlew build
Windows: ./gradlew.bat build
```

## Running the client
```
  Linux: ./gradlew runClient
Windows: ./gradlew.bat runClient
Optional arguments:
 ./gradlew runClient [--debug-jvm] [--args minecraft arguments] [--username MyUser] [--uuid Overwrite-uuid]
```

## Running the server
```
  Linux: ./gradlew runServer
Windows: ./gradlew.bat runServer
Optional arguments:
 ./gradlew runServer [--debug-jvm] [--args nogui]
```

## Publishing to Maven
```
Local:
  Linux: ./gradlew publishToMavenLocal
Windows: ./gradlew.bat publishToMavenLocal

Remote:
  Linux: ./gradlew publish
Windows: ./gradlew.bat publish
```
