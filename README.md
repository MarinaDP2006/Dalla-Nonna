# Restaurante Dalla Nonna — App de Gestión y Reservas
La aplicación permite la gestión interactiva de la carta de platos y la reserva de mesas para el restaurante italiano *Dalla Nonna*.

## Requisitos Previos
Antes de ejecutar el proyecto, asegúrate de contar con los siguientes elementos configurados en tu entorno local:

* **JDK:** Java 17 o superior.
* **IDE:** IntelliJ IDEA, Eclipse o VS Code con soporte para JavaFX.
* **Gestor de Base de Datos:** MySQL / MariaDB (puerto local `3306`).
* **Librería de MySQL:** Tener vinculado el conector JDBC local `mysql-connector-j-26.10.0.jar` en la librería del proyecto (*Build Path* / *Project Structure*).

## Instalación y Ejecución
### 1. Clonar el repositorio
```
git clone https://github.com/TU-USUARIO/dalla-nonna-app.git
cd dalla-nonna-app
```

### 2. Configurar la Base de Datos
Crea la base de datos `dalla_nonna` e importa los esquemas guardados en la carpeta `/docs/base_datos/`:
```
CREATE DATABASE dalla_nonna;
```
Asegúrate de ajustar tus credenciales de acceso en la clase `DatabaseConnection.java` (`src/main/java/es/dallanonna/config/DatabaseConnection.java`).

### 3. Añadir el conector MySQL JDBC (Si no usas Maven central)
1. Ve a la estructura de tu proyecto (*Project Structure* -> *Libraries* en IntelliJ / *Build Path* -> *Add External JARs* en Eclipse).
2. Selecciona e incluye el archivo `mysql-connector-j-26.10.0.jar` incluido en las librerías del proyecto.

### 4. Ejecutar la aplicación
Ejecuta la clase principal de arranque:
`src/main/java/es/dallanonna/App.java`

##  Arquitectura por Capas
El proyecto está organizado siguiendo una separación de responsabilidades:
```
src/main/
├── java/es/dallanonna/
│   ├── config/        # Conexión JDBC (DatabaseConnection.java)
│   ├── controller/    # Eventos de la interfaz (sin SQL directo)
│   ├── dao/           # Consultas SQL e interacción DB
│   ├── model/         # Entidades de dominio (Plato, Reserva, Cliente)
│   └── service/       # Lógica de negocio y validaciones
└── resources/es/dallanonna/
    ├── css/           # Hoja de estilos (styles.css)
    └── fxml/          # Vistas FXML de la interfaz
```

##  Flujo de Trabajo y Ramas (Git Workflow)
Para mantener la estabilidad de la rama principal (`main`), seguimos las siguientes reglas de colaboración:
1. **Protección de `main`:** Ningún integrante del equipo realiza commits directos a `main`.
2. **Creación de ramas:** Cada nueva tarea o funcionalidad debe desarrollarse en una rama secundaria con el formato `feature/nombre-tarea` (ej: `feature/pantalla-reserva`, `feature/conexion-dao`).
3. **Pull Requests (PR):** Al finalizar una tarea, se abre un PR hacia `main`. Este debe ser revisado y aprobado por al menos otro integrante del equipo antes de integrarse.

## Enlaces del Proyecto
* **Tablero de Trello:** [Enlace a vuestro Trello](https://trello.com/b/sbxPkpf0/%F0%9F%8D%95-plan-de-tareas-dalla-nonna)
* **Diseño en Figma:** [Enlace al prototipo de Figma](* **Diseño en Figma:** [Enlace al prototipo de Figma]([https://www.figma.com/files/team/1697195461922410043/recents-and-sharing?fuid=1697195460353682410](https://www.figma.com/make/QggrrsN0DKKUGBVkvyqRVD/Dalla-Nonna-Restaurant-Website?code-node-id=0-6&p=f&t=kfjaEip9VTCXWoPa-0&fullscreen=1)))
