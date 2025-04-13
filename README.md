# MULTITHREADED-CHAT-APPLICATION

"COMPANY" : CODTECH IT SOLUTIONS PVT.LTD

"NAME": SHUBHAM NAWANI

"INTERN ID": CT08DA523

"DOMAIN": JAVA PROGRAMMING

"DURATION": 8 WEEKS

"MENTOR": NEELA SANTOSH

#DESCRIPTION

Multithreaded Chat Application - Java Client-Server Project

 Task Overview
As part of my internship, I was assigned the task titled "Multithreaded Chat Application", which involved building a real-time, text-based messaging system using Java. The application consists of a server and multiple clients, all communicating over a TCP/IP socket connection. The primary goal of this project was to demonstrate the ability to manage multiple concurrent connections using Java's multithreading and socket programming capabilities.

The deliverable was a fully functional, real-time chat system in which users (clients) can connect to a central server, send messages, and receive messages from others — all while maintaining smooth, uninterrupted communication.

This task offered hands-on experience with the core principles of network programming, thread synchronization, and real-time systems development.
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Tools and Technologies Used
1. Programming Language
Java

2. Core Java APIs Used
Socket, ServerSocket – Used to establish TCP connections between server and clients.

DataInputStream, DataOutputStream – Used for sending and receiving UTF-formatted strings over the network.

Thread, Runnable – Each connected client is handled in a separate thread to allow multiple users to interact with the server simultaneously.

Vector – Used to store and manage the list of connected clients in a thread-safe manner.

Editor / Development Platform
The project was developed using Visual Studio Code (VS Code) with Java extensions for code compilation, execution, and debugging.

The terminal was used to run server and cmd for  client programs in separate windows for testing real-time communication.
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Program Structure and Functionality
📡 Server Side (ChatServer.java)
Starts on port 1234 and listens for incoming client connections using a ServerSocket.

When a client connects, the server:

Accepts the socket connection.

Initializes input and output streams.

Creates a new thread (ClientHandler) for each client.

Maintains a Vector<ClientHandler> to track and broadcast messages to all connected clients.

When a client sends a message, it is broadcast to all other clients.

If a client sends "exit", the connection is terminated for that client.

Client Side (ChatClient.java)
Connects to the server on localhost:1234.

Starts two threads:

Send Thread – Reads input from the console and sends messages to the server.

Receive Thread – Listens for incoming messages from the server and displays them on the console.

The client exits gracefully when the user types "exit".
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Real-World Applications
This multithreaded chat application is a simplified version of many real-time messaging systems used today. Practical use cases include:

Instant Messaging Platforms – Core logic of apps like WhatsApp, Slack, or Discord uses similar socket and thread-based communication.

Customer Support Chat – Enables multiple users to connect and interact with support agents or bots in real-time.

Multiplayer Games – Games often use similar networking models to exchange real-time data among players.

Collaborative Tools – Used in platforms that require real-time communication such as code editors, whiteboards, or project management tools.

The experience gained from this project builds foundational knowledge in concurrent programming, networking, and server-side architecture — all of which are critical in enterprise application development.
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Conclusion
The "Multithreaded Chat Application" task successfully demonstrated the integration of socket programming, multithreading, and stream-based data transmission in Java. The client-server model was implemented with the ability to handle multiple users concurrently, making the system scalable and efficient for real-time use.

This internship task not only strengthened my technical skills in Java but also provided insight into the fundamental principles behind many of the world’s most used communication technologies.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
#OUTPUT

![Image](https://github.com/user-attachments/assets/cb5b5bbe-e812-4de0-b1c7-3ab88e38fb18)

![Image](https://github.com/user-attachments/assets/1ab18358-d9d9-418c-82e9-a839b20b8cda)
