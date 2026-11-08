###### LEARNING AWS

##### 1.0 AWS CONSOLE

## 1.1 AWS CONSOLE AND SERVICES

- La consola de AWS es el punto de partida para acceder y gestionar los servicios de AWS, donde puedes ver servicios favoritos, recientes y organizados por categorías.

- Servicios importantes para desarrolladores incluyen Lambda (funciones sin servidor), DynamoDB (base de datos NoSQL), RDS (base de datos relacional), Amplify (desarrollo web y móvil), AppSync (API GraphQL) y servicios de seguridad como IAM y Cognito.

- La región predeterminada es importante para que los servicios funcionen correctamente juntos; la consola muestra y usa esta región para tus recursos.

## 1.2 CERTIFIED DEVELOPER ASSOCIATE

- La certificación AWS Developer-Associate está dirigida a desarrolladores con experiencia en lenguajes de programación, gestión del ciclo de vida de aplicaciones y desarrollo en la nube.

- El examen cubre habilidades como desarrollar, desplegar y depurar aplicaciones en la nube, y el uso de herramientas como APIs, línea de comandos y SDKs.

- AWS ofrece guías, preguntas de muestra y materiales para prepararse para el examen.

##### 2.0 SECURITY

## 2.1 IAM IDENTITY ACCESS MANAGEMENT

1️⃣ Usuarios y Credenciales
Identidad Individual: Un usuario de IAM representa a una persona o aplicación que interactúa con AWS.

Credenciales de Larga Duración: Se configuran mediante contraseñas para la consola y claves de acceso (Access Keys) para la interfaz de comandos (CLI/SDKs).

2️⃣ Grupos de Usuarios
Gestión Colectiva: Permite agrupar a múltiples usuarios que comparten las mismas funciones o necesidades de acceso.

Escalabilidad de Permisos: Al asignar políticas directamente al grupo, cualquier cambio se aplica automáticamente a todos sus miembros.

3️⃣ Roles y Políticas
Políticas (Policies): Documentos en formato JSON que definen explícitamente los permisos permitidos o denegados (Principio de Menor Privilegio).

Roles de IAM: Asignan permisos temporales a servicios de AWS (como funciones Lambda o instancias EC2) para que interactúen de forma segura sin credenciales permanentes.

4️⃣ Autenticación con Amazon Cognito
Gestión de Usuarios Externos: Ideal para aplicaciones web y móviles que requieren registro, inicio de sesión y control de acceso federado (Google, Facebook, Apple).

Pools de Usuarios y de Identidad: Administran directorios de usuarios escalables y otorgan credenciales temporales de AWS a usuarios autenticados.

## 2.2 USERS AND GROUP

Creación de Usuarios Específicos
Más allá del Root: Se recomienda no utilizar la cuenta principal (root) para las tareas diarias. En su lugar, es una buena práctica crear usuarios individuales específicos.

Control de Acceso: A cada nuevo usuario se le asignan credenciales únicas y permisos específicos adaptados a sus funciones.

2️⃣ Gestión mediante Grupos
Administración Colectiva: Los usuarios con necesidades de acceso similares se organizan en grupos para facilitar la gestión.

Escalabilidad: Al asignar políticas o permisos a un grupo completo, todos sus miembros heredan dichos permisos de manera automática.

3️⃣ Asignación de Políticas
Herencia y Flexibilidad: Los usuarios pueden tener permisos asignados de forma directa y, al mismo tiempo, heredar permisos adicionales a través de los grupos a los que pertenecen.

Adjuntar Políticas: Es posible asociar políticas existentes directamente desde la consola para otorgar los accesos requeridos con precisión.

4️⃣ Principio de Menor Privilegio
Seguridad Esencial: Concede únicamente los permisos estrictamente necesarios para que cada usuario o aplicación pueda realizar su trabajo, minimizando riesgos de seguridad.

## 2.3 ROLES AND POLICIES

1️⃣ ¿Qué es un Rol de IAM?
Identidad Temporal:
A diferencia de los usuarios, los roles no tienen credenciales permanentes asociadas.
Uso Asumido:
Están diseñados para ser asumidos temporalmente por entidades de confianza, como servicios de AWS (por ejemplo, funciones Lambda) o usuarios externos autorizados.

2️⃣ ¿Por qué un servicio necesita un Rol?
Seguridad sin Credenciales:
Permiten que los servicios de AWS interactúen entre sí de manera segura sin necesidad de almacenar claves de acceso estáticas o contraseñas en el código.
Ejemplo Práctico:
Una función de Lambda necesita un rol de IAM para poder leer o escribir datos en una base de datos de DynamoDB o en un bucket de S3.

3️⃣ Políticas de IAM (Policies)Documentos JSON:
Las políticas son archivos en formato JSON que definen explícitamente qué acciones están permitidas o denegadas sobre determinados recursos.

Flexibilidad:
Se pueden adjuntar tanto a usuarios, grupos como a roles para controlar con precisión granular los permisos de acceso.

## 2.4 COGNITO

Cognito ofrece dos tipos de pools:
user pools para gestionar el registro e inicio de sesión de usuarios directamente en tu app o sitio web, y identity pools para proporcionar credenciales AWS que permiten a los usuarios acceder a servicios AWS sin necesidad de un login directo.

User pools permiten configurar requisitos de usuario como nombre, email, contraseña y autenticación multifactor (MFA).

Identity pools facilitan el acceso a servicios AWS para usuarios con cuentas externas o mediante sistemas de login personalizados, por ejemplo, para acceder a archivos en S3 sin tener una cuenta AWS.

## 2.5 IDENTITY POOLS

1. Tipos de Pools en Cognito
   User Pools: Gestionan el registro e inicio de sesión de usuarios (autenticación).
   Identity Pools: Proporcionan credenciales AWS para que los usuarios accedan a servicios AWS (autorización).

2. Identity Pool: Configuración Básica
   Crear un Identity Pool para gestionar permisos de usuarios.
   Decidir si se permiten usuarios no autenticados para acceso limitado (ej. solo lectura en S3).

3. Proveedores de Autenticación
   Se puede usar Cognito User Pool o proveedores externos (Amazon, Apple, etc.) para autenticar usuarios.

4. Roles y Permisos IAM
   Al crear el Identity Pool, se generan roles IAM para usuarios autenticados y no autenticados.
   Estos roles definen qué servicios y acciones pueden realizar los usuarios.
   Se pueden modificar o asignar roles personalizados para controlar accesos específicos (ej. llamar a APIs o funciones Lambda).

5. Flujo de Autorización
   Los usuarios se autentican mediante User Pool u otro proveedor.
   Luego, obtienen un rol del Identity Pool que les otorga permisos para interactuar con servicios AWS.

## 2.7 USER POOLS

1. Creación de User Pool
   Crear un user pool en Cognito para gestionar el registro e inicio de sesión de usuarios.
   Asignar un nombre al pool (ej. MyPool).

2. Configuración de Atributos y Seguridad
   Definir atributos de usuario como email, nombre de usuario, etc.
   Configurar requisitos de contraseña y métodos de verificación (email, MFA).
   Opcional: configurar triggers para ejecutar funciones Lambda durante eventos de usuario (registro, autenticación).

3. Gestión de Usuarios
   Visualizar usuarios registrados y su estado de verificación.
   Administrar políticas de seguridad y dispositivos recordados.

4. Integración con Identity Pool
   Copiar el ID del user pool para usarlo como proveedor de autenticación en el identity pool.
   Crear clientes de aplicación (app clients) para diferentes plataformas (móvil, web) con sus respectivos IDs.
   Asignar roles IAM a usuarios autenticados para controlar acceso a recursos AWS.

5. Flujo de Autenticación y Autorización
   Usuarios se autentican en el user pool.
   Identity pool asigna roles basados en la autenticación para acceder a servicios AWS.

##### 3.0 DEVELOPMENT

## 3.1 IAM IDENTITY ACCESS MANAGEMENT

## 3.2 USERS AND GROUP

##### 4.0 MESSAGING AND EVENT DRIVEN

## 4.1 SIMPLE QUEUE SERVICE SQS

## 4.2 SIMPLE NOTIFICATION SERVICE SNS
