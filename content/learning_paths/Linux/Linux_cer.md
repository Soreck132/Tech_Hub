###### LINUX CLI

##### 0.0 INTRODUCTION

## 0.1 What is Linux

    Linux is an operating system centered around its kernel, which acts as a bridge between software and hardware.
    The term GNU/Linux refers to the combination of the Linux kernel and GNU tools that provide the system's core utilities.
    Linux comes in many versions called distributions (distros), like Ubuntu Desktop, which is user-friendly and based on Debian.
    Most Linux distros use the Bash shell for the command line, making skills transferable across different systems.

- To clarify these concepts with examples:

## Kernel interaction:

    Think of the kernel as a translator between your software and your computer's hardware. For instance, when you open a file in a program, the kernel manages the request to read data from the hard drive.

## GNU/Linux:

    While Linux is the kernel, the commands you use in the terminal, like ls to list files or cp to copy files, come from GNU tools. Together, they form the full operating system.

## Distributions:

    Ubuntu is like a flavor of Linux with its own set of pre-installed software and settings, much like different editions of Windows. If you switch to Fedora (a Red Hat-based distro), many commands remain the same because they share the Bash shell and core utilities.

## Bash shell:

    This is the command line interface where you type commands. For example, typing pwd shows your current directory, and cd changes directories. These commands work similarly across most Linux distros.

##### 1.0 REST API

## 1.1 Using GitHub Codespaces with the course

    GitHub Codespaces provides a cloud-based Linux environment accessible through your browser, ideal if you don’t have a local Linux machine.

    It offers a Bash shell terminal similar to Ubuntu Linux, enabling you to practice command line exercises.
    Codespaces differs slightly from a local Linux system (e.g., user home directories, superuser privileges) but supports most course tasks.

    You can work with and save changes to the course’s exercise files directly within Codespaces.

## GitHub Codespaces for this course:

- 1.- Go to the course’s GitHub repository page.
- 2.- Click the "Fork" button near the top to create a copy of the repository in your own GitHub account.
- 3.- In your forked repository, click the green "Code" button.
- 4.- Under the "Codespaces" section, click "Create Codespace on Main" to start a new Codespace.
- 5.- Wait for the Codespace to initialize; it’s a Linux container running in the cloud.
- 6.- Once ready, open the terminal by clicking the three lines icon (top left), then select "Terminal" > "New Terminal."
- 7.- You can now use the terminal with the Bash shell to follow along with the course.
- 8.- To access course files, navigate to the ExerciseFiles directory using cd ExerciseFiles.
- 9.- If you make changes, commit them back to your fork using the source control panel.

## 1.2 Creating a Linux Virtual Machine

- 1.- Download VirtualBox from virtualbox.org. Choose the version for your operating system (Windows, Mac, or Linux).
- 2.- Install VirtualBox by running the downloaded installer and following the setup prompts.
- 3.- Download the Ubuntu Desktop ISO from ubuntu.com under the Desktop section. Select the version that matches your processor  
  architecture.
- 4.- Open VirtualBox and click the New button to create a new virtual machine.
- 5.- Name your virtual machine (e.g., Ubuntu Desktop) and select the downloaded Ubuntu ISO as the installation media.
- 6.- Allocate memory (RAM) to the VM; 8 GB (8192 MB) is recommended if your hardware supports it.
- 7.- Assign CPU cores; 4 cores is a good minimum.
- 8.- Create a virtual hard disk with at least 64 GB of space.
- 9.- Start the VM and follow the Ubuntu installation prompts: choose "Install Ubuntu," set up your user account, computer name, and password.
- 10.- Complete the installation and restart the VM when prompted.
- 11.- Log in to your new Ubuntu system.
- 12.- Open the Terminal from the applications menu to start using the Linux command line.

  This setup lets you practice Linux commands safely without affecting your main computer, which is ideal for building skills relevant to your work in support and database engineering.

## ##### Remember, the downloads are from:

VirtualBox: virtualbox.org
Ubuntu Desktop: ubuntu.com

## 2.0 COMMAND LINE BASICS

## 2.1 What is a command Line

    The Linux command line is a text-based interface where you type commands to interact with the system, often used in system administration and development.

    The shell is the software that runs your commands;
        Bash (Bourne Again Shell) is the most common shell on Linux and is used throughout this course.

    The terminal emulator is the program that provides the window for the shell;
        sometimes the terms shell, terminal, and console are used interchangeably.

    Command-line interfaces are essential for managing Linux systems, especially when no graphical interface is available, such as on servers or specialized devices.

     Console: When the shell is the only interface on the screen, often on servers or specialized devices.

## 2.2 Understand How commands are Structured

    Every command line statement starts with a command, which is the action or program you want to run (e.g., ls to list files).

    Options modify how the command behaves. They usually start with a dash (-) and can be single letters like -l for a detailed list or combined like -ahl.

    Arguments specify what the command operates on, such as a file or directory path (e.g., /usr/bin).

    For example, in the command ls -ahl /usr/bin, ls is the command, -ahl are options modifying the output, and /usr/bin is the argument telling it which directory to list.

    | Component |        Description.                    | Example |

    |-----------|----------------------------------------|---------|
    | Command   | The program or action you want to run. | ls (list files) |
    | Options   | Modify the command's behavior.
                  Usually start with a dash (-).
                  Can be single letters or combined.     | -l (long listing), -a (show all files), combined as -ahl |
    | Arguments | Specify what the command operates on,
                  like files or directories.             | /usr/bin (directory path) |

    Example of a full command:

    | Command | Options | Arguments |
    | ------- | ------- | --------- |
    | ls      | -ahl    | /usr/bin  |

    This means: list (ls) all files including hidden (-a), in long format (-l), with human-readable sizes (-h), inside the /usr/bin directory.

## 2.3 Write commnads in the SHELL at the Prompt

    The terminal is a program that runs a shell, which is a text-based interface to interact with the Linux system.

    The shell prompt shows useful info like your username, hostname, and current directory, where you type commands.

    Commands like ls list files; adding options like -l changes their behavior (e.g., showing detailed info).

    Commands must be typed exactly right; misspellings cause errors but won’t harm the system.

    The shell runs programs or built-in commands, and understanding how to use options and arguments is essential.

## 2.4 Finding help commands

    The man command is your go-to manual in Linux, providing detailed documentation about commands, their options, and usage.

    You can navigate man pages using keys like F (forward), B (backward), arrow keys, and Q to quit.

    Many commands offer a --help option for quick guidance, but man pages provide more comprehensive info.

    When you don’t know a command's name, use apropos to search descriptions for relevant commands.

    Experienced users rely on documentation rather than memorizing everything, and keeping your own notes can help build a personalized reference.

## 2.5 Helpful keyboard shortcuts in the terminal

    Mastering these shortcuts will significantly speed up your command line work and reduce mistakes, which is especially useful in support and database engineering tasks.

    Tab completion;  helps you quickly complete file, directory, and command names by pressing the Tab key, saving typing time and reducing errors.

    | Shortcut           |               Function                            |

    |--------------------|---------------------------------------------------|
    | Tab                | Auto-completes file, directory, or command names  |
    | Ctrl + C           | Cancels the current command                       |
    | Ctrl + Shift + C   | Copies selected text in the terminal              |
    | Ctrl + Shift + V   | Pastes text into the terminal                     |
    | Ctrl + A           | Moves cursor to the beginning of the command line |
    | Ctrl + E           | Moves cursor to the end of the command line       |
    | Ctrl + U           | Deletes from cursor to the beginning of the line  |
    | Ctrl + K           | Deletes from cursor to the end of the line        |
    | Up Arrow           | Scrolls backward through command history          |
    | Down Arrow         | Scrolls forward through command history           |
    | Ctrl + R           | Searches command history interactively            |

## ## 3.0 FILES DIRECTORIES AND PERMISSIONS

## 3.1 The LINUX File System

    La filosofía del estándar FHS (Filesystem Hierarchy Standard) en Linux es organizar el sistema de archivos de manera lógica y consistente para que los archivos y directorios estén en ubicaciones predecibles y uniformes en todas las distribuciones Linux. Esto facilita la administración del sistema y asegura que los programas, configuraciones y bibliotecas se encuentren siempre en lugares esperados, lo que mejora la interoperabilidad y el funcionamiento del software.

    | Concepto                        | Explicación                                                                                                 |
    | ------------------------------- | ----------------------------------------------------------------------------------------------------------- |
    | Raíz del sistema (/)            | Es el nivel más alto del sistema de archivos en Linux, donde comienza toda la jerarquía.                    |
    | Directorio /home                | Contiene los archivos personales de cada usuario, con subdirectorios nombrados según el usuario.            |
    | Directorio /etc                 | Almacena archivos de configuración para la mayoría de los programas del sistema.                            |
    | Directorios /bin y /sbin        | Contienen programas esenciales para el funcionamiento del sistema.                                          |
    | Directorio /lib                 | Guarda bibliotecas compartidas y módulos necesarios para el sistema y programas.                            |
    | Directorio /root                | Es el directorio personal del usuario root, diferente de la raíz del sistema.                               |
    | Estándar de jerarquía           | Asegura que los archivos y directorios estén en ubicaciones consistentes en distintas distribuciones Linux. |
    | Navegación en línea de comandos | Entender estos directorios es fundamental para gestionar y desarrollar en sistemas Linux.                   |

## 3.2 Understanding File Paths

    Rutas absolutas:
        Comienzan desde la raíz del sistema de archivos (/), indicando la ubicación completa de un archivo o directorio sin ambigüedad.

- Ejemplo: /home/miguel/documentos se refiere a la carpeta "documentos" dentro del directorio personal de Miguel, sin importar dónde estés ubicado en el sistema.

  Rutas relativas:
  Se basan en el directorio de trabajo actual y pueden cambiar según dónde te encuentres en el sistema.

- Ejemplo: Si estás en /home/miguel y quieres acceder a la carpeta "documentos", puedes usar simplemente documentos como ruta.

  El carácter slash (/):
  Se usa para separar los nombres de directorios en una ruta.

- Ejemplo: En la ruta /var/log/syslog, cada slash separa los directorios "var", "log" y el archivo "syslog".

  Uso de "..":
  Permite referirse al directorio padre, facilitando moverse hacia arriba en la jerarquía.

- Ejemplo: Si estás en /home/miguel/documentos y quieres ir a /home/miguel, puedes usar .. para subir un nivel, es decir, cd ...

  El carácter tilde (~):
  Representa el directorio home del usuario actual, expandiéndose a una ruta absoluta específica para cada usuario.

- Ejemplo: ~/documentos es una forma rápida de referirse a la carpeta "documentos" dentro de tu directorio personal, sin importar en qué directorio estés.

## 3.3 Navigating the File system

    Comando cd para cambiar directorios:
        Permite moverse entre carpetas en la terminal.

- Ejemplo: cd documentos cambia al directorio "documentos" dentro del directorio actual.

  Rutas relativas:
  Se basan en el directorio actual y no comienzan con una barra (/).

- Ejemplo: Si estás en tu directorio home (~), cd documentos te lleva a la carpeta "documentos" dentro de tu home.

  Rutas absolutas:
  Comienzan desde la raíz del sistema de archivos (/), indicando la ubicación completa.

- Ejemplo: cd /home/miguel/documentos te lleva directamente a esa carpeta sin importar dónde estés.

  Uso de ".." para subir directorios:
  Permite subir un nivel en la jerarquía de carpetas.

- Ejemplo: Si estás en /home/miguel/documentos, cd .. te lleva a /home/miguel.

  Uso de "-" para volver al directorio anterior:
  Cambia al último directorio donde estuviste.

- Ejemplo: Si cambiaste de /home/miguel a /etc, cd - te regresa a /home/miguel.

  Tilde (~) para el directorio home del usuario:
  Es un atajo para referirse a tu carpeta personal.

- Ejemplo: cd ~/documentos te lleva a la carpeta "documentos" dentro de tu directorio home, sin importar dónde estés.

## 3.4 Finding directory and file information

Comando ls para listar contenidos:
Muestra los archivos y directorios dentro de una carpeta.

- Ejemplo: ls -l muestra una lista detallada con permisos, propietario, tamaño y fecha de modificación.
  Descripción: Te permite ver información importante para gestionar archivos y entender su estado.

Tipos de archivos indicados en la primera columna:

d indica un directorio.

- indica un archivo regular.
  l indica un enlace simbólico.

* Ejemplo: En la salida de ls -l, un archivo con d al inicio es un directorio.

Permisos de archivos:
Muestran qué acciones pueden realizar usuarios y grupos (lectura, escritura, ejecución).

- Ejemplo: -rw-r--r-- indica que el propietario puede leer y escribir, mientras que otros solo pueden leer.

Colores en la salida de ls: 4
Ayudan a identificar tipos de archivos (directorios en azul, enlaces en celeste, archivos regulares en blanco/gris).

Comando file para identificar tipo de archivo:

- Ejemplo: file poemas.txt indica que es un archivo de texto ASCII.
- Descripción: Útil para saber el tipo real de un archivo cuando su extensión no es clara.

Comando stat para información detallada de archivos:

- Ejemplo: stat poemas.txt muestra tamaño, permisos, propietario y fechas de acceso/modificación.
- Descripción: Proporciona detalles extendidos para administración y diagnóstico.

## 3.5 Create and remove directories

Crear directorios:
Usa mkdir seguido del nombre del directorio para crear uno nuevo en el directorio actual.
Crear directorios en rutas específicas:
Especifica la ruta completa para crear directorios en ubicaciones diferentes.
Crear múltiples directorios a la vez:
Puedes listar varios directorios separados por espacios con mkdir para crearlos simultáneamente.
Opción -p:
Usa mkdir -p para crear directorios padres automáticamente si no existen.
Eliminar directorios vacíos:
Usa rmdir para eliminar directorios, pero solo funciona si están vacíos.
Limitación de rmdir:
No puede eliminar directorios que contengan archivos o subdirectorios.

## 3.6 Copy, move and delete files and directories

Copiar archivos:
Usa cp origen destino para duplicar archivos. Puedes copiar a otra carpeta o cambiar el nombre al copiar.
Mover y renombrar archivos:
Usa mv archivo destino para mover o renombrar archivos.
Uso del punto (.) para representar el directorio actual en comandos.
Comodines: \* representa cualquier cantidad de caracteres, ? representa un solo carácter. Útiles para mover o eliminar múltiples archivos.
Eliminar archivos:
Usa rm archivo para borrar archivos. No hay papelera, los archivos se eliminan permanentemente.
Eliminar directorios y su contenido: Usa rm -r directorio para eliminar directorios con archivos dentro.

## 3.7 Find files from the command line

Comando find:
Se usa para buscar archivos en el sistema.
Sintaxis básica:
find [ruta] -name "patrón" para buscar archivos por nombre.
Uso del punto (.) para indicar el directorio actual.
Comodín asterisco (*):
Representa cualquier número de caracteres en el patrón.
Búsqueda sensible a mayúsculas/minúsculas:
-name es sensible, -iname no lo es.
Buscar en directorios específicos:
Cambia la ruta para buscar en otras ubicaciones, por ejemplo, find ~/documents -name "*d\*".
Consulta de ayuda:
Explora las páginas man para conocer más opciones y profundizar en el uso

## 3.8 Understand user role and sudo

Usuarios en Linux:
Sistemas modernos son multiusuario; cada usuario tiene su propio directorio y permisos.
Roles de usuario:
Usuarios normales pueden gestionar sus archivos, pero no pueden cambiar configuraciones del sistema; el superusuario (root) tiene todos los privilegios.
Cambio de usuario:
Comando su [usuario] permite cambiar a otro usuario, requiere contraseña.
Uso de sudo:
Permite a usuarios autorizados ejecutar comandos con privilegios de root temporalmente, evitando riesgos de usar root directamente.
Seguridad en sudo:
Al usar sudo, se pide la contraseña del usuario y no se muestra en pantalla para protegerla.
Indicadores visuales:
El prompt cambia de $ a # cuando se trabaja como root para recordar el nivel de privilegio.
Salir de root:
Comando exit regresa al usuario normal después de usar sudo o su.
Para acceder al administrador; tecleamos sudo -i, nos dara acceso a /var/root el cuel significa que estamos en modo administrador
Para terminar con el modo administrador: tecleamos sudo -k y saldremos del directorio raiz.

## 3.9 Understand file permission

Estructura de permisos:
Tres secciones para usuario (propietario), grupo y otros usuarios.
Letras de permisos:
r (leer), w (escribir), x (ejecutar).
Modificación de permisos:
Comando chmod con dos notaciones:
Octal (números, por ejemplo, 777, 644) asigna permisos sumando valores (4=leer, 2=escribir, 1=ejecutar).
Simbólica (letras y operadores, por ejemplo, u+rwx, g=r, o-rwx) para añadir, quitar o asignar permisos.

Cambio de propietario y grupo:  
 Comandos chown y chgrp.
Permisos claros y sin ambigüedad:
Uso de números y símbolos para definir exactamente quién puede hacer qué.

## 3.10 Modify file permissions

## 3.11 Create hard and symbolic links

¿Qué es un enlace en Linux?

Archivo que apunta a otro archivo para evitar duplicados.

Tipos de enlaces:

Enlace simbólico (soft link o symlink):

Apunta a la ruta del archivo original.
Se crea con ln -s <archivo_origen> <nombre_enlace>.
Puede romperse si se mueve el archivo original o el enlace (si es relativo).
Puede usar rutas absolutas para evitar romperse al mover el enlace.

Enlace duro (hard link):

Apunta directamente a los datos en disco.
Se crea con ln <archivo_origen> <nombre_enlace> (sin -s).
No se rompe si se mueve el archivo original.
Aparece como un archivo normal, compartiendo el mismo contenido.
El número de enlaces se refleja en la lista de archivos.

Usos y consideraciones:

Los enlaces evitan duplicar archivos, ahorrando espacio.
Editar un enlace modifica el archivo original.
Enlaces simbólicos son más flexibles pero pueden romperse.
Enlaces duros son más robustos pero no pueden enlazar directorios ni archivos en diferentes sistemas de archivos.

## ## 4.0 COMMON COMMAND-LINE TASKS AND TOOLS

## 4.1 THE IMPORTANCE OF MODULARITY

Principio de Modularity:

Cada herramienta hace una sola tarea y la hace bien.
Herramientas diseñadas para operar con texto como entrada y salida.

Ventajas de la modularidad:

Permite combinar herramientas especializadas para tareas complejas.
Facilita la flexibilidad y reutilización de comandos.

Analogía:

No es una navaja suiza multifuncional, sino una cocina con herramientas especializadas.
Cada herramienta es como un utensilio de chef que cumple una función específica.

Ejemplo de uso:

Leer texto de un archivo → filtrar texto → eliminar líneas duplicadas → guardar resultado.

## 4.2 USE PIPES TO CONNECT COMMANDS TOGETHER

¿Qué es un pipe?

Conecta la salida de un comando con la entrada de otro.
Permite procesar datos paso a paso de forma modular.

Símbolo del pipe:

Representado por el carácter vertical |.
Usualmente se encuentra como Shift + tecla de barra invertida (\) en teclados US.

Ejemplo práctico:

echo "hello" | wc
echo envía texto; wc cuenta líneas, palabras y caracteres.

Concepto de pipeline:

Cadena de comandos conectados por pipes.
Facilita transformar datos en varias etapas.

## 4.3 VIEW TEXT FILES WITH CAT, HEAD, TAIL AND LESS

cat (concatenate)

Muestra el contenido completo de un archivo en pantalla.
Útil para combinar archivos o pasar contenido a otros comandos mediante pipes.
Opción -n añade números de línea al mostrar el contenido.

head y tail

head: muestra las primeras líneas de un archivo (por defecto 10 líneas).
tail: muestra las últimas líneas de un archivo (por defecto 10 líneas).
Opción -n permite especificar el número exacto de líneas a mostrar.

Uso de pipes (|)

Permite conectar la salida de un comando como entrada de otro.
El orden de los comandos en la tubería afecta el resultado final.
Ejemplo: cat -n archivo.txt | tail -n5 numera todas las líneas y luego muestra las últimas 5.

less

Presenta el contenido de un archivo página por página.
Permite navegar con teclas (flechas, espacio, F para adelante, B para atrás).
Se puede usar con archivos directamente o con salida de otros comandos mediante pipes.
Se sale con la tecla Q.

## 4.4 SEARCH FOR TEXT IN FILES AND STREAMS

Función básica:

Busca y muestra líneas que coinciden con un patrón.
Sintaxis: grep "patrón" archivo.txt

Opciones importantes:

-n: Muestra número de línea junto con la línea coincidente.
-i: Búsqueda insensible a mayúsculas/minúsculas.
-v: Muestra líneas que NO coinciden con el patrón (inverso).
-E: Permite usar expresiones regulares extendidas (regex).

Ejemplos de uso:

Buscar texto exacto: grep "the" poemas.txt
Buscar sin importar mayúsculas: grep -i "the" poemas.txt
Excluir líneas con texto: grep -vi "the" poemas.txt
Buscar letras específicas con regex: grep -E "[hijk]" poemas.txt
Buscar palabras con 6 o más caracteres: grep -E "\w{6,}" poemas.txt

Notas:

grep es sensible a mayúsculas por defecto.
Las expresiones regulares permiten búsquedas avanzadas y flexibles.
grep es una herramienta poderosa para analizar logs y archivos de texto.

## 4.5 MANIPULATE TEXT WITH AWK, SED, AND SORT

Manipulación de Texto en Linux con awk, sed y sort

awk

Extrae datos de archivos según reglas definidas.
Sintaxis básica: awk '{print $2}' archivo.txt muestra la segunda columna.
Permite combinar y presentar columnas con tabulaciones.
Útil para scripts y procesamiento de datos.

sed (stream editor)

Modifica texto en flujo o archivos directamente.
Sintaxis para sustitución: sed s/TextoAntiguo/TextoNuevo/g archivo.txt
La opción g reemplaza todas las ocurrencias en cada línea.

sort

Ordena líneas de texto.
Ejemplo: sort -k2 -n archivo.txt ordena por la segunda columna numéricamente.
Opción -u muestra solo líneas únicas, útil para filtrar duplicados.

Otros comandos útiles

rev: invierte caracteres en cada línea.
tac: muestra líneas en orden inverso.
tr: traduce o elimina caracteres específicos.

## 4.6 EDITH TEXT WITH VIM

Editor Vim: Conceptos Básicos

Modos de Vim

Modo Inserción: para escribir y editar texto (se activa con i, I, o).
Modo Comando: para navegar, manipular texto y emitir comandos (se activa con Esc).

Navegación en Modo Comando

h: mover cursor a la izquierda
l: mover cursor a la derecha
j: mover cursor hacia abajo
k: mover cursor hacia arriba
Shift+G: ir al final del archivo
1G: ir al inicio del archivo

Comandos para Insertar Texto

i: insertar antes del cursor
I: insertar al inicio de la línea
o: abrir nueva línea después de la actual

Guardar y Salir

:w nombre_archivo: guardar archivo
:wq: guardar y salir
:q!: salir sin guardar

Consejo Importante

Para salir sin guardar y evitar quedarse atrapado, usar Esc + :q!

## 4.7 EDITH TEXT WITH NANO

Editor Nano: Uso Básico en Linux

Inicio y apertura

Comando para abrir Nano: nano
Para editar un archivo existente: nano nombre_archivo

Navegación en el buffer (área de texto)

Flechas para moverse por el texto
Atajos útiles:
Ctrl + A: ir al inicio de la línea
Ctrl + E: ir al final de la línea

Edición de texto

Cortar línea: Ctrl + K
Pegar línea cortada: Ctrl + U

Guardar y salir

Guardar archivo: Ctrl + O, luego ingresar nombre y Enter
Salir de Nano: Ctrl + X
Si hay cambios sin guardar, Nano pregunta para guardar antes de salir

Búsqueda de texto

Buscar palabra o texto: Ctrl + W, escribir término y Enter
Repetir búsqueda: Ctrl + W + Enter

Desplazamiento rápido

Ctrl + V: avanzar una pantalla
Ctrl + Y: retroceder una pantalla

Consejos importantes

Nano es más sencillo que Vim, con comandos visibles en pantalla
Conocer Nano y Vim aumenta tu flexibilidad y eficiencia en Linux

## 4.8 WORKING WITH ZIP ARCHIVE

Key Points on Linux Archive Files from the Video:

Tar Files (Tape Archive):

Combine multiple files into one large file for easier storage and sharing.
Commonly used in Linux; may or may not include compression.
Compression types include gzip (.tar.gz, .tgz) and bzip2 (.tar.bz2).

Creating Tar Archives:

tar -cvf filename.tar directory/ creates an archive.
Options: c (create), v (verbose), f (file output).
Compression can be added with a (auto) or z (gzip).

Extracting Tar Archives:

Use tar -xf filename.tar to extract.
Extract into a specific directory with -C directory option.

Zip Files:

Widely used and cross-platform (Linux, Windows, macOS).
Create with zip -r archive.zip directory/ (recursive to include contents).
Extract with unzip archive.zip.
Extract to a specific directory with unzip archive.zip -d directory.

Best Practices:

Extract archives in new directories to avoid clutter.
Understand compression trade-offs: gzip is faster, bzip2 offers better compression but slower.

## 4.9 OUTPUT REDIRECTION

Conceptos Básicos de Flujos en Linux:

Entrada estándar (stdin, descriptor 0): Texto que entra al shell o programa, usualmente desde el teclado.
Salida estándar (stdout, descriptor 1): Resultado de comandos que normalmente se muestra en pantalla.
Error estándar (stderr, descriptor 2): Mensajes de error que aparecen cuando un comando falla.

Redirección de Salida:

Usar > para enviar la salida estándar a un archivo, reemplazando su contenido.
Usar 1> es equivalente a > para redirigir la salida estándar.
Usar >> para añadir (append) la salida al final de un archivo sin borrar su contenido.

Redirección de Errores:

Usar 2> para enviar mensajes de error a un archivo.
Se pueden redirigir salida y error a archivos diferentes o al mismo archivo combinando redirecciones.

Precauciones:

Redirigir con un solo > sobreescribe el archivo, lo que puede borrar datos importantes.

## 4.10 EXPLORING ENVIRONMENTS VARIABLES AND PATH

Variables de Entorno y PATH:

Las variables de entorno controlan opciones y comportamientos del shell.
PATH es una variable que contiene una lista de directorios donde el shell busca programas ejecutables.

Visualización y Uso:

El comando env muestra todas las variables de entorno.
echo $PATH muestra específicamente el contenido de PATH.
El comando which <comando> indica la ubicación real de un programa en el sistema.

Importancia de PATH:

Permite ejecutar comandos sin escribir la ruta completa.
Facilita el uso de programas instalados en directorios estándar.

Modificar PATH:

Se puede agregar directorios personalizados editando el archivo oculto .bash_profile en el directorio home.
Se usa nano ~/.bash_profile para crear o modificar este archivo.
La sintaxis para agregar rutas es: PATH="$PATH:/ruta/nueva".
Después de modificar, se debe cerrar y reabrir el shell para aplicar cambios.

## ## 5.0 ADVANCE TOPICS

## 5.1 FIND SYSTEM HARDWARE AND DISK INFORMATION

    1. Memoria del Sistema:

    Comando: free -h
    Muestra la memoria total, usada y disponible en formato legible.

    2. Información del Procesador:

    Comando: lscpu o cat /proc/cpuinfo
    Detalla modelo, arquitectura y características del CPU.

    3. Espacio en Disco:

    Comando: df -h para ver uso y espacio libre en discos montados.
    Para un disco específico: df -h /

    4. Uso de Disco por Directorios:

    Comando: sudo du -hd1 /
    Muestra tamaño ocupado por directorios a un nivel de profundidad.

    5. Información de Hardware:

    Comando: lshw para listado detallado de hardware.
    Comandos: lspci y lsusb para dispositivos PCI y USB.

    6. Dirección de Red:

    Comando: ip a
    Muestra direcciones IP y estado de adaptadores de red.

    Consejo: Usa sudo cuando sea necesario para permisos elevados.
