###### LEARNING BITBUCKET

##### 0.0 INTRODUCTION TO BITBUCKET

## 0.1 WHAT IS BITBUCKET?

    Bitbucket is a cloud-based tool that helps you store and manage your code online. It lets you track changes to your code, work together with others by creating branches and pull requests, and organize your projects efficiently. Think of it like a shared workspace for your code where you can safely save your work, see updates, and collaborate with your team—all in one place.

## 0.2 CREATE AN ATTLASSIAN ACCOUNT

    Para usar Bitbucket, primero debes crear una cuenta Atlassian.
    Puedes registrarte con tu correo electrónico o usar una cuenta existente de Google, Microsoft, Apple o Slack.
    Al iniciar sesión en Bitbucket por primera vez, crearás un nombre de usuario único y memorable.
    Atlassian ofrece una encuesta rápida para personalizar tu experiencia, que puedes completar o saltar.
    Bitbucket organiza el trabajo usando espacios de trabajo, proyectos y repositorios.

    Y aquí tienes un paso a paso para crear tu cuenta Atlassian con la URL necesaria:

    Ve a la página de registro oficial de Atlassian: https://id.atlassian.com/signup
    Regístrate usando tu correo electrónico o una cuenta existente de Google, Microsoft, Apple o Slack.
    Completa el formulario con los datos solicitados y crea tu cuenta.
    Inicia sesión en tu cuenta Atlassian.
    Selecciona el icono de Bitbucket para acceder a la plataforma.
    Si es tu primera vez en Bitbucket, crea un nombre de usuario único y fácil de recordar.
    Puedes participar en la encuesta rápida para personalizar tu experiencia o saltarla.

## 0.3 BITBUCKET CONTENT ORGANIZATION

    | Component   | Role/Function                                                  | Access Control                                                      | Naming Rules                                       |
    |-------------|----------------------------------------------------------------|---------------------------------------------------------------------|----------------------------------------------------|
    | Workspace   | Contains projects and repositories; main container.            | Can be public (anyone can view) or private (restricted access)      | Must have a unique identifier across all Bitbucket |
    | Project     | Contains repositories; manages access and settings             | Can be public or private                                            | Name must be unique within the workspace           |
    | Repository  | Contains files and revision history; central for collaboration | Can be public or private                                            | Name must be unique within the workspace.          |

##### 1.0 GETTING STARTED WITH BITBUCKET

## 1.1 CREATE PUBLIC AND PRIVATE REPOSITORIES

    | Aspecto | Repositorio Público | Repositorio Privado |

    |--------------------------|--------------------------------------------------|----------------------------------------------------|
    | Visibilidad              | Visible para casi cualquier persona en internet  | Oculto y accesible solo para usuarios autorizados  |
    | Permisos para contribuir | Requiere permisos específicos para hacer cambios | Solo usuarios con permiso pueden ver y contribuir  |
    | Uso típico               | Ideal para proyectos de código abierto           | Adecuado para código propietario o datos sensibles |


    1. Crea un espacio de trabajo (workspace) con un nombre único a nivel global. Por defecto, el espacio de trabajo es privado, pero puedes cambiarlo a público si lo deseas.

    2. Dentro del espacio de trabajo, haz clic en "Crear repositorio".

    3. Llena el formulario con el nombre del proyecto y el nombre del repositorio. Si no tienes proyectos creados, primero crea uno.

    4. Decide si el repositorio será público o privado desmarcando o dejando marcada la opción de privacidad (por defecto es privado).

    5. Mantén las demás configuraciones por defecto o ajústalas según tus necesidades.

    6. Selecciona "Crear repositorio" para finalizar.

    7. Puedes verificar que tu repositorio público es accesible desde un navegador en modo incógnito, mientras que el privado no será visible  sin permisos.

## 1.2 ADD FILES TO A REPOSITORY

    1. Inicia sesión en tu cuenta de Bitbucket y abre la página principal del repositorio donde quieres agregar el archivo.

    2. Selecciona la pestaña "Source" (Fuente) en el menú lateral para ver el contenido del repositorio.

    3. Haz clic en el ícono de tres puntos (menú) en la parte derecha y elige la opción "Add file" (Agregar archivo).

    4. En la interfaz que aparece, escribe el nombre del archivo, incluyendo la extensión adecuada (por ejemplo, "HelloWorld.py" para un archivo Python).

    5. Escribe el contenido del archivo en el editor que aparece debajo del nombre.

    6. Opcionalmente, ajusta las configuraciones de formato, como el tipo de sintaxis, indentación y ajuste de línea, si es necesario.

    7. Haz clic en "Commit" para guardar el archivo en el repositorio.

    8. En el formulario que aparece, puedes escribir un mensaje de commit para describir los cambios o aceptar el mensaje predeterminado.

    9. Confirma el commit y el archivo se agregará al repositorio.

    10. Después, puedes revisar el archivo y su historial de commits desde la pestaña correspondiente.

## 1.3 ADD AN SSH FOR AUTHENTICATION

- QUE ES UNA SSH KEY?
  Una clave SSH es como una llave digital que te permite conectarte de forma segura a servidores remotos, como Bitbucket, sin usar contraseñas. Funciona con dos partes: una clave pública que compartes con el servidor y una clave privada que guardas solo tú en tu computadora. Esto ayuda a proteger tu código y datos.
  1.  Abre la terminal en tu computadora (puede ser en Mac, Windows o Linux).

  2.  Ejecuta el comando para crear la clave SSH: ssh-keygen -t ed25519 -C "my bitbucket key" -f ~/.ssh/bitbucket

          -t ed25519: Especifica el tipo de algoritmo de criptografía a utilizar (Ed25519), altamente recomendado por su seguridad y eficiencia.

          -C "my bitbucket key": Añade un comentario (una etiqueta descriptiva) para identificar fácilmente la clave.

          -f ~/.ssh/bitbucket: Define la ruta y el nombre con el que se guardarán los archivos de la clave privada y pública en tu equipo.

  3.  Cuando te pregunte por una passphrase (contraseña para la clave), puedes dejarla vacía para facilitar el uso automatizado con Git, y presiona Enter dos veces.

  4.  Verás una imagen de arte aleatorio que confirma que la clave se creó correctamente.

  5.  Usa el comando ls ~/.ssh para verificar que las claves están en la carpeta correcta.

  6.  Crea o edita el archivo de configuración SSH (~/.ssh/config) para que Git use la clave correcta al conectarse a Bitbucket. Puedes copiar la configuración del video.

  7.  Copia el contenido de tu clave pública con cat ~/.ssh/id_rsa.pub.

  8.  Entra a tu cuenta de Bitbucket, ve a Configuración personal > SSH keys.

  9.  Agrega una nueva clave SSH pegando la clave pública copiada y asigna un nombre o etiqueta.

  10. Guarda la clave y ya podrás usarla para autenticarte y trabajar con tus repositorios de forma segura.

## 1.4 CLONE A REPO TO A LOCAL SYSTEM

    Clonar en Bitbucket significa crear una copia local de un repositorio remoto para trabajar en tu computadora sin necesidad de estar siempre conectado a internet. Esto te permite editar, agregar o modificar archivos localmente y luego sincronizar esos cambios con el repositorio remoto.

    1.  Aquí tienes el proceso paso a paso para clonar un repositorio según el video:

    2. Inicia sesión en tu cuenta de Bitbucket y abre la página principal del repositorio que quieres clonar.

    3. Busca y haz clic en el botón "Clone" (Clonar) en la parte superior derecha del repositorio.

    4. Se abrirá un diálogo con el comando git clone ya preparado, que incluye la URL necesaria para conectar con el repositorio.

    5. Copia el comando completo usando el icono de copiar (dos cuadrados apilados).

    6. Abre la terminal o consola en tu computadora (puede ser Mac, Windows o Linux).
       Pega el comando git clone y ejecútalo.
    7. La primera vez que te conectes, puede que te pregunte si confías en la conexión; escribe "yes" para continuar.
    8. El repositorio se descargará en tu sistema local, creando una carpeta con todo el contenido y el historial de cambios.

    9. Entra a esa carpeta con el comando cd para empezar a trabajar con los archivos localmente.

    Este método te permite trabajar offline y usar tus herramientas locales para desarrollar, mientras mantienes sincronizado tu trabajo con Bitbucket cuando haces push de tus cambios.

## 1.5 USE GIT WORKFLOW

    ¿Para qué sirve el git workflow?

El flujo de trabajo de Git sirve para gestionar de manera organizada y segura los cambios en el código fuente. Permite que los desarrolladores trabajen localmente en sus archivos, registren cada cambio con contexto, y luego sincronizen esos cambios con el repositorio remoto para colaborar con otros. Esto asegura que el historial del proyecto esté bien documentado, facilita la colaboración en equipo y ayuda a evitar conflictos o pérdidas de información.

| Comando    | Descripción                                                                                                                                      | Ejemplo      |
| ---------- | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------ |
| git status | Muestra el estado actual del directorio de trabajo, indicando qué archivos están modificados, preparados o sin seguimiento, y en qué rama estás. | `git status` |

| git add | Prepara los archivos modificados o nuevos para incluirlos en el próximo commit. Puedes agregar archivos específicos o todos con `git add .`. | `git add archivo.txt` o `git add .` |

| git commit | Crea una instantánea de los archivos preparados, guardando los cambios con un mensaje descriptivo. | `git commit -m "Agrega función de login"` |

| git push | Sube los commits locales al repositorio remoto en Bitbucket para compartir los cambios con el equipo. | `git push origin main` |

## 1.6 PUSH CODE TO A REMOTE REPO

    Pushing code to a remote repository means uploading the changes you've made on your local computer to the online repository in Bitbucket. This keeps your remote repo updated with your latest work so others on your team can see and collaborate on it.

    Here's what happens step by step:

You make changes to files on your local system.
You stage those changes using git add.
You commit the changes with git commit to save a snapshot.
You run git push to send those commits from your local repo to the remote Bitbucket repository.

##### 2.0 WORKING WITH BRANCHES AND PULL REQUEST

## 2.1 CREATE A BRANCH

## 2.2 PUSH CODE TO A BRANCH

## 2.3 CREATE A PULL REQUEST

##### 3.0 WORKING WITH JIRA CLOUD

## 3.1 MANAGE PROJECTS WITH JIRA AND BITBUCKET

## 3.2 CONNECT JIRA TO BITBUCKET

## 3.3 AUTOMATE ISSUE UPDATE

## 3.4 CREATE AN ISSUE AND LINK TO THE BITBUCKET BRANCH

## 3.5 UPDATE AND CLOSED ISSUES FROM BITBUCKET
