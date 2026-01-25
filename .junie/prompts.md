# Lección: Introducción a la IA de JetBrains

## IA JetBrains

¿Qué son los perfiles activos en Spring Boot? Explica los casos de uso de los perfiles activos. Proporciona ejemplos
para usar diferentes bases de datos y despliegues en docker. Explica cómo se establecen las propiedades específicas de
cada perfil.

# Lección: Usando perfiles activos de Spring Boot con Junie

## Junie

En el paquete `guru.springframework.diexample.database`, examina la clase `DiDataStore`. A partir de esta clase, crea
una nueva clase llamada `SpanishDiDataStore` que devuelve "Conectado a la base de datos". Anota la nueva
clase con el perfil de "spanish". Actualiza la clase `DiDataStore` con el perfil que no es igual a "spanish".

Añadir una prueba unitaria para verificar que el controlador DiController devuelve "Conectado a la base de datos" cuando
el perfil "spanish" está activo. Usa un SpringBootTest, no uses mocks para este test.

# Tarea: Crear un nuevo perfil de Spring Boot

En el paquete `guru.springframework.diexample.database`, examina la clase `DiDataStore`. A partir de esta clase, crea
una nueva clase llamada `PolishDiDataStore` que devuelve "Conectado a la base de datos" en polaco. Anota la nueva
clase con el perfil de "polish". Actualiza la clase `DiDataStore` con el perfil que no es igual a "spanish" ni "polish".

Añadir una prueba unitaria para verificar que el controlador DiController devuelve "Conectado a la base de datos" en
polaco cuando el perfil "polish" está activo. Usa un SpringBootTest, no uses mocks para este test.