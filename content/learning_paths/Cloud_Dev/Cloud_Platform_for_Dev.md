###### CLOUD PLATFORM FOR DEVELOPERS

##### 1.0 ON PREMISES VS CLOUD SERVICES

## 1.1 SOLUTIONS BEFORE CLOUD COMPUTING

    Aquí tienes los puntos clave del video sobre la evolución hacia la computación en la nube:

    * **Infraestructura On-Premise (Antes de la nube):** En los años 90, las aplicaciones web se alojaban en servidores físicos locales dentro de las oficinas, lo que requería que los propios equipos se encargaran del mantenimiento del hardware, el software, la seguridad y la fiabilidad.

    * **Granjas de servidores fuera de sitio:** Como alternativa, las aplicaciones podían hospedarse en centros de datos remotos alquilando máquinas físicas enteras o compartidas, requiriendo software adicional para distribuir las cargas de trabajo a medida que crecía la demanda.

    * **El papel de la computación en la nube:** La nube traslada la gestión de los servidores físicos a proveedores especializados que aseguran la energía y el funcionamiento continuo, permitiendo al desarrollador centrarse en la configuración operativa y la experiencia de usuario.

    * **Hitos clave (2006):** Amazon impulsó la generación moderna de servicios en la nube al introducir **EC2** (Elastic Compute Cloud) para alquilar instancias de computación virtuales y **S3** (Simple Storage Service) para el almacenamiento ilimitado de archivos.

## 1.2 EVALUATE URGENCY OF CLOUD MIGRATION

    Aquí tienes los puntos clave del video **Evaluate urgency of cloud migration**:

    * **Urgencia vs. Estrategia:** Adoptar la tecnología de la nube no significa que debas migrar todo inmediatamente; es importante analizar los beneficios, desafíos y realizar pruebas en partes limitadas del sistema antes de tomar decisiones.

    * **Caso Netflix (Migración por confiabilidad):** Tras un fallo grave en su centro de datos en 2008 que detuvo el envío de DVDs por tres días, iniciaron un proceso de siete años para migrar a la nube. Priorizan la alta confiabilidad y la facilidad de operación sobre el costo.

    * **Caso Dropbox (Optimización de costos):** Comenzaron en la nube en 2007, pero en 2015 migraron la mayoría de los archivos de sus usuarios a sus propios centros de datos para reducir costos operativos, manteniendo la nube solo para usuarios en regiones lejanas como Europa.

    * **Caso Facebook / Meta (Infraestructura propia):** Siempre han gestionado sus propios centros de datos masivos. Al adquirir plataformas como Instagram y WhatsApp, las migró fuera de la nube hacia sus propios servidores.

## 1.3 ESTABLISH GOALS FOR CLOUD MIGRATION

    El cuello de botella como detonante: La principal razón para migrar es cuando la infraestructura actual frena el crecimiento del negocio (caídas constantes, problemas de escala, lentitud para implementar nuevas funciones) [cite: 26].

    El dilema de la seguridad: Es un factor de doble filo; puede motivar la migración por el resguardo de datos, o generar temor a perder el control físico. Sin embargo, los grandes proveedores actuales son altamente confiables [cite: 26].

    La realidad de los costos: Aunque la nube es atractiva para startups, la migración en sí es un proceso complejo que consume tiempo, recursos humanos y dinero. Muchas veces, la funcionalidad y confiabilidad a largo plazo son más importantes que un supuesto ahorro [cite: 26].

    Contexto de la organización: Se debe evaluar la madurez de la empresa antes de actuar. A veces, para una empresa pequeña es mejor conservar su estructura actual hasta que las necesidades de los clientes justifiquen la inversión [cite: 26].

    La importancia del soporte: Mantener una buena relación con el proveedor (como Netflix o Spotify) ayuda a resolver imprevistos con rapidez y a optimizar costos operativos [cite: 26].

##### 2.0 BASELINE FUNCTIONALITY AVAILABLE ON THE CLOUD

## 2.1 CURRENT MAJOR CLOUD PROVIDERS

    Proveedores principales en EE. UU.:
        Los tres líderes del mercado de la nube son;
         Amazon Web Services (AWS),
         Microsoft Azure y
         Google Cloud Platform (GCP),
         acompañados por otros competidores como IBM, Oracle y Alibaba.

    Flexibilidad multi-nube:
        No es obligatorio elegir un único proveedor para todas las necesidades tecnológicas; es posible combinar servicios de diferentes nubes, por ejemplo, utilizando uno para almacenamiento y otro para ejecución de código.

    Almacenamiento de datos y archivos:
        Cada proveedor ofrece alternativas equivalentes a las bases de datos SQL tradicionales (como Amazon Aurora, Azure SQL Database y Google Cloud SQL) y sistemas de almacenamiento por objetos en buckets (como Amazon S3, Azure Blob Storage y Google Cloud Storage).

    Opciones para ejecutar código:
        Para migrar sin reescribir código se emplean máquinas virtuales (como Amazon EC2, Azure Virtual Machines y Google Compute Engine), mientras que las soluciones Platform as a Service (como Google App Engine, Microsoft App Service y Amazon Elastic Beanstalk) simplifican la gestión de infraestructura.

    Herramientas avanzadas y administración:
        Las plataformas actuales integran herramientas de análisis de macrodatos (big data), inteligencia artificial y aprendizaje automático, además de servicios básicos de administración para usuarios, facturación y monitoreo.

## 2.2 STORING DATA AND FILES

    Almacenamiento de objetos en la nube:
        Popularizado por Amazon S3 (Simple Storage Service), consiste en guardar archivos como "objetos" sin límites prácticos de capacidad, organizados en "buckets" (S3 y Google Cloud Storage) o "contenedores" y "blobs" (Azure Storage). Permite hospedar incluso sitios web estáticos de manera económica.

    Bases de datos SQL (Relacionales):
        Ideal para estructurar datos en filas y columnas, especialmente al migrar aplicaciones existentes. Las opciones líderes totalmente administradas y con la funcionalidad tradicional son Amazon Aurora, Azure SQL Database y Google Cloud SQL.

    Bases de datos NoSQL (No relacionales):
        Diseñadas para alta escala, velocidad y flexibilidad de datos semiestructurados (inspiradas en Google Bigtable)
        Ejemplos clave son Amazon DynamoDB, Azure Cosmos DB y Google Cloud Firestore / Bigtable.

    Elección estratégica (SQL vs. NoSQL):
        Es recomendable comenzar con una base de datos SQL para la mayoría de los casos de uso, dado que el lenguaje SQL es ampliamente conocido, mientras que NoSQL puede resultar restrictivo para consultas complejas o requerir migraciones posteriores.

## 2.3 EXECUTING CODE

    Opciones para Ejecutar Código en la Nube

1. Máquinas Virtuales (IaaS)

Puedes crear instancias virtuales con sistemas operativos Windows o Linux.
Configura CPU, GPU, memoria y ubicación geográfica para optimizar rendimiento.
Ejemplos: Azure Virtual Machines, Amazon EC2, Google Compute Engine.

2. Plataformas como Servicio (PaaS)

Ejecuta código sin preocuparte por la infraestructura subyacente.
Ideal para desarrolladores que prefieren enfocarse en la aplicación.
Ejemplos: Google App Engine, Amazon Elastic Beanstalk, Microsoft App Service.

3. Computación Serverless

Ejecuta fragmentos de código en respuesta a eventos.
No es adecuado para procesos largos (más de unos minutos).
Muy eficiente y rentable para aplicaciones modernas como asistentes de voz.
Ejemplos: AWS Lambda, Google Cloud Functions, Azure Cloud Functions.

4. Contenedores

Código empaquetado en contenedores ligeros que pueden ejecutarse en múltiples entornos.
Facilita la portabilidad y escalabilidad.
Tema que se aborda más adelante en el curso.

## 2.4 ANALYTICS AND INSIGHTS

Herramientas y Soluciones para Datos en la Nube

1. Data Warehousing (Almacenamiento de Datos Históricos)

Maneja grandes volúmenes de datos (terabytes a petabytes).
Soluciones principales: Amazon Redshift, Google BigQuery, Azure SQL Data Warehouse.
Competencia basada en rendimiento, costo y facilidad de uso.
También existen soluciones de terceros como Snowflake.

2. Procesamiento y Streaming de Datos en Tiempo Real

Para manejar datos en tiempo real como eventos de sitios web o mensajes.
Opciones: Amazon Kinesis, Google Cloud Dataflow, Azure Stream Analytics.
Inspirado en software open-source como Apache Kafka.

3. Visualización y Consulta de Datos

Herramientas para facilitar consultas y visualización.
Ejemplos: Google Data Studio, Amazon Athena, Azure Analysis Services.
Se recomienda evaluar soluciones personalizadas según necesidades.

4. Machine Learning y Predicciones

Construcción de modelos predictivos personalizados.
Plataformas: Google Cloud Machine Learning Engine, Amazon Machine Learning, Azure Machine Learning.
Machine learning requiere datos de alta calidad y es experimental.
Uso recomendado de soluciones preconstruidas de IA para funciones específicas.
Ejemplos: Amazon Rekognition (imagen), Google Cloud Translation (texto), Azure Computer Vision (visión).

##### 3.0 HISTORICAL STRENGHTS OF THE THREE MAJOR CLOUD PROVIDERS

## 3.1 AMAZON WEB SERVICES

Aquí tienes los puntos clave del video sobre Amazon Web Services (AWS):

AWS fue el primer proveedor importante de infraestructura en la nube, con servicios destacados como S3 (almacenamiento escalable) y EC2 (instancias de máquina virtual).

La migración básica a la nube puede hacerse con el enfoque "lift and shift", que implica trasladar aplicaciones sin grandes modificaciones.

AWS Lambda permite ejecutar código en respuesta a eventos, ideal para aplicaciones modulares y de corta duración, aunque requiere reescritura y pruebas.

Aurora es una base de datos propietaria de AWS que promete mayor velocidad y menor costo, pero es importante evaluar su rendimiento y costo en tu caso.

AWS tiene un ecosistema amplio y en constante evolución, con conferencias y recursos para desarrolladores.

## 3.2 GOOGLE CLOUD PLATFORM

GCP es conocido por productos de consumo fáciles de usar, con una plataforma como servicio llamada App Engine que ofrece experiencia serverless con menos configuración.

Google ha invertido fuertemente en inteligencia artificial y aprendizaje automático, con hardware especializado como Tensor Processing Units (TPUs) disponibles para usuarios.

Herramientas como Google Colab permiten ejecutar código en GPU o TPU gratuitamente, facilitando el acceso a IA para estudiantes y desarrolladores.

Kubernetes, un proyecto iniciado por Google, facilita la gestión y escalabilidad de aplicaciones distribuidas usando contenedores, que son portables entre nubes y on-premise.

GCP tiene una comunidad de desarrolladores más pequeña que AWS y Azure, pero se destaca en IA y facilidad de uso para prototipos.

## 3.3 MICROSOFT AZURE

Azure es popular entre empresas que ya usan productos Microsoft como SQL Server, Windows Server y .NET, facilitando su adopción.

La reputación y calidad de Azure han mejorado mucho, con ofertas atractivas para startups y desarrolladores.

Herramientas como Visual Studio Code y GitHub (adquirido por Microsoft) están bien integradas con Azure, facilitando el desarrollo y despliegue.

Azure destaca por su facilidad de uso y su capacidad para crear soluciones híbridas que combinan la nube con entornos on-premise.

Muchas empresas prefieren Azure porque pueden trasladar sus licencias y productos Microsoft existentes a la nube.

##### 4.0 COMPLIANCE IN THE CLOUD

##### 5.0 HUMAN RESOURCES FOR THE CLOUD

##### 6.0 PROTOTYPE FOR YOUR NEEDS

##### 7.0 DESING FOR ADAPTABILITY
