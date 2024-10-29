FROM golang:1.16 as builder

WORKDIR /go/src/
COPY ./src/main.go ./
RUN GOOS=linux CGO_ENABLED=0 go build main.go

FROM scratch
WORKDIR /go/
COPY --from=builder /go/src /go
CMD ["/go/main"]