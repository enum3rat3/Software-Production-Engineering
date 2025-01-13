#!/bin/bash

for i in {1..10}
do
   docker container start user$i
done
