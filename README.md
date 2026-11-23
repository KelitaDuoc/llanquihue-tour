# 🧭 Llanquihue Tour App

## 👤 Autor del proyecto

- **Nombre completo:** Kelita Arias
- **Asignatura:** Desarrollo Orientado a Objetos I
- **Carrera:** Analista Programador Computacional

---

## 📘 Descripción del sistema

Este proyecto corresponde a la Actividad Sumativa de la Semana 5 de Desarrollo Orientado a Objetos I.

La aplicación permite leer información de tours desde un archivo de texto (.txt), crear objetos utilizando programación orientada a objetos, almacenarlos en colecciones dinámicas y realizar búsquedas y filtros sobre los datos cargados.

Además, incorpora validaciones de datos, composición entre clases y una estructura modular organizada en paquetes.

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
    │   │   ├── Tour.java
    │   │   └── Guia.java
    │   │
    │   ├── service
    │   │   └── TourService.java
    │   │
    │   └── ui
    │       └── Main.java
    │
    └── resources
        └── tours.txt
```

---

## ⚙️ Funcionalidades

- Lectura de datos desde un archivo TXT.
- Creación de objetos Tour.
- Creación de objetos Guia.
- Uso de ArrayList para almacenar información.
- Validación de datos al crear objetos.
- Búsqueda de tours por destino.
- Filtrado de tours por precio.
- Manejo de excepciones mediante try-catch.
- Relación de composición entre las clases Tour y Guia.
- Visualización de resultados por consola.

---

## 🧩 Clases implementadas

### TourRepresenta la información de un tour turístico.

### Guia
Representa al guía asociado a cada tour.

### GestorDatos
Responsable de la lectura y carga de datos desde el archivo.

### TourService
Contiene la lógica de búsqueda y filtrado de tours.

### Main
Punto de entrada de la aplicación.

---

## 📄 Archivo utilizado

El archivo `tours.txt` utiliza el siguiente formato:

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

## ✅ Validaciones implementadas

- El nombre del tour es obligatorio.
- El destino del tour es obligatorio.
- El precio debe ser mayor que cero.
- El guía no puede ser nulo.
- El nombre del guía es obligatorio.
- La especialidad del guía es obligatoria.

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
