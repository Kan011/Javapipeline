FROM openjdk:8

#copies the contents of your project's output directory
#(in this case, the main class HelloWorld.class from /out/production/DockerHelloJava/) to the /tmp directory in the container
COPY ./target/classes/ /tmp

#Docker runs the java HelloWorld command from inside the /tmp directory
WORKDIR /tmp
ENTRYPOINT ["java","org.example.PipelineTest"]
