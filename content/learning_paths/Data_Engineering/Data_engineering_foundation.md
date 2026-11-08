###### DATA ENGINEERING FOUNDATIONS

##### 1.1 INTRODUCTION TO DATA ENGINEERING

    Role of Data Engineering:
        Supports data scientists by organizing and managing data efficiently.
    Data Challenges:
        Data often scattered across multiple databases, sometimes corrupt or not optimized for analysis.
    Data Engineer Tasks:
        Extract data from multiple sources, optimize database schema, monitor and repair data pipelines, automate tasks to reduce errors.
    Skills Needed:
        Linux and command line proficiency, programming (Python, Scala, Java), SQL, understanding of distributed systems, and knowledge of data ingestion, processing frameworks, and storage engines.
    Value:
        Data engineers are crucial for scaling data-driven organizations by making data accessible and reliable for analysis.

## 1.2 DATA ENGINEER VS DATA SCIENTIST

    Rol del Data Engineer:

    Desarrolla arquitecturas de datos escalables.
    Optimiza la adquisición y la integración de datos de múltiples fuentes.
    Limpia y asegura la calidad de los datos.
    Tiene conocimientos profundos en tecnologías cloud como AWS, Azure o Google Cloud.

    Rol del Data Scientist:

    Analiza datos para encontrar patrones y tendencias.
    Aplica modelos estadísticos y de machine learning.
    Influye en la toma de decisiones de negocio.
    Limpia datos eliminando valores atípicos estadísticos.

    Relación entre ambos:

    Los data engineers preparan y facilitan los datos.
    Los data scientists usan esos datos para análisis y modelos.

## 1.3 ESSENTIALS TOOLS FOR DATA ENGINEERING

    Categorías de herramientas en Data Engineering:

    Almacenamiento:
        Bases de datos como MySQL, PostgreSQL, MongoDB.
    Procesamiento:
        Frameworks como Spark, Hive, Kafka para procesar grandes volúmenes de datos en clusters.
    Automatización:
        Herramientas de programación como Apache Airflow, Oozie, Luigi para ejecutar tareas en orden y a tiempo.

    Flujo típico de un pipeline de datos:

    Extracción:
        Obtener datos de múltiples fuentes, incluyendo APIs y bases de datos.
    Transformación:
        Limpiar, agregar y unir datos para que sean útiles.
    Carga:
        Insertar los datos procesados en bases de datos analíticas.

    Importancia de la programación:

    Asegura que las tareas se ejecuten en el orden correcto para mantener la calidad y consistencia de los datos.

##### 2.0 INSTRUCTION TO DATA ENGINEERING

## 2.1 INTRODUCTION TO DATABASES AND THEIR TYPES

    Definición de base de datos:

    Colección grande de datos organizados en estructuras eficientes.
    Diseñadas para búsquedas y recuperaciones rápidas.
    Gestionadas por sistemas de gestión de bases de datos (DBMS).

    Diferencias con sistemas de archivos:

    Bases de datos tienen mayor organización y funcionalidades como búsqueda, replicación e indexación.
    Sistemas de archivos son menos organizados y con funcionalidades limitadas.

    Tipos de datos:

    Estructurados: Datos con estructura definida, como tablas en bases de datos relacionales.
    Semi-estructurados: Datos con etiquetas o marcadores, como JSON.
    No estructurados: Datos sin esquema, como fotos o videos.

    Bases de datos SQL vs NoSQL:

    SQL: Relacionales, con esquemas definidos y tablas relacionadas (ej. MySQL, PostgreSQL).
    NoSQL: No relacionales, a menudo para datos no estructurados o semi-estructurados (ej. Redis, MongoDB).

## 2.2 UNDERSTANDING DATABASE SCHEMA

    Esquema de Base de Datos:

    Describe la estructura y relaciones entre tablas.
    Ejemplo: sistema de pedidos con tablas "cliente" y "pedido".

    Claves en la Base de Datos:

    Clave primaria (Primary Key): Identificador único en cada tabla (ej. ID).
    Clave foránea (Foreign Key): Campo que conecta tablas (ej. customer_id en tabla pedidos).

    Operaciones con Claves:

    Uso de "JOIN" para relacionar tablas mediante claves foráneas.

    Esquemas Multidimensionales para Data Warehouses:

    Diseñados para grandes volúmenes de datos analíticos.
    Ejemplo: esquema estrella con una tabla de hechos (orders) y tablas de dimensiones (cliente, restaurante, tiempo, plato).
    Las tablas de dimensiones contienen información descriptiva.
    Las tablas de hechos contienen eventos o transacciones.

    Importancia del Diseño de Esquema:

    Un buen diseño optimiza uso de memoria y recursos.
    Es fundamental para construir pipelines de datos eficientes.

## 2.3 DISTRIBUTIVE COMPUTING

    Computación Distribuida y Paralela:

    Divide tareas grandes en subtareas más pequeñas.
    Distribuye subtareas entre varios computadores (usualmente económicos).
    Permite procesar datos más rápido y manejar grandes volúmenes que no caben en una sola memoria.

    Beneficios:

    Mayor potencia de procesamiento.
    Menor uso de memoria por computador.
    Mejora la tolerancia a fallos.

    Costos y Desafíos:

    Comunicación entre procesos para dividir y unir resultados genera sobrecarga.
    No siempre acelera linealmente (efecto "parallel slow down").

    Ejemplo Práctico:

    Cálculo de edad promedio de participantes olímpicos por año usando 4 unidades de procesamiento.
    Uso de funciones como "groupby" para dividir datos y "map" para distribuir tareas.

    Herramientas para Implementar:

    Multiprocessing.Pool para múltiples núcleos en una máquina.
    Dask para procesamiento distribuido con evaluación perezosa.

##### 3.0 DATA ENGINEERING TOOLS

## 3.1 MAPREDUCE AND HADOOP

    Hadoop:

    Ecosistema de herramientas open-source para almacenar, procesar y analizar grandes volúmenes de datos.
    Mantenido por Apache Software Foundation.
    Fundamental en la creación de pipelines ETL (Extract, Transform, Load).

    HDFS (Hadoop Distributed File System):

    Sistema de archivos distribuido que almacena datos en múltiples computadores.
    Permite manejar grandes volúmenes de datos distribuidos.
    Actualmente, servicios en la nube como Amazon S3 suelen reemplazar a HDFS.

    MapReduce:

    Paradigma de procesamiento paralelo que divide tareas grandes en subtareas distribuidas entre varios computadores.
    Facilita el procesamiento eficiente de datos en clusters.
    Presenta desafíos en la escritura de trabajos MapReduce, lo que llevó al desarrollo de nuevas herramientas.

    Importancia:

    Hadoop y MapReduce son pilares en big data y procesamiento distribuido.
    Permiten escalar procesamiento y almacenamiento para datos masivos.

## 3.2 HIVE

    Hive en Hadoop:
        Capa que facilita la consulta de datos de múltiples fuentes usando Hive SQL, un lenguaje similar a SQL.
    Función en ETL:
        Ayuda en la extracción de datos dentro del pipeline ETL, haciendo los datos estructurados y fáciles de consultar.
    Origen y evolución:
        Desarrollado inicialmente por Facebook, ahora mantenido por Apache, y ha evolucionado de usar MapReduce a integrarse con otras herramientas de procesamiento.
    Ejemplo práctico:
        Una consulta Hive puede calcular el promedio de edad de atletas olímpicos por año, transformándose en un trabajo distribuido en un clúster.

## 3.3 SPARK

    Spark como framework:
         Distribuye tareas de procesamiento de datos entre clusters, optimizando el rendimiento al mantener la mayoría del procesamiento en memoria.
    Limitaciones de MapReduce:
        MapReduce requiere costosos accesos a disco entre trabajos, lo que limita análisis interactivos y exploratorios.
    Resilient Distributed Datasets (RDDs):
        Estructura de datos distribuida sin columnas nombradas, que permite transformaciones (como filter, map) y acciones (como count, collect).
    PySpark:
        Interfaz en Python para Spark que usa abstracción DataFrame, facilitando operaciones similares a pandas y gestionando la computación paralela compleja.
    Rendimiento:
        Spark puede ser hasta 100 veces más rápido que Hadoop para procesamiento de grandes volúmenes de datos.

## 3.4 AIRFLOW

    ¿Qué es un workflow?

    Secuencia de tareas que se ejecutan con dependencias entre ellas.
    Ejemplo: Procesar datos de un archivo CSV, limpiar y cargar en base de datos.

    Limitaciones de herramientas simples:

    Cron es útil para tareas simples y repetitivas, pero no maneja dependencias ni múltiples trabajos interrelacionados.

    Dependencias y DAGs:

    Los workflows con dependencias se modelan como Grafos Acíclicos Dirigidos (DAGs).
    Un DAG representa tareas como nodos y sus dependencias como aristas dirigidas, sin ciclos.

    Apache Airflow:

    Framework popular para programar y orquestar workflows complejos.
    Creado por Airbnb, ahora parte de Apache.
    Usa Python para definir DAGs y tareas.

    Operadores en Airflow:

    Ejecutan tareas específicas (bash, Python, Spark, etc.).
    Permiten crear tareas personalizadas para distintos procesos.

    Ejemplo de pipeline:

    Iniciar cluster Spark → Ingesta datos atletas y sedes → Enriquecer datos combinando tablas.
    Tareas se conectan con dependencias usando funciones como set_downstream.
