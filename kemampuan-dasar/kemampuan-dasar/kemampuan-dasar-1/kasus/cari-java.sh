#!/bin/bash

for f in $(sudo find / -type f -name "*.java") 
do
echo "Ada file Java pada direktori $f" 
done