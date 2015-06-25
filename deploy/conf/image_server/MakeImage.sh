#!/bin/bash

CONVERT=/usr/local/bin/convert
IDENTIFY=/usr/local/bin/identify

CMD="$CONVERT $2  -resize $1> -strip -quality 80 $3"

CONVERT_NORMAL="$CONVERT $1 $2"

GIF_CMD="$CONVERT $2  -coalesce -bordercolor LightSteelBlue -border 0 -resize $1 -layers Optimize $3"

#echo $CMD


case "$4" in
  gif|GIF)
     $GIF_CMD
        ;;
  *)
     $CMD
esac



