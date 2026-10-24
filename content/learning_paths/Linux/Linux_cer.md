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

## 3.6 Copy, move and delete files and directories

## 3.7 Find files from the command line

## 3.8 Understand user role and sudo

## 3.9 Understand file permission

## 3.10 Modify file permissions

## 3.11 Create hard and symbolic links

## 2.3 Write commnads in the SHELL at the Prompt

## 2.3 Write commnads in the SHELL at the Prompt
