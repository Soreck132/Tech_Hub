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
