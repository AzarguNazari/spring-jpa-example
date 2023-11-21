#!/bin/bash
download_directory="./performance-test/"  # Replace with your desired directory path

username="user"
password="b67cdfab-e986-4209-936a-5d2182df1656"

while true; do
  wget -r -N -c --no-parent -P "$download_directory" --http-user="$username" --http-password="$password" http://localhost:8080/?continue
done
