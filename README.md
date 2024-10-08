# LoginIW
# Login con Spring Boot y React

## Descripción
Este proyecto implementa una aplicación de inicio de sesión utilizando Spring Boot en el backend y React en el frontend. El sistema permite a los usuarios registrarse y acceder a una sección privada (CRUD) después de iniciar sesión.

## Tecnologías Utilizadas
- Spring Boot
- Spring Security
- React
- Axios
- MySQL

## Configuración del Proyecto

### Backend
1. Clona el repositorio.
2. Configura la base de datos MySQL y ajusta las credenciales en `application.properties`.
3. Ejecuta el proyecto Spring Boot.

### Frontend
1. Navega a la carpeta del frontend.
2. Ejecuta `npm install` para instalar las dependencias.
3. Ejecuta `npm start` para iniciar la aplicación React.

## Uso
1. Regístrate un nuevo usuario.
2. Inicia sesión con el nombre de usuario y la contraseña.
3. Accede a la sección privada en `/home`.

## Notas
- Asegúrate de que el backend se esté ejecutando en `http://localhost:8085`.
- Las rutas están protegidas y no se puede acceder a `/home` sin iniciar sesión.
