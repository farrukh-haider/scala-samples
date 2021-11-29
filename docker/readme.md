# Containerization of scala project

## Commands

```bash
# build an docker image
sbt docker:publishLocal

# check the docker image
docker images

# run the image
docker run --rm hello-docker:0.1.0-SNAPSHOT

```

