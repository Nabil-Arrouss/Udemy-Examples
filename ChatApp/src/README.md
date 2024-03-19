# Simple Chat Application

This Java program implements a simple chat application using sockets. It consists of two components: a server and a client. The server listens for connections on a specified port and handles incoming client connections. The client connects to the server and allows the user to send messages to the server.

## Chat Client

The `ChatClient` class represents the client component of the chat application. It connects to a server running on `localhost` at port `5000`. Once connected, it allows the user to send messages to the server and displays messages received from the server.

## Chat Server

The `ChatServer` class represents the server component of the chat application. It listens for incoming connections on port `5000`. When a client connects, it spawns a new `ClientHandler` thread to handle communication with that client. Each `ClientHandler` thread listens for messages from its respective client and echoes them back.
