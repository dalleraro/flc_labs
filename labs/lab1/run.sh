#!/bin/bash

echo
echo "executing jflex:"
jflex lab1es2.jflex
echo
echo "compiling Java Class:"
javac Lab1Es2.java
echo
echo "executing program:"
java Lab1Es2 "es1-2/example.txt"
