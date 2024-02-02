# Use the official Node.js image
FROM node:latest

# Set the working directory in the container
WORKDIR /usr/src/app

# Copy package.json and package-lock.json to the working directory
COPY package*.json ./

# Install dependencies
RUN npm install

# Copy the application files to the working directory
COPY . .

# Expose the port that the app will run on
EXPOSE 3000

# Command to run the application
CMD ["node", "index.js"]
