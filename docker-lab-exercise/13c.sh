#!/bin/bash

for i in {1..10}
do
   docker container create --name user$i  ubuntu:latest
done
