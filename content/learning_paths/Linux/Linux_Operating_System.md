###### LINUX OPERATING SYSTEM

##### 1.0 BOOTING AND STARTING UP

## 1.1 BOOTING THE SYSTEM

    Puntos Clave:

    El apagado y reinicio deben hacerse de forma ordenada para evitar pérdida de datos y notificar a usuarios y procesos.
    El comando shutdown se usa para apagar o reiniciar el sistema, con opciones para programar el tiempo y enviar mensajes a usuarios.
    Los procesos reciben notificaciones para guardar datos y cerrar correctamente.
    Concepto de runlevels (0-6) en sistemas tradicionales y targets en systemd para definir estados del sistema.

    Comandos y Uso:

    sudo shutdown -h now : Apaga el sistema inmediatamente.
    sudo shutdown -r now : Reinicia el sistema inmediatamente.
    sudo shutdown -h +5 : Apaga el sistema en 5 minutos.
    shutdown -c : Cancela un apagado programado.
    man runlevel : Muestra información sobre los runlevels.
    systemctl isolate <target> : Cambia al target especificado (por ejemplo, systemctl isolate rescue.target).
    sudo systemctl set-default <target> : Define el target por defecto para el arranque (por ejemplo, graphical.target).

## 1.2 CONFIGURING AND MODIFING THE BOOTLOADER

## 1.3 MANAGE THE STARTUP PROCESS

## 1.4 UPDATE DE KERNEL

## 1.5 CHANGE THE KERNEL PARAMETERS
