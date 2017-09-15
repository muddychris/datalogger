#!/bin/bash

curl http://localhost:9000/datalogger/datafeed -X POST -H "Content-Type: application/json" -d @$1
