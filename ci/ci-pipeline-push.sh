#!/bin/sh

fly -t pso-sisp-bipe sp -p pr021-ip-base -c pipe-generated.yml -l pipe-vars.yml
