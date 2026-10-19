## LINUX COMANDOS MAS USADOS

| Comando   | Descripción                                                       | Ejemplo                            |
| --------- | ----------------------------------------------------------------- | ---------------------------------- |
| `ls`      | Lista archivos y directorios.                                     | `ls -lah`                          |
| `cd`      | Cambia de directorio.                                             | `cd /var/log`                      |
| `pwd`     | Muestra el directorio actual.                                     | `pwd`                              |
| `tree`    | Muestra estructura de directorios en forma de árbol.              | `tree /var/log`                    |
| `cp`      | Copia archivos o directorios.                                     | `cp file.txt /tmp/`                |
| `mv`      | Mueve o renombra archivos/directorios.                            | `mv old.log new.log`               |
| `rm`      | Elimina archivos o directorios.                                   | `rm file.txt`                      |
| `mkdir`   | Crea un directorio.                                               | `mkdir logs`                       |
| `rmdir`   | Elimina un directorio vacío.                                      | `rmdir logs`                       |
| `touch`   | Crea un archivo vacío o actualiza su timestamp.                   | `touch app.log`                    |
| `file`    | Identifica el tipo de archivo.                                    | `file app.log`                     |
| `stat`    | Muestra información detallada de un archivo.                      | `stat app.log`                     |
| `cat`     | Muestra el contenido de un archivo.                               | `cat config.txt`                   |
| `less`    | Permite visualizar archivos grandes página por página.            | `less application.log`             |
| `more`    | Visualiza contenido página por página.                            | `more application.log`             |
| `head`    | Muestra las primeras líneas de un archivo.                        | `head -20 app.log`                 |
| `tail`    | Muestra las últimas líneas.                                       | `tail -20 app.log`                 |
| `tail -f` | Monitorea un archivo en tiempo real. Muy usado con logs.          | `tail -f application.log`          |
| `grep`    | Busca texto/patrones dentro de archivos.                          | `grep "ERROR" app.log`             |
| `grep -i` | Busca ignorando mayúsculas/minúsculas.                            | `grep -i "error" app.log`          |
| `grep -r` | Busca recursivamente en directorios.                              | `grep -r "ERROR" /var/log`         |
| `grep -v` | Excluye líneas que coincidan.                                     | `grep -v "DEBUG" app.log`          |
| `find`    | Busca archivos/directorios según diferentes criterios.            | `find /var/log -name "*.log"`      |
| `locate`  | Busca archivos rápidamente usando una base de datos.              | `locate application.log`           |
| `which`   | Muestra dónde está instalado un comando.                          | `which java`                       |
| `whereis` | Busca binarios, fuentes y manuales relacionados con un comando.   | `whereis java`                     |
| `awk`     | Procesa y extrae columnas/datos de texto.                         | `awk '{print $1}' file.txt`        |
| `sed`     | Busca, reemplaza y transforma texto.                              | `sed 's/ERROR/WARN/g' app.log`     |
| `sort`    | Ordena líneas.                                                    | `sort names.txt`                   |
| `uniq`    | Elimina líneas consecutivas duplicadas.                           | `sort names.txt \| uniq`           |
| `cut`     | Extrae columnas o caracteres.                                     | `cut -d',' -f1 data.csv`           |
| `wc`      | Cuenta líneas, palabras y caracteres.                             | `wc -l app.log`                    |
| `tr`      | Reemplaza o elimina caracteres.                                   | `tr 'a-z' 'A-Z'`                   |
| `xargs`   | Ejecuta comandos utilizando datos recibidos por entrada estándar. | `find . -name "*.log" \| xargs rm` |
| `tee`     | Envía salida a pantalla y archivo simultáneamente.                | `command \| tee output.txt`        |

## PROCESOS Y RENDIMIENTO

| Comando   | Descripción                                                  | Ejemplo              |
| --------- | ------------------------------------------------------------ | -------------------- |
| `ps`      | Muestra procesos en ejecución.                               | `ps aux`             |
| `ps -ef`  | Muestra procesos con información detallada.                  | `ps -ef`             |
| `top`     | Monitoriza CPU, memoria y procesos en tiempo real.           | `top`                |
| `htop`    | Alternativa interactiva a `top`.                             | `htop`               |
| `kill`    | Envía una señal a un proceso.                                | `kill 1234`          |
| `kill -9` | Termina forzosamente un proceso.                             | `kill -9 1234`       |
| `pkill`   | Mata procesos por nombre.                                    | `pkill java`         |
| `pgrep`   | Busca PID de procesos por nombre.                            | `pgrep java`         |
| `nice`    | Inicia un proceso con una prioridad determinada.             | `nice -n 10 command` |
| `renice`  | Cambia la prioridad de un proceso existente.                 | `renice 10 -p 1234`  |
| `jobs`    | Muestra trabajos ejecutados desde el shell.                  | `jobs`               |
| `bg`      | Envía un trabajo al background.                              | `bg %1`              |
| `fg`      | Trae un trabajo al foreground.                               | `fg %1`              |
| `nohup`   | Ejecuta un proceso que continúa después de cerrar la sesión. | `nohup ./app.sh &`   |
| `free`    | Muestra uso de memoria RAM y swap.                           | `free -h`            |
| `uptime`  | Muestra tiempo encendido y load average.                     | `uptime`             |
| `vmstat`  | Muestra estadísticas de CPU, memoria y procesos.             | `vmstat 2`           |
| `iostat`  | Muestra estadísticas de CPU y discos.                        | `iostat`             |
| `sar`     | Muestra estadísticas históricas/de rendimiento del sistema.  | `sar -u 5 3`         |

## DISCOS ARCHIVOS Y ALMACENAMIENTO

| Comando    | Descripción                                            | Ejemplo                |
| ---------- | ------------------------------------------------------ | ---------------------- |
| `df`       | Muestra espacio disponible en filesystem.              | `df -h`                |
| `du`       | Muestra cuánto espacio utilizan archivos/directorios.  | `du -sh /var/log`      |
| `du -sh *` | Muestra tamaño de cada elemento del directorio actual. | `du -sh *`             |
| `lsblk`    | Lista discos y dispositivos de almacenamiento.         | `lsblk`                |
| `mount`    | Monta un filesystem.                                   | `mount /dev/sdb1 /mnt` |
| `umount`   | Desmonta un filesystem.                                | `umount /mnt`          |
| `fdisk`    | Gestiona/consulta particiones de disco.                | `fdisk -l`             |
| `blkid`    | Muestra UUID y tipo de filesystem de dispositivos.     | `blkid`                |

## PERMISOS Y USUARIOS

| Comando   | Descripción                                           | Ejemplo                          |
| --------- | ----------------------------------------------------- | -------------------------------- |
| `chmod`   | Cambia permisos de archivos/directorios.              | `chmod 755 script.sh`            |
| `chown`   | Cambia propietario y grupo.                           | `chown appuser:appgroup app.log` |
| `chgrp`   | Cambia el grupo propietario.                          | `chgrp developers file.txt`      |
| `umask`   | Define permisos predeterminados para nuevos archivos. | `umask 022`                      |
| `whoami`  | Muestra el usuario actual.                            | `whoami`                         |
| `id`      | Muestra UID, GID y grupos del usuario.                | `id`                             |
| `who`     | Muestra usuarios conectados.                          | `who`                            |
| `w`       | Muestra usuarios conectados y qué están haciendo.     | `w`                              |
| `passwd`  | Cambia una contraseña.                                | `passwd`                         |
| `su`      | Cambia a otro usuario.                                | `su - appuser`                   |
| `sudo`    | Ejecuta un comando con privilegios elevados.          | `sudo systemctl restart nginx`   |
| `useradd` | Crea un usuario.                                      | `sudo useradd appuser`           |
| `usermod` | Modifica un usuario.                                  | `sudo usermod -aG docker user`   |
| `groups`  | Muestra los grupos de un usuario.                     | `groups user`                    |

## NETWORKING

| Comando         | Descripción                                                                   | Ejemplo                             |
| --------------- | ----------------------------------------------------------------------------- | ----------------------------------- |
| `ping`          | Comprueba conectividad con un host.                                           | `ping google.com`                   |
| `ip`            | Configura/consulta interfaces, rutas y direcciones IP.                        | `ip addr`                           |
| `ip addr`       | Muestra interfaces y direcciones IP.                                          | `ip addr`                           |
| `ip route`      | Muestra la tabla de rutas.                                                    | `ip route`                          |
| `hostname`      | Muestra el hostname del servidor.                                             | `hostname`                          |
| `hostname -I`   | Muestra las IP del host.                                                      | `hostname -I`                       |
| `nslookup`      | Consulta DNS.                                                                 | `nslookup example.com`              |
| `dig`           | Realiza consultas DNS detalladas.                                             | `dig example.com`                   |
| `traceroute`    | Muestra la ruta hacia otro host.                                              | `traceroute google.com`             |
| `netstat`       | Muestra conexiones, puertos y estadísticas de red.                            | `netstat -tulpn`                    |
| `ss`            | Alternativa moderna a `netstat`.                                              | `ss -tulpn`                         |
| `lsof`          | Lista archivos abiertos; también permite identificar procesos usando puertos. | `lsof -i :8080`                     |
| `curl`          | Realiza solicitudes HTTP/HTTPS y otras operaciones de red.                    | `curl https://example.com`          |
| `wget`          | Descarga archivos desde la red.                                               | `wget https://example.com/file.zip` |
| `nc` / `netcat` | Comprueba conexiones TCP/UDP y permite comunicación de red.                   | `nc -zv server 443`                 |

## SSH Y TRANSFERENCIA DE ARCHIVOS

| Comando       | Descripción                                         | Ejemplo                                |
| ------------- | --------------------------------------------------- | -------------------------------------- |
| `ssh`         | Se conecta remotamente a otro servidor.             | `ssh user@server`                      |
| `scp`         | Copia archivos entre servidores mediante SSH.       | `scp file.txt user@server:/tmp/`       |
| `sftp`        | Transferencia interactiva de archivos mediante SSH. | `sftp user@server`                     |
| `rsync`       | Sincroniza archivos/directorios eficientemente.     | `rsync -av ./app user@server:/opt/app` |
| `ssh-keygen`  | Genera claves SSH.                                  | `ssh-keygen -t ed25519`                |
| `ssh-copy-id` | Copia una clave pública al servidor remoto.         | `ssh-copy-id user@server`              |

## SERVICIOS Y PROCESOS DEL SISTEMA

| Comando             | Descripción                                        | Ejemplo                   |
| ------------------- | -------------------------------------------------- | ------------------------- |
| `systemctl`         | Administra servicios en sistemas con systemd.      | `systemctl status nginx`  |
| `systemctl start`   | Inicia un servicio.                                | `systemctl start nginx`   |
| `systemctl stop`    | Detiene un servicio.                               | `systemctl stop nginx`    |
| `systemctl restart` | Reinicia un servicio.                              | `systemctl restart nginx` |
| `systemctl enable`  | Configura un servicio para iniciar con el sistema. | `systemctl enable nginx`  |
| `systemctl disable` | Evita que un servicio inicie automáticamente.      | `systemctl disable nginx` |
| `service`           | Comando tradicional para administrar servicios.    | `service nginx status`    |
| `journalctl`        | Consulta logs administrados por systemd/journald.  | `journalctl -u nginx`     |
| `dmesg`             | Muestra mensajes del kernel.                       | `dmesg \| tail`           |

## LOGS

| Comando      | Descripción                             | Ejemplo                  |
| ------------ | --------------------------------------- | ------------------------ |
| `tail`       | Muestra últimas líneas de un log.       | `tail -100 app.log`      |
| `tail -f`    | Sigue un log en tiempo real.            | `tail -f app.log`        |
| `grep`       | Busca errores/patrones.                 | `grep "ERROR" app.log`   |
| `less`       | Navega por logs grandes.                | `less app.log`           |
| `zcat`       | Lee archivos `.gz` sin descomprimirlos. | `zcat app.log.gz`        |
| `journalctl` | Consulta logs de systemd.               | `journalctl -u myapp`    |
| `dmesg`      | Consulta mensajes del kernel.           | `dmesg \| grep -i error` |

## COMPRESION Y ARCHIVOS

| Comando    | Descripción                                             | Ejemplo                      |
| ---------- | ------------------------------------------------------- | ---------------------------- |
| `tar`      | Agrupa archivos y normalmente los comprime/descomprime. | `tar -czf logs.tar.gz logs/` |
| `gzip`     | Comprime archivos.                                      | `gzip application.log`       |
| `gunzip`   | Descomprime `.gz`.                                      | `gunzip application.log.gz`  |
| `zip`      | Crea archivos ZIP.                                      | `zip logs.zip *.log`         |
| `unzip`    | Extrae archivos ZIP.                                    | `unzip logs.zip`             |
| `tar -xzf` | Extrae `.tar.gz`.                                       | `tar -xzf backup.tar.gz`     |

## VARIABLES SHELL Y EJECUCION

| Comando    | Descripción                                            | Ejemplo                 |
| ---------- | ------------------------------------------------------ | ----------------------- |
| `echo`     | Imprime texto o variables.                             | `echo $PATH`            |
| `env`      | Muestra variables de entorno.                          | `env`                   |
| `export`   | Define una variable de entorno.                        | `export APP_ENV=prod`   |
| `printenv` | Muestra variables de entorno.                          | `printenv PATH`         |
| `history`  | Muestra comandos ejecutados anteriormente.             | `history`               |
| `alias`    | Crea alias para comandos.                              | `alias ll='ls -lah'`    |
| `source`   | Ejecuta un archivo en el shell actual.                 | `source ~/.bashrc`      |
| `which`    | Localiza un ejecutable.                                | `which python`          |
| `env`      | Ejecuta comandos con variables de entorno específicas. | `env VAR=value command` |
| `crontab`  | Administra tareas programadas.                         | `crontab -l`            |
| `date`     | Muestra fecha/hora del sistema.                        | `date`                  |
| `sleep`    | Pausa la ejecución durante un tiempo.                  | `sleep 10`              |

## PAQUETES

| Comando       | Descripción                                                | Ejemplo                  |
| ------------- | ---------------------------------------------------------- | ------------------------ |
| `apt`         | Gestión de paquetes en Debian/Ubuntu.                      | `sudo apt install nginx` |
| `apt update`  | Actualiza información de repositorios.                     | `sudo apt update`        |
| `apt upgrade` | Actualiza paquetes instalados.                             | `sudo apt upgrade`       |
| `yum`         | Gestor de paquetes usado en sistemas RHEL/CentOS antiguos. | `yum install nginx`      |
| `dnf`         | Gestor moderno de paquetes en RHEL/Fedora.                 | `dnf install nginx`      |
| `rpm`         | Gestiona paquetes RPM directamente.                        | `rpm -qa`                |

## COMANDOS DE AYUDA

| Comando          | Descripción                                       | Ejemplo          |
| ---------------- | ------------------------------------------------- | ---------------- |
| `man`            | Muestra el manual de un comando.                  | `man grep`       |
| `help`           | Muestra ayuda de comandos internos del shell.     | `help cd`        |
| `command --help` | Muestra opciones básicas del comando.             | `grep --help`    |
| `info`           | Documentación detallada de determinados comandos. | `info coreutils` |
