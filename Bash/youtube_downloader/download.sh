#!/bin/bash
while IFS= read -r line; do
    echo "Processing line: $line"
    yt-dlp $line
done < "videos.txt"