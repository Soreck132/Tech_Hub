###### Docker Containerization

##### 1.0 Docker Explanation

## 1.1 What is Docker?

-Docker is an open-source platform that helps you package your applications into containers. These containers include everything your app needs to run—like the code, system libraries, and dependencies—so it behaves the same no matter where it's deployed. Unlike virtual machines, containers are lightweight and only include what's necessary to run the app. This solves the common problem where software works on one machine but not others. Think of Docker like having a perfect recipe and all the right tools to make a dish taste the same no matter whose kitchen you're in, giving you confidence your app will run consistently everywhere.

    The easiest definition to remember:

Docker lets you package an application and its dependencies into a portable container so it can run consistently across environments.

## 1.2 What is Docker used for?

-Docker is used to package, run, and deploy applications consistently across different enviroments.

    Docker is a tool for packaging an application and everything it needs so it can run consistently from development, testing and production.

## 1.3 Containers VS. VM

-Containers and virtual machines (VMs) both let you run apps in isolated environments, but they work differently:

VMs create a full virtual computer with its own operating system, which takes more space and time to start.
Containers share the host computer's operating system and only package the app and what it needs, so they start much faster and use less space.
Because containers share the OS, they can only run one app at a time, while VMs can run many apps like separate computers.

    In short, containers are lighter and quicker because they don’t need to run a full OS like VMs do.

## 1.4 The Anathomy of a container

-Linux Namespaces:
Think of namespaces as separate rooms in a house. Each room (namespace) gives an application its own private space to see and use certain parts of the system, like files, network, or processes. For example, one container might see only its own files and network settings, unaware of others, even though they share the same house (host system).

Control Groups (cgroups):
Imagine you have a power meter for each room that limits how much electricity it can use. Control groups do this for containers by restricting how much CPU, memory, or network bandwidth they can consume. This prevents one container from using all the resources and slowing down others.

Containers vs. Virtual Machines (VMs):
VMs are like fully furnished apartments inside a building, each with its own operating system, which takes up more space and time to start. Containers are like rooms in a shared apartment where everyone uses the same kitchen and utilities (the host OS), but each room is isolated. Because containers share the OS, they start quickly and use fewer resources but can only run apps compatible with that OS.

For example, if you run a web server in a container, it thinks it has its own network and file system, but it's actually sharing the host's OS kernel with other containers. This makes containers lightweight and fast, ideal for deploying applications efficiently.

## 1.5 Docker Difference

-Containers have evolved from early technologies like chroot, BSD jails, Solaris zones, and Linux containers, each providing ways to isolate applications without full hardware virtualization.

Docker simplifies container use by making configuration easy with Dockerfiles, enabling easy sharing of container images via Docker Hub, and providing a straightforward command-line interface.

Unlike earlier container methods, Docker automates complex setup steps like user ID mapping and network configuration, making it accessible and efficient for developers.

    This foundation helps you appreciate why Docker is widely used for packaging and running applications consistently across environments.

## 1.6 Docker alternatives

-Docker is not the only container platform;
there are alternatives like CRI-O, runc, and Firecracker that comply with Kubernetes' Container Runtime Interface (CRI).

    A major security concern with Docker is that containers often run as the root user, which can pose risks if applications break out of containers.

    Podman addresses this by enabling rootless containers, enhancing security by running containers without root privileges.

        Podman also supports running multiple applications within containers using init systems like Systemd, offering more flexibility.

## 1.7 Installing Docker

-For Mac:

    Check your macOS version (must be 10.15 or newer) and ensure you have at least 4GB of memory.
    Go to docker.com and click the blue download button for Mac.
    Download the Docker Desktop DMG file.
    Open the DMG file and drag the Docker icon into your Applications folder.
    Open Docker from Applications or by searching with Command+Space.
    When prompted, enter your password to install backend components.
    Accept the Docker license agreement.
    Wait for the Docker whale icon to stop moving, indicating Docker is ready.

Optional: You can also install Docker on Mac using Homebrew by installing Homebrew first, then running brew install docker --cask in Terminal.

-For Windows and Linux:

    The course covers installing Docker Desktop on Windows and Linux, Generally, you download the installer from docker.com and follow the setup prompts.

## ######## 2.0 Using Docker

## 2.1 Docker CLI

-The Docker CLI is the main way to interact with Docker containers and is straightforward to use.
Most Docker commands are top-level commands like run, pull, and login, with some having nested subcommands.
Every Docker command accepts options or flags, such as --help, which shows detailed usage information.
Using --help with any command or subcommand is a great way to learn how to use it and what options are available.

    Mastering the Docker CLI will help you efficiently create, manage, and troubleshoot containers in your work.

| Command               | Purpose                           |
| --------------------- | --------------------------------- |
| `docker --version`    | Check Docker                      |
| `docker pull`         | Download an image                 |
| `docker images`       | List images                       |
| `docker build`        | Build an image                    |
| `docker run`          | Create/start a container          |
| `docker ps`           | Show running containers           |
| `docker ps -a`        | Show all containers               |
| `docker stop`         | Stop container                    |
| `docker start`        | Start stopped container           |
| `docker restart`      | Restart container                 |
| `docker logs`         | View container logs               |
| `docker exec`         | Execute command inside container  |
| `docker rm`           | Remove container                  |
| `docker rmi`          | Remove image                      |
| `docker compose up`   | Start multi-container application |
| `docker compose down` | Stop/remove Compose environment   |

## 2.2 Create a Docker container

--What is an image?
A Docker image is like a packaged snapshot of your application that includes the app's source code, the operating system libraries, and all dependencies needed to run it. Think of it as a blueprint or template. When you run an image, Docker creates a container, which is a running instance of that image. This way, your app can run consistently across different environments without configuration issues

Create a container from an image:
COMMAND; docker container create [OPTIONS] IMAGE[:TAG]
Creates a container from the specified image but does not start it. If the image isn't on your machine, Docker pulls it from Docker Hub by default.

Start a container:
COMMAND; docker container start CONTAINER_ID
Starts a created container, running its entry point. Containers must be started separately after creation.

List running containers:
COMMAND; docker ps
Shows containers that are currently running.

List all containers (including stopped):
COMMAND; docker ps --all
Shows all containers Docker knows about, including those stopped or exited.

View container logs:
COMMAND; docker logs CONTAINER_ID
Displays the output logs from a container, useful for troubleshooting.

Start and attach terminal to container output:
COMMAND; docker container start --attach CONTAINER_ID
Starts the container and immediately attaches your terminal to its output, so you see logs live.

Container IDs:
Each container has a unique ID used to manage it. You can use the first few characters of the ID instead of the full one.

## 2.3 Short way for a Docker container

These commands help you quickly run and monitor containers, which is essential for efficient container management.

COMMAND; docker run [image]
This command creates, starts, and attaches to a container all in one step, making it faster and more convenient than doing these actions separately.

COMMAND; docker ps --all
Lists all containers, including those that have exited, so you can see the status and IDs of containers.

COMMAND; docker logs [container ID]
Shows the output logs from a container, useful for checking what happened during its run.

## 2.4 Docker Container from Dockerfiles

Create a Dockerfile:

    Write a Dockerfile that defines your container image.
    This includes specifying a base image with FROM,
    copying necessary files with COPY,
    installing dependencies with RUN, and
    setting the default command with ENTRYPOINT or CMD.

Prepare your context:
Place your Dockerfile and any files your container needs (like scripts or app code) in a folder. This folder is called the build context.

Build the Docker image:
Run the command docker build -t your-image-name . in the folder containing your Dockerfile. The -t option tags your image with a name, and the . specifies the current directory as the context.

Run a container from the image:
Use docker run your-image-name to start a container based on your image. This creates and runs the container, executing the command specified in your Dockerfile.

This process packages your app and its environment into an image, then runs it as a container, ensuring consistent behavior across systems.

## 2.5 Docker Container from Dockerfiles part N. 2

## 2.6 Docker Container from with Buildkit

BuildKit is a newer, faster way to build container images compared to the older method. Here's a simple breakdown:

BuildKit:
Think of it as an upgraded builder that makes creating Docker images quicker and adds useful features.

docker buildx build:
This command uses BuildKit to build your image. It works like the usual docker build but with more options.

--load option:
This tells BuildKit to build the image and then load it directly into Docker on your computer, so you can use it right away.
Builders:
BuildKit creates special containers called builders that do the image building. These can handle building images for different computer types (like Intel or ARM) and even build remotely.

Running containers from images built with BuildKit is the same as before, so you don't need to change how you run them.

In short, BuildKit improves how you build Docker images, making it faster and more flexible, while keeping the way you run containers the same.

## 2.7 Interact with your container

## 2.8 Stopping and removing container

## 2.9 Binding port to your container

## 2.10 Saving data from containers

## 2.11 Introducing the Docker Hub
