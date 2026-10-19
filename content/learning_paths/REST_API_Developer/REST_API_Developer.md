###### Learning REST API

##### 1.0 REST API

## 1.1 The RESTful librarian

    * A REST API acts like a librarian between clients (like apps or devices) and a data store, handling requests to get, add, update, or delete data.

    * When a client sends a request, the REST API processes it, retrieves or modifies the data as needed, and sends back a response with the requested information and metadata.

    * This process allows multiple clients to interact efficiently with the data store, enabling fast and scalable data-driven applications.

## 1.2 What is a REST API?

    What is it?
        REST API is a way for different software applications to talk to each other over the internet. It’s like a set of rules that helps apps share and update data smoothly.

    How it works:
        Imagine a librarian (the REST API) who helps you find, add, or change books (data). You ask the librarian using simple commands, and the librarian gives you exactly what you need without giving you the whole library every time.

    REST is a method to make communication between apps efficient and reliable.
    Instead of loading whole new pages, REST APIs let apps update just the data they need, making things faster.
    It uses common actions like:
         GET (to get data),
         POST (to add data),
         PUT (to update data), and
         DELETE (to remove data).

## 1.3 Sidebar: URL vs URI

    URI (Universal Resource Identifier):
        A generic identifier for any resource, whether abstract or physical. For example, a URI could be any string that identifies a resource, like a book title or a file name.

    URL (Universal Resource Locator):
        A specific type of URI that not only identifies a resource but also tells you how to access it. For example, a URL like

            http://example.com/data tells you where the resource is and how to get it via HTTP.

    URN (Universal Resource Name):
        Another subset of URI that acts as a unique name for a resource, independent of its location. Think of it like a person's full name that uniquely identifies them regardless of where they are. For instance, urn:isbn:0451450523 uniquely names a book without saying where to find it.


    In REST API work, the term URI is used broadly because it covers URLs, URNs, or combinations, giving flexibility in how resources are identified and accessed. This understanding helps when designing or consuming APIs, ensuring you know whether you're dealing with just an identifier or also with access details.

## 1.4 THE SIX. CONSTRAINS OF REST

    Client-Server Architecture:
        Separates user interface (client) from data storage (server). For example, a mobile app (client) can interact with a web server without knowing how data is stored.

    Statelessness:
        Each request from the client must contain all information needed. For instance, an authentication token is sent with every request since the server doesn't remember previous interactions.

    Cacheability:
        Responses are marked as cacheable or not to optimize performance. For example, static data like user profiles might be cached, while constantly changing data like live stock prices is not.

    Layered System:
        Clients don't know if they're connected directly to the server or through intermediaries like CDNs, which helps scalability and security.

    Code on Demand:
        Servers can send executable code like JavaScript to extend client functionality, though this is less common.

    Uniform Interface:
        Uses URIs to identify resources (e.g., /authors/morten/bio), allows clients to modify resources, ensures messages describe their data format (like JSON), and includes hyperlinks to discover available actions.

## 1.5 HOW REST RELATES TO HTTP

    REST; is a set of six architectural constraints that define how web services should behave to be efficient and scalable.

    REST and HTTP; are not inherently linked, but most REST APIs use HTTP as the protocol to communicate.
    A RESTful API is a REST service that runs over HTTP, allowing clients to access web resources.

    To clarify with examples:

    HTTP; is the protocol your web browser uses to load websites, like when you type a URL to visit a page.

    A RESTful API; uses HTTP requests (like GET or POST) to let applications interact with data on a server, for example, retrieving user information from a database.

## 1.6 WHO OR WHAT INTERACTS WITH REST API?

    Clients are applications, not humans:
        The client consuming a REST API is the app or website itself, not the user. For example, when you use a mobile app, that app is the client sending requests to the REST API.

    REST APIs are designed to be open but controlled:
        Anyone can access an open REST API if allowed, but most APIs have restrictions. For instance, Twitter’s API requires authentication with a username and password and enforces rate limits to prevent overuse.

    REST API’s role is to process requests and send responses:
        It doesn’t care who the client is, just that the client follows the rules. For example, an IoT device can send data to a REST API, and the API will respond accordingly.

## 1.7 TOOLS TO SEE REST API IN ACTION

    Browsers can send HTTP requests to REST APIs but don't display responses in a human-friendly way, lacking header details and proper formatting.

    Dedicated REST clients like Postman, Insomnia, or the REST Client extension in Visual Studio Code provide a clearer, structured view of both request headers and response data, making API interaction easier.

    The video walks through setting up the REST Client in Visual Studio Code, creating a project folder, writing a GET request, and running it to see a well-formatted JSON response.

##### 2.0 REQUEST

## 2.1 Anathomy of a REST Request

    A REST request consists of a method and a URI:
        The method (like GET, POST, PUT, DELETE) specifies the action, and the URI points to the resource.

- Example: Sending a GET request to site.com/wp-json/wp/v2/posts retrieves the list of recent posts.

  Request headers carry important metadata:
  Headers include content type, authentication, and cache control to help the server process the request.

- Example: Setting the header Content-Type: application/json tells the server to expect JSON data.

  When sending data, the request body must match the content type:  
   For example, if the content type is JSON, the data sent must be in JSON format.

- Example: To create a new post, a POST request includes JSON data like { "title": "New Post", "content": "Post content here" }.

  JavaScript or jQuery AJAX can automate sending requests and handling responses: This makes interacting with REST APIs efficient.

- Example: Using jQuery AJAX to send a POST request with data and handle the response in the console.

## 2.2 DISCOVERY

    Discovery is a crucial step in working with REST APIs, where you find out what resources and methods are available.

    REST APIs can describe themselves through responses, especially using the OPTIONS HTTP method, even if no external documentation exists.

    By sending OPTIONS requests to resources, you can see all available methods, required arguments, data types, and default values, enabling you to interact with the API effectively.

## 2.3 RESOURCE

    A resource in REST is a conceptual mapping to information or entities, such as a document, image, or collection, not the actual data itself.

    Resources can be single items (singletons) or collections, and REST API URIs allow you to specify resources with increasing specificity.

    A representation is a copy of the resource's current or intended state, delivered in formats like JSON or HTML, enabling multiple clients to access or modify data independently.

## 2.4 METHODES \_(VERBS)

    GET retrieves data from a resource.

- Example: Sending a GET request to api.example.com/products/123 fetches details of product 123.

  POST creates new resources.

- Example: Posting JSON data { "name": "New Product", "price": 19.99 } to api.example.com/products adds a new product.

PUT replaces all content of an existing resource or creates it if allowed.

- Example: Sending a PUT request to api.example.com/products/123 with updated product data replaces the entire product info.

PATCH modifies parts of an existing resource without replacing everything.

- Example: Patching api.example.com/products/123 with { "price": 17.99 } updates only the price.

DELETE removes a specific resource.

- Example: Sending a DELETE request to api.example.com/products/123 deletes product 123.

OPTIONS and HEAD provide metadata about communication options and response headers.

- Example: An OPTIONS request to api.example.com/products returns allowed HTTP methods.

      HTTP status codes indicate the result of the request: They help you understand if your action succeeded, failed, or was unauthorized.

  | Status Code | Meaning | When It Occurs |

  |-------------|--------------------------|-----------------------------------------------------|
  | 200 OK | Request succeeded | Successful GET or PUT request on an existing resource|
  | 201 Created | Resource created | Successful POST request creating a new resource |
  | 204 No Content | No content to return | Successful PUT request with no content at server |
  | 401 Unauthorized | Unauthorized access | When you lack permission to perform the action |
  | 404 Not Found | Resource not found | Requested resource does not exist |
  | 405 Method Not Allowed | Method not allowed| Using an HTTP method not supported by the resource |
  | 409 Conflict | Conflict error | Trying to create a resource that already exists |

##### 3.0 RESPONSE

## 3.1 RESPONSE HEADER

## 3.2 HTTP STATUS MESSAGES

## 1.4

## 1.4
