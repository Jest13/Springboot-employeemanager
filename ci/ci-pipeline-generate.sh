#!/bin/sh

ytt -f pipeline-template.yml -f pipeline-configs.yml >pipe-generated.yml
