# Restaurante Dalla Nonna — App de Gestión y Reservas
La aplicación permite la gestión interactiva de la carta de platos y la reserva de mesas para el restaurante italiano *Dalla Nonna*.

## Requisitos Previos
Antes de ejecutar el proyecto, asegúrate de contar con los siguientes elementos configurados en tu entorno local:

* **JDK:** Java 17 o superior.
* **IDE:** IntelliJ IDEA, Eclipse o VS Code con soporte para JavaFX.
* **Gestor de Base de Datos:** MySQL / MariaDB (puerto local `3306`).
* **Librería de MySQL:** Tener vinculado el conector JDBC local `mysql-connector-j-26.10.0.jar` en la librería del proyecto (*Build Path* / *Project Structure*).

### Añadir el conector MySQL JDBC
1. Ve a la estructura de tu proyecto (*Project Structure* -> *Libraries* en IntelliJ / *Build Path* -> *Add External JARs* en Eclipse).
2. Selecciona e incluye el archivo `mysql-connector-j-26.10.0.jar` incluido en las librerías del proyecto.

##  Arquitectura
```
src/main/
├── java/es/dallanonna/
│   ├── controller/    # Eventos de la interfaz (sin SQL directo)
└── resources/es/dallanonna/
    ├── css/           # Hoja de estilos (styles.css)
    └── fxml/          # Vistas FXML de la interfaz
```

## Enlaces del Proyecto
* **Tablero de Trello:**(https://trello.com/b/sbxPkpf0/%F0%9F%8D%95-plan-de-tareas-dalla-nonna)
* **Diseño en Figma:** (https://www.figma.com/make/QggrrsN0DKKUGBVkvyqRVD/Dalla-Nonna-Restaurant-Website?code-node-id=0-6&p=f&t=kfjaEip9VTCXWoPa-0&fullscreen=1)))
