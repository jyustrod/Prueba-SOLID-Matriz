# Ejercicio Matriz en Java

[![Java](https://img.shields.io/badge/Github-Repo-purple.svg)](https://github.com/yourusername/matriz-java)
[![Java](https://img.shields.io/badge/Java-11%2B-blue.svg)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/Apache-2.0-red.svg)](LICENSE)

Este repositorio contiene la implementación de una clase Matriz en Java que permite realizar operaciones básicas como impresión y cálculo de la transpuesta.

## Descripción

La clase `Matriz` implementa una estructura de datos para representar una matriz bidimensional de enteros y ofrece operaciones comunes para manipular matrices.

## Características

- Creación de una matriz a partir de un array bidimensional de enteros
- Impresión formateada de la matriz en la consola
- Cálculo de la matriz transpuesta

## Uso

```java
// Crear una matriz 2x2
Matriz m = new Matriz(new int[][]{{1, 2}, {3, 4}});

// Imprimir la matriz
m.imprimir();
// Resultado:
// 1 2
// 3 4

// Calcular la transpuesta
Matriz mTranspuesta = m.transpuesta();
mTranspuesta.imprimir();
// Resultado:
// 1 3
// 2 4
```

## Estructura del Proyecto

```
├── src/main/java
│   └── matriz
│     └── Matriz.java 
└── Main.java 
```

## Principios SOLID Aplicados

### 1. Principio de Responsabilidad Única (SRP)
- La clase `Matriz` tiene una única responsabilidad: representar y operar sobre una matriz de enteros.
- Los métodos están claramente definidos para realizar tareas específicas.

### 2. Principio de Abierto/Cerrado (OCP)
- La clase está diseñada para ser extendida. Podríamos añadir más operaciones de matriz sin modificar el código existente.

### 3. Principio de Sustitución de Liskov (LSP)
- Aunque no hay herencia en este ejemplo, la clase está diseñada de manera que cualquier clase derivada podría sustituir a la clase base sin problemas.

### 4. Principio de Segregación de Interfaces (ISP)
- No se implementan interfaces explícitas, pero los métodos están bien definidos y enfocados en tareas específicas.

### 5. Principio de Inversión de Dependencias (DIP)
- La clase no depende de implementaciones concretas de otras clases, sino que depende de abstracciones (en este caso, depende de los arrays nativos de Java).

## Licencia

Este proyecto está bajo la Licencia Apache 2.0 - ver el archivo [LICENSE](LICENSE) para más detalles.
