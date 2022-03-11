FROM            node:10
RUN             mkdir /app
WORKDIR         /app
ADD             server.js .
ADD             package.json .
RUN             npm install

