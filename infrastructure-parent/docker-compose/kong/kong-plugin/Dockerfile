#FROM kong:2.3.3-alpine
FROM kong:2.0.3-alpine

USER root
RUN apk update && apk add git unzip luarocks


#RUN git clone https://github.com/alcirBarros/kong-plugin-helloworld.git \
# && cd kong-plugin-helloworld \
# && luarocks make


USER kong
