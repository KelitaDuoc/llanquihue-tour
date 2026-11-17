# 🧭 Llanquihue Tour App

## 👤 Autor del proyecto

- **Nombre completo:** Kelita Arias
- **Asignatura:** Desarrollo Orientado a Objetos I
- **Carrera:** Analista Programador Computacional

---

## 📘 Descripción del sistema

Este proyecto corresponde a la actividad de la Semana 4 de Desarrollo Orientado a Objetos I.

La aplicación permite leer información de tours desde un archivo de texto (.txt), crear objetos de tipo Tour y almacenarlos en un ArrayList.

Además, el sistema muestra todos los tours registrados y filtra aquellos que cumplen una condición de precio.

---

## 🧱 Estructura del proyecto

```plaintext
src
└── main
    ├── java
    │   ├── data
    │   │   └── GestorDatos.java
    │   │
    │   ├── model
    │   │   └── Tour.java
    │   │
    │   └── ui
    │       └── Main.java
    │
    └── resources
        └── tours.txt
```

---

## ⚙️ Funcionalidades

- Leer datos desde un archivo de texto.
- Crear objetos Tour.
- Almacenar objetos en un ArrayList.
- Mostrar todos los tours registrados.
- Filtrar tours según el precio.
- Mostrar resultados por consola.

---

## 📄 Archivo utilizado

El archivo `tours.txt` contiene información en el siguiente formato:

```plaintext
NombreTour;Destino;Precio
```

Ejemplo:

```plaintext
Tour Volcan Osorno;Puerto Varas;45000
Tour Lago Llanquihue;Llanquihue;12000
Tour Paseo Frutillar;Frutillar;25000
Tour Puerto Montt;Puerto Montt;30000
Tour Chiloe Tradicional;Chiloe;25000
```

---

## ▶️ Instrucciones para ejecutar

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que el archivo `tours.txt` se encuentre en `src/main/resources`.
3. Ejecutar la clase `Main.java`.
4. Revisar los resultados en la consola.

---

## 🔗 Repositorio GitHub
https://github.com/KelitaDuoc/llanquihue-tour

---

© Duoc UC | Desarrollo Orientado a Objetos I
